package io.alexmcelroy.neuratrade.tracking;

import java.util.Date;

/**
 *  Data structure for storing the User's preferences and past trades.
 *
 *  pending_orders: Orders that have been sent to Coinbase and are awaiting fulfillment (always SELL)
 *  active_orders: Orders that have been completed and waiting to be sold (always SELL)
 *  completed_orders: Orders that have been bought for a net reinvestment (always BUY)
 */
public class Tracker {

    //Max cash volume the user is willing to trade
    int SPECIFIED_RISK;
    int MINIMUM_PERCENT_GAIN_PER_ORDER;

    Order[] pending_orders;
    Order[] active_orders;
    Order[] completed_orders;


    /**
     * Returns a Tracker instance that contains all the Bot's records for the user with the specified index
     * Throws an Error if no .csv file is found or cannot parse it
     *
     *
     * Algorithm:
     *      1) Retrieve the .csv file that represents the specified user
     *      2) Iterate through the rows to retrieve the previous actions of the Bot
     *      3) Create a new instance of Tracker
     *      4) Update and Return
     *
     */
    public static Tracker fetchByUserIndex(String idx) {
        return new Tracker();
    }


    /**
     * Uses the SPECIFIED_RISK to determine whether the user in a position to purchase or sell more Crypto
     */
    public boolean canTrade(){
        return true;
    }


    /**
     * Returns the total profit by iterating through the completed orders and summing the profits from each
     */
    public double securedGains(Date start, Date end){
        return 0.0;
    }


    /**
     * Performs an update to verify that all the orders are up to date with Coinbase. For example, The bot may be
     * stopped for a few days then started again. In that lag time, one of the active orders may have been completed.
     *
     * Throws an error if unable to verify with Coinbase
     */
    public void update() {

    }
}




