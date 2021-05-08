package homeworkDay5.dataAcces.abstracts;

import java.util.List;

import homeworkDay5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByMail(String email);
	List<User> getAll();
}
