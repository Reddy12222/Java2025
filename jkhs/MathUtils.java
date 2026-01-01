//Static method add(int a, int b)
//
//Non-static method multiply(int a, int b)
//
//Task:
//Call both methods correctly from main().
public class MathUtils {

    static void add(int a, int b) {
        System.out.println(a+b);
    }

    public int multiply(int a, int b) {
        int multi =  a * b;
        return multi;


    }

    public static void main(String[] args) {
        MathUtils cc = new MathUtils();
        int result = cc.multiply(2,5);
        System.out.println(result);

        MathUtils.add(3,5);
    }


}


//🧠 Interview One-Line Explanation
//
//“Static methods belong to the class and can be called without an object.
//Non-static methods belong to objects, so an instance is required.”