package behavioral_patterns.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    private final List<Colleague> bidders = new ArrayList<>();
    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague: bidders)
            if(!bidder.getName().equals(colleague.getName()))
                colleague.receiveBidNotificaion(bidAmount);
    }
}
