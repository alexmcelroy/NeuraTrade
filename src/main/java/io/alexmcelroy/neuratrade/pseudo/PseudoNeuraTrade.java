package io.alexmcelroy.neuratrade.pseudo;


/**
 * Not Official
 *
 * NeuraTrade Application
 *
 * Algorithm:
 *      1) Pull the saved Tracker using the user's index
 *      2) Call Tracker.update() to ensure that all the values are in agreement with the user's Coinbase account
 *      3) Initialize a TradingController using the now up to date Tracker
 *      4) Run the Trading Controller
 *
 * Current Assumptions
 *      1) Each user has a Tracker stored in the server somewhere.
 *
 */
public class PseudoNeuraTrade {

    public static void main(String args[]) {

    }
}
