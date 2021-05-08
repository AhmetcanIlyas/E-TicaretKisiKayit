package homeworkDay5.core.concretes;

import homeworkDay5.google.GoogleService;

public class GoogleAdapter implements GoogleService{

	GoogleAdapter googleadapter = new GoogleAdapter();
	
	public void loginGoogle(String mail, String password) {
		googleadapter.registerGoogle(mail, password);
	}
		
	public void registerGoogle(String mail, String password) {
		googleadapter.registerGoogle(mail, password);
	}
}
