import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<String[]> readMovesFromCsv(String fileName) {
        List<String[]> sequences = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] moves = line.split(",");
                for (int i = 0; i < moves.length; i++) {
                    moves[i] = moves[i].trim();
                }
                sequences.add(moves); // ✅ String[] into List<String[]>
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sequences;
    }
}
