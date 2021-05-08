package homeworkDay5.business.abstracts;

import homeworkDay5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void verifUser(User user);
	void login(User user, String mail, String password);
}
