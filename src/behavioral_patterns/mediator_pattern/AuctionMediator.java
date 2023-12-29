package behavioral_patterns.mediator_pattern;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int BidAmount);
}
