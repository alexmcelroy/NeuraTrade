package io.alexmcelroy.neuratrade.tracking;


/**
 * Data Structure so store information about an order the bot performed.
 *
 * An Order can only go in the sequence SELL -> BUY
 * Thus the states are as follows:
 *
 * pending: The Order has been initialize and awaiting the sell request to coinbase
 * active: The sell request was fulfiulled and the order is waiting for a successful reinvestment
 * complete: The buy request for volume was complete for a net gain of crypto
 *
 * state: The current state of the order. Can only go in the order Pending -> Active -> Completed
 * cryptocurrency: the type of crypto
 * volume: the amount of crypto purchased
 * value_at_purchase: the value of the specified crypto at purchase. This is the value of the limit buy
 * value_at_sell: the value of the specified crypto at sell.
 *
 *
 * Only available when the order is in the "Completed" state
 * percent_gain: calculated using value_at_purchase and value_at_sell
 * net_crypto_gain: ^
 * net_cash_gain: ^
 */
public class Order {

    Cryptocurrency cryptocurrency;
    State state;

    double volume;
    double value_at_purchase;
    double value_at_sell;

    double percent_gain;
    double net_crypto_gain;
    double net_cash_gain;

    enum State {
        Pending,
        Active,
        Completed
    }


    enum Cryptocurrency{
        Bitcoin,
        BitcoinCash,
        Etherium,
        EtheriumClassic
    }


    /**
     * Completes the order by buying the volume specifed by "volume"
     */
    public void complete(){

    }

}
