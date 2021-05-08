package homeworkDay5.dataAcces.concretes;

import java.util.List;

import homeworkDay5.dataAcces.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " adli kullanici Hibernate ile eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adli kullanici Hibernate ile silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " adli kullanici Hibernate ile guncellendi");
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public User getByMail(String email) {
		List<User> users = getAll();
		if(users != null) {
			for (User user : users) {
				return user;
			}
		}
		return null;
	}

}
