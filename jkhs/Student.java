public class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public void printDetails(){
//        System.out.println("Student Details: " + id +" "+ name);
//        System.out.println("Student details22: " + id + " "+ name + " "+ course);
//
//        System.out.println("-----above prints null----");

        System.out.println("Id:" + id);
        System.out.println("name: " + name);

        if (course != null){
            System.out.println("course: " + course);
        }
        System.out.println("---------");

    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "kanika");
        Student s2 = new Student(2, "manisha", "CSE");

        s1.printDetails();
        s2.printDetails();
//        System.out.println();
    }
}




//Interview Explanation (Say This)
//
//“I used constructor overloading to allow object creation with different parameter sets.
//I also handled optional fields safely to avoid null values.”