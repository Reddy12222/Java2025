public class Validator {

    public boolean validateGame(String[] moves) {
        GameState gameState = new GameState();

        for (String move : moves) {
            move = move.trim().toLowerCase();
            if (!gameState.moveItem(move)) {
                 // 👈 HERE
                return false;
            }
        }

        return gameState.isSolved();
    }
}
