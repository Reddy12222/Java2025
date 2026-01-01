public class Company {
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

     private String employeeName;
    static String companyName = "fiserv";

    public Company(String mk) {
        this.employeeName = mk;

    }

    public void display() {
        System.out.println("Company name: " + Company.companyName);
        System.out.println("Employee name: " + this.employeeName);
        this.employeeName = "aryan";


        Company cc= new Company("niki");
        System.out.println("testtt employee name: " + cc.employeeName);

    }

    public static void main(String[] args) {
        Company cc= new Company("niki");
        System.out.println("test employee name: " + cc.employeeName);



         cc.display();
        cc.display();
        System.out.println();




//        System.out.println();
    }
}