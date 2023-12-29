package behavioral_patterns.mediator_pattern;

public class Bidder implements Colleague{
    private final AuctionMediator auctionMediator;
    private final String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotificaion(int bidAmount) {
        System.out.println("Bidder "+name+" received the bid notification of amount: "+bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
