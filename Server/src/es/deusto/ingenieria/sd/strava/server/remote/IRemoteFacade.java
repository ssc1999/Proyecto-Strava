package es.deusto.ingenieria.sd.strava.server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.domain.User;
import es.deusto.ingenieria.sd.strava.server.data.dto.SessionDTO;
import es.deusto.ingenieria.sd.strava.server.data.dto.UserDTO;


//This interface defines the API of the Server. It represents the Remote Facade pattern
public interface IRemoteFacade extends Remote {	

	public long login(String type, String email, String password) throws RemoteException;
	
	public boolean register(LocalUser user) throws RemoteException;
	
	public void logout(long token) throws RemoteException;
	
	public List<SessionDTO> getListSessions(long token) throws RemoteException;
	
	public SessionDTO getSession(long token, int id) throws RemoteException;
	
	public boolean addSession(long token, SessionDTO sessionDTO) throws RemoteException;

	public UserDTO getUser(long token) throws RemoteException;
	
//	public long login(String email, String password) throws RemoteException;
//	
//	public void logout(long token) throws RemoteException; 
//	
//	public List<CategoryDTO> getCategories() throws RemoteException;
//	
//	public List<ArticleDTO> getArticles(String aCategory) throws RemoteException;
//	
//	public boolean makeBid(long token, int article, float amount) throws RemoteException;
//	
//	public float getUSDRate() throws RemoteException;
//	
//	public float getGBPRate() throws RemoteException;	
	
}