package es.ficonlan.web.backend.model.userservice;

import java.util.List;

import es.ficonlan.web.backend.model.user.User;
import es.ficonlan.web.backend.util.exceptions.DuplicatedInstanceException;

/**
 * @author Daniel Gómez Silva
 * @version 1.0
 */
public interface UserService {

	public User addUser(long sessionId, String name, String login, String password, String dni, String email, String phoneNumber, int shirtSize) throws DuplicatedInstanceException;
	
	public List<User> getAllUsers(long sessionId);
	
}
