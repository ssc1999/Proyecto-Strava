package es.deusto.ingenieria.sd.strava.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.strava.server.data.domain.Session;

public class SessionAssembler {

	private static SessionAssembler instance;
	
	private SessionAssembler() { }
	
	public static SessionAssembler getInstance() {
		if (instance == null) {
			instance = new SessionAssembler();
		}
		
		return instance;
	}

	public SessionDTO sessionToDTO(Session session) {
		SessionDTO dto = new SessionDTO();		
		dto.setTittle(session.getTittle());
		return dto;
	}

	public List<SessionDTO> listSessionsToDTO(List<Session> listSessions) {		
		List<SessionDTO> listSessionsDTO = new ArrayList<>();
		
		for	(Session session : listSessions) {
			listSessionsDTO.add(this.sessionToDTO(session));
		}
		return listSessionsDTO;
	}
	
	public Session sessionDTOToSession(SessionDTO sessionDTO) {
		Session session = new Session();
		
		session.setTittle(sessionDTO.getTittle());
		session.setSport(sessionDTO.getSport());
		session.setDistance(sessionDTO.getDistance());
		session.setiDate(sessionDTO.getiDate());
		session.setiHour(sessionDTO.getiHour());
		session.setDuration(sessionDTO.getDuration());
		
		return session;
	}
	
	public List<Session> listSessionsDTOToListSessions(List<SessionDTO> listSessionsDTO){
		List<Session> listSessions = new ArrayList<>();
		
		for	(SessionDTO sessionDTO : listSessionsDTO) {
			Session session = new Session();

			session.setTittle(sessionDTO.getTittle());
			session.setSport(sessionDTO.getSport());
			session.setDistance(sessionDTO.getDistance());
			session.setiDate(sessionDTO.getiDate());
			session.setiHour(sessionDTO.getiHour());
			session.setDuration(sessionDTO.getDuration());
			
			listSessions.add(session);
		}
		return listSessions;
	}
	
}
