import java.util.HashSet;
import java.util.Set;

public class GameState {
    private Set<String> left;
    private Set<String> right;
    private boolean boatOnLeft;

    public void gameState() {
        left = new HashSet<>();
        right = new HashSet<>();
        left.add("wolf");
        left.add("goat");
        left.add("cabbage");
        boatOnLeft = true;
    }

    public boolean moveItem(String item) {
        item = item.toLowerCase();
        //move boat alone
        if (item.equals("alone")) {
            boatOnLeft = !boatOnLeft;
            return isValidState();
        }
        Set<String> from = boatOnLeft ? left : right;
        Set<String> to = boatOnLeft ? right : left;

        if (!from.contains(item)) {
            return false;
        }
        from.remove(item);
        to.add(item);
        boatOnLeft = !boatOnLeft;
        return isValidState();

    }

    private boolean isValidState() {
        // If boat is on right, left side is unattended
        if (!boatOnLeft) {
            if (left.contains("wolf") && left.contains("goat")) return false;
            if (left.contains("goat") && left.contains("cabbage")) return false;
        }

        // If boat is on left, right side is unattended
        if (boatOnLeft) {
            if (right.contains("wolf") && right.contains("goat")) return false;
            if (right.contains("goat") && right.contains("cabbage")) return false;
        }
        return true;

    }

    public boolean isSolved() {
        return right.contains("wolf") &&
                right.contains("goat") &&
                right.contains("cabbage");
    }
}
//void main() {
//}
