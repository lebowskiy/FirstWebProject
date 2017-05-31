package by.htp.sporteq.service;

import by.htp.sporteq.entity.User;

public class UserServiceImpl  implements UserService{

	@Override
	public User authorize(String login, String pass) throws NoSuchUserException {
		User user;
		if("user".equals(login) && "user".equals(pass)) {
			user = new User();
			user.setLogin(login);
			user.setRole(false);
		} else if ("admin".equals(login) && "admin".equals(pass)){
			user = new User();
			user.setRole(true);
		} else {
			throw new NoSuchUserException("Invalid credentials");
		}
		
		return user;
	}

	@Override
	public boolean logOut(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
