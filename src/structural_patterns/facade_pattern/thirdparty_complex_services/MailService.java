package structural_patterns.facade_pattern.thirdparty_complex_services;

public class MailService {

    public void sendConfirmationMail(User user) {
        System.out.println("Sending mail to " + user.name());
    }

}