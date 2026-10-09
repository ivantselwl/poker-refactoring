package lab.poker;
import java.util.List;
import static lab.poker.HandType.STRAIGHT_FLUSH;

/** House rule: a straight flush or a full house earns a bonus. */
public class BonusPolicy {
    private final PokerHandEvaluator evaluator = new PokerHandEvaluator();
    public boolean qualifies(List<Card> hand) {
        return evaluator.classify(hand) == STRAIGHT_FLUSH || evaluator.isFullHouse(hand);
    }
}
