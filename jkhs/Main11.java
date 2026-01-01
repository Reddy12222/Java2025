import java.util.List;

public class Main11 {
    int left;
    int right;
    static int  middle = 100;

    public Main11(){

    }
    public Main11(int x, int y){
        this.left = x+5;
        this.right = y;
        middle = middle + 6;
    }

    public Main11(int right, int left, int middle) {
        this.right = right+5;
        this.left = left;
        this.middle = middle;
    }

    public static int sumIntegers(int a, int b){
        return a+b;
    }
    public static void printNumbers(int a, int b){
        for(int i = a; i<=b; i =i+2) {
            System.out.println(i);
        }

//        return a+b;
    }
    public static boolean testIntegers(int a, int b){
//        if(a>b){
//            return true;
//        } else{
//            return  false;
//        }
        return a > b ;
    }
    public String fullName(String firstName, String lastName){
            return firstName.trim() +lastName;

    }
    public static void main(String[] args) {
        System.out.println(Main11.middle);

        Main11 vv = new Main11(3,5);
        Main11 vv2 = new Main11(3,5);

        System.out.println(Main11.middle);
        Main11.printNumbers(5,10);

        //int cc = vv.sumIntegers(24,6);

//        String cc = vv.fullName("nikhitha  " ,  "reddy");

//        System.out.println(vv.left);
//        System.out.println(vv.right);



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
    }
}

