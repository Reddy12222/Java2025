public class Employee {
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee name: " + name);

    }
    public static void main(String[] args) {
        Employee t1 = new Employee(1, "bun");
        t1.display();
//        System.out.println();
    }
}
