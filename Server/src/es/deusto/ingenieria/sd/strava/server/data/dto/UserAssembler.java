package es.deusto.ingenieria.sd.strava.server.data.dto;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.domain.User;

//This class is part of the DTO pattern. It also implements Singleton Pattern.
public class UserAssembler {
	private static UserAssembler instance;

	private UserAssembler() { }
	
	public static UserAssembler getInstance() {
		if (instance == null) {
			instance = new UserAssembler();
		}

		return instance;
	}

	public UserDTO userToDTO(LocalUser user) {
		UserDTO dto = new UserDTO();
		
		dto.setEmail(user.getEmail());
		dto.setName(user.getName());
		
		return dto;
	}
	
	public User userDTOToUser(UserDTO userDTO) {
		User user = new User(); 
		
		user.setType(userDTO.getType());
		user.setEmail(userDTO.getEmail());
		user.setName(userDTO.getName());
		user.setBirthDate(userDTO.getBirthDate());
		user.setWeight(userDTO.getWeight());
		user.setHeight(userDTO.getHeight());
		user.setFreq(userDTO.getFreq());
		user.setMaxFreq(userDTO.getMaxFreq());
		user.setRestFreq(userDTO.getRestFreq());
		
		return user;
	}
}