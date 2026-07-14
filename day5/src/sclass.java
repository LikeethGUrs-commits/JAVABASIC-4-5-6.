public class sclass {
    String name;
    int age;
    int marks;


    public void displayDetails() {
        System.out.println("Name of the student  : " + name);
        System.out.println("Age  of the student  : " + age);
        System.out.println("Marks of the student: " + marks);
    }

    public static void main(String[] args) {

        sclass mynew = new sclass();
        sclass mynew1 = new sclass();

        mynew.name = "Tony GH";
        mynew.age = 22;
        mynew.marks = 88;

        mynew1.name = "Jack K";
        mynew1.age = 20;
        mynew1.marks = 85;

        System.out.println(".................................");

        System.out.println("Student 01 Details");
        System.out.println("-------------------");
        mynew.displayDetails();
        System.out.println("..................................");

        System.out.println("Student 02 Details");
        System.out.println("-------------------");
        mynew1.displayDetails();
    }
}