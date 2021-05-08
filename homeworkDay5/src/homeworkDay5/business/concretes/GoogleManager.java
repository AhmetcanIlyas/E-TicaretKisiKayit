package homeworkDay5.business.concretes;

import homeworkDay5.google.GoogleService;

public class GoogleManager implements GoogleService{

	@Override
	public void loginGoogle(String mail, String password) {
		System.out.println("Google ile giris yapildi: " + mail);
		
	}

	@Override
	public void registerGoogle(String mail, String password) {
		System.out.println("Google ile kayit olundu: " + mail);
		
	}

	

}
