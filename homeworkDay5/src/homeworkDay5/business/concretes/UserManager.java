package homeworkDay5.business.concretes;

import homeworkDay5.business.abstracts.UserService;
import homeworkDay5.core.concretes.Control;
import homeworkDay5.core.concretes.MailManager;
import homeworkDay5.dataAcces.abstracts.UserDao;
import homeworkDay5.dataAcces.concretes.HibernateUserDao;
import homeworkDay5.entities.concretes.User;

public class UserManager implements UserService{
	
	private Control conrtol;
	public UserDao userDao = new HibernateUserDao();
	public Control control;
	public MailManager mailManager = new MailManager();
	public UserManager(UserDao userDao, Control control) {
		this.userDao=userDao;
		this.control=control;
	}
	
	@Override
	public void register(User user) {
		if(control.nameControl(user) == false) {
			System.out.println("Ad ve soyad en az iki karakter olmalidir");
		}else if(control.passwordControl(user) == false) {
			System.out.println("Parola en az 6 karakter olmalidir");
		}else if(control.emailControl(user) == false) {
			System.out.println("E-posta formatini kontrol ediniz");	
		}else {
			System.out.println("Yeni kullanici olusturuldu: " + user.getFirstName() + " " + user.getLastName());
			userDao.add(user);
			mailManager.sendMail(user.getEmail());
		}
		
	}

	@Override
	public void verifUser(User user) {
		
	}

	@Override
	public void login(User user, String mail, String password) {
		if(user.getEmail() == mail && user.getPassword() == password) {
			System.out.println("Giris yapildi!");
		}else {
			System.out.println("Bilgiler yanlis, kontrol ediniz!");
		}
		
	}

}
