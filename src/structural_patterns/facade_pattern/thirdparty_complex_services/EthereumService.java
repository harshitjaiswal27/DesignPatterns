package structural_patterns.facade_pattern.thirdparty_complex_services;

public class EthereumService extends CryptoService {

    @Override
    public void buyCurrency(User user, double amount) {
        System.out.println("Buying " + amount + " of Ethereum...");
    }

}