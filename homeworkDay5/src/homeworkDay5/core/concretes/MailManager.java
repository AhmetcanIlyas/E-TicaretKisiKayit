package homeworkDay5.core.concretes;

import homeworkDay5.core.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail(String email) {
		System.out.println("Dogrulama metini maile yollandi." + email);
		
	}

}
