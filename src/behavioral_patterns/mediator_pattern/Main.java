package behavioral_patterns.mediator_pattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Bidder bidder1 = new Bidder(auctionMediator, "Alan");
        Bidder bidder2 = new Bidder(auctionMediator, "Alex");
        Bidder bidder3 = new Bidder(auctionMediator, "Andrew");
        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);
        auctionMediator.addBidder(bidder3);
        bidder1.placeBid(10000);
        bidder2.placeBid(12000);
        bidder1.placeBid(14000);
        bidder3.placeBid(15000);
    }
}
