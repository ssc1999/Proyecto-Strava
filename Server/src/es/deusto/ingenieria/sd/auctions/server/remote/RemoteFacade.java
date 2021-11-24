package es.deusto.ingenieria.sd.auctions.server.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.deusto.ingenieria.sd.auctions.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.auctions.server.data.domain.Session;
import es.deusto.ingenieria.sd.auctions.server.data.domain.User;
import es.deusto.ingenieria.sd.auctions.server.data.dto.SessionAssembler;
import es.deusto.ingenieria.sd.auctions.server.data.dto.SessionDTO;
import es.deusto.ingenieria.sd.auctions.server.services.LoginService;
import es.deusto.ingenieria.sd.auctions.server.services.SessionService;

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
	public synchronized boolean register(LocalUser user){		
		LocalUser userTemp = user;
		
		if(userTemp == null) {
			System.out.println("User registered: " + user.toString());
		}
		new RemoteException("User i");
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
	
	public User getUser(long token) {
		if(this.serverState.containsKey(token)) {
			User user = this.serverState.get(token);
			return user;
		}
		new RemoteException("User not found!");
		return null;
	}
	
}
