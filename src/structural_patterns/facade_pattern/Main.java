package structural_patterns.facade_pattern;

import structural_patterns.facade_pattern.thirdparty_complex_services.*;

public class Main {
    public static void main(String[] args) {
        //Without Facade
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());
        CryptoFactory.getCryptoService("BTC").buyCurrency(user,1.0);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);

        //With Facade Pattern
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.buyCryptocurrency(1.0,"ETH");
    }
}
