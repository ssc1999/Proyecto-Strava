package es.deusto.ingenieria.sd.strava.server.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.domain.Session;
import es.deusto.ingenieria.sd.strava.server.data.domain.User;
import es.deusto.ingenieria.sd.strava.server.data.dto.SessionAssembler;
import es.deusto.ingenieria.sd.strava.server.data.dto.SessionDTO;
import es.deusto.ingenieria.sd.strava.server.data.dto.UserAssembler;
import es.deusto.ingenieria.sd.strava.server.data.dto.UserDTO;
import es.deusto.ingenieria.sd.strava.server.services.LoginService;
import es.deusto.ingenieria.sd.strava.server.services.SessionService;

public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade {	
	private static final long serialVersionUID = 1L;

	//Data structure for manage Server State
	private Map<Long, User> serverState = new HashMap<>();

	//TODO: Remove this instances when Singleton Pattern is implemented
	private LoginService loginService = new LoginService();
	private SessionService sessionService = new SessionService();

	public RemoteFacade() throws RemoteException {
		super();		
	}
	
	@Override
	public synchronized long login(String type, String email, String password) throws RemoteException {
		System.out.println(" * RemoteFacade login(): " + email + " / " + password);
				
		//Perform login() using LoginAppService
		User user = loginService.login(type, email, password);
			
		//If login() success user is stored in the Server State
		if (user != null) {
			//If user is not logged in 
			if (!this.serverState.values().contains(user)) {
				Long token = Calendar.getInstance().getTimeInMillis();		
				this.serverState.put(token, user);		
				return(token);
			} else {
				throw new RemoteException("User is already logged in!");
			}
		} else {
			throw new RemoteException("Login fails!");
		}
	}
	
	@Override
	public synchronized boolean register(String type, String name, String email, String password, double weight, double height, String birthdate, int freq, int maxFreq, int restFreq){		
		LocalUser user = new LocalUser(type, name, email, password, weight, height, birthdate, freq, maxFreq, restFreq, null);
		
		if(user != null) {
			System.out.println("User registered: " + user.toString());
		}
		new RemoteException("Error registering the user!");
		return false;
	}
	
	@Override
	public synchronized void logout(long token) throws RemoteException {
		System.out.println(" * RemoteFacade logout(): " + token);
		
		if (this.serverState.containsKey(token)) {
			//Logout means remove the User from Server State
			this.serverState.remove(token);
		} else {
			throw new RemoteException("User is not logged in!");
		}
	}
	
	@Override
	public List<SessionDTO> getListSessions(long token) throws RemoteException{
		System.out.println(" * RemoteFacade getListSessions()");
		
		List<Session> listSessions = sessionService.getListSessions(token);
		
		if(listSessions != null) {
			return SessionAssembler.getInstance().listSessionsToDTO(listSessions);
		}else {
			throw new RemoteException("getListSessions failed!");
		}
	}
	
	@Override
	public SessionDTO getSession(long token, int id) throws RemoteException{
		System.out.println(" * RemoteFacade getSession()");
		
		Session session = sessionService.getSession(token, id);
		if(session != null){
			return SessionAssembler.getInstance().sessionToDTO(session);
		}else{
			throw new RemoteException("Session not found!");
		}
	}
	
	@Override
	public boolean addSession(long token, SessionDTO sessionDTO) {
		System.out.println(" * RemoteFacade addSession()");
		
		Session session = SessionAssembler.getInstance().sessionDTOToSession(sessionDTO);
		if(this.serverState.containsKey(token)) {
			
			if(sessionService.addSession(token, session)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public UserDTO getUser(long token) {
		if(this.serverState.containsKey(token)) {
			User user = this.serverState.get(token);
			UserDTO userDTO = UserAssembler.getInstance().userToDTO((LocalUser) user);
			return userDTO;
		}
		new RemoteException("User not found!");
		return null;
	}
	
}
