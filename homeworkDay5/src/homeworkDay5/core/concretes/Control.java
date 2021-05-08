package homeworkDay5.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeworkDay5.core.abstracts.MailService;
import homeworkDay5.dataAcces.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class Control {
	
	private final MailService mailService;
	public Control(MailService mailService) {
		this.mailService=mailService;
	}
	public static boolean passwordControl(User user) {
		
		if(user.getPassword().length() >= 6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean nameControl(User user) {
		if(user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean usedMailCheck(String email, UserDao userDao) {
		if(userDao.getByMail(email) != null) {
			System.out.println("Bu mail adresi daha once kullanilmis");
			return true;
		}else {
			return false;
		}
		
	}
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public static boolean emailControl(User user) {
	Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher(user.getEmail());
	return matcher.find();
	}
	
}
