package homeworkDay5;

import homeworkDay5.business.concretes.GoogleManager;
import homeworkDay5.business.concretes.UserManager;
import homeworkDay5.core.concretes.Control;
import homeworkDay5.core.concretes.MailManager;
import homeworkDay5.dataAcces.concretes.HibernateUserDao;
import homeworkDay5.entities.concretes.GoogleUser;
import homeworkDay5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		GoogleUser googleUser = new GoogleUser(1, "example@gmail.com", "121212");
		User user = new User(1, "Ahmetcan", "Ilyas", "example2@gmail.com", "232323");
		User user2 = new User(2,"Engin", "Demirog", "example3@gmail.com", "565656");
		GoogleManager googleManager = new GoogleManager();
		UserManager userManager = new UserManager(new HibernateUserDao(), new Control(new MailManager()));
		userManager.register(user);
		userManager.register(user2);
		googleManager.registerGoogle("example3@gmail.com", "45454545");
		
		userManager.login(user, "example2@gmail.com", "232323");
		googleManager.loginGoogle("example@gmail.com", "121212");
		
	}

}
