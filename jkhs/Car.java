public class Car {
    static int count =0;

    public Car() {
        count++;

    }

public static void main(String[] args) {
    Car cc1 = new Car();
    Car cc2 = new Car();

    System.out.println(" count: " + Car.count);


}
}