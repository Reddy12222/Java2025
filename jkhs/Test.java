public class Test {
    static int x = 10;

    Test(){
        x++;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Company cc= new Company("niki");
        System.out.println("testtt employee name: " + cc.getEmployeeName());

        System.out.println(Test.x);
    }
}
