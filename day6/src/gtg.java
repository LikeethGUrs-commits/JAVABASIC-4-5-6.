interface gtgInterface {
}

class Student implements gtgInterface {

    void display() {
        System.out.println("Student is using gtg interface");
    }

}

public class gtg {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();

    }
}
