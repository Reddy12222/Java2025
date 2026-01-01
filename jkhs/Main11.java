//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        CsvReader csvReader = new CsvReader();
//        List<String[]> moveSequences = csvReader.readMovesFromCsv(
//                "C:/Users/nikit/Desktop/RealProjects/resources/game_moves.csv"
//        );
//
//        System.out.println("Sequences read = " + moveSequences.size());
//        System.out.println("Working directory = " + System.getProperty("user.dir"));
//
//        Validator validator = new Validator();
//
//        for (int i = 0; i < moveSequences.size(); i++) {
//            boolean isValid = validator.validateGame(moveSequences.get(i));
//            System.out.println("Sequence " + (i + 1) + "is " + (isValid ? "valid " : "invalid"));
//        }
//    }
//}
//
