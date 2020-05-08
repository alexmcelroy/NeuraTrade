package io.alexmcelroy.neuratrade.controller;

import io.alexmcelroy.neuratrade.tracking.Tracker;

/**
 *
 * Goals of algorithm:
 *      Very little risk to use. All risk is handled by initial investment and then it only survives off reinvestment
 *      from its own gains
 *
 *      Performs well under periodic conditions. It is assumed that the user will have some Bitcoin not intended for
 *      trading. That will do well if a crypto spikes to high numbers. Thus, the goal of this algorithm is to take
 *      advantage of when a crypto is in periodic motion.
 *
 *      Increase your Crypto Volume.
 *
 *
 *  Insight behind algorithm:
 *
 *      You total gains is the performance of all your trades. Thus this algorithm forces each trade to be successful.
 *
 *      As the algorithm makes more reinvestments, it gains volume of crypto to work with. You want the crypto to
 *      follow a periodic motion because that provides many opportunities for reinvestment. This is ideal for when a crypto is
 *      "testing" the waters at certain levels.
 *
 *      If the neural net worked perfectly, the sequence of actions will always be BUY -> SELL -> BUY -> SELL -> BUY -> SELL ....
 *      If the sequence has a BUY followed by another BUY there is an opportunity cost because the second BUY should have been purchased  with the fist
 *      If the sequence has a SELL followed by another SELL there is an opportunity cost because the first sell should have been sold with the second
 *
 *      The idea is to force each Order to follow the pattern SELL -> BUY for a positive reinvestment
 *
 *      If you start the algorithm with only a reinvestment you are guaranteed to not lose any money. Work case scenario your
 *      reinvestment goes to zero.
 *
 *  Algorithm:
 *
 *      1) The user specifies an initial risk they are willing to take in cyptyo, Call it "RISK". The user also
 *          specifies a frequency, call it "FREQ".
 *
 *      2) The algorithm listens to the neural net for a SELL suggestion. Once it hears it, it sells all of RISK
 *
 *      3) On Sell, the algorithm sells all the volume specified in RISK and patiently waits until the crypto's price drops
 *          FREQ percent. Once it does, the algorithm performs a BUY of Volume RISK. Now the algorithm has (1 + FREQ) * RISK
 *          crypto to work with. So, RISK = (1 + FREQ) * RISK
 *
 *      4) While true:
 *          a) if the neural net suggests a SELL and the total amount sold by the algorithm < RISK, create a new Order instance for a sell of volume FREQ * RISK
 *          b) if the neural net suggests a BUY, iterate through the active sell orders, if any would result in a successful
 *              reinvestment larger than FREQ. Purchase and mark the order as complete. RISK = (1 + FREQ) * RISK
 *
 *
 */
public class TradeController {

    public static void run(Tracker tracker){

    }
}
