package behavioral_patterns.mediator_pattern;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotificaion(int bidAmount);
    String getName();
}
