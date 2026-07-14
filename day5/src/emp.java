public class emp {
    String name;
    double salary;


    emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {

        emp e1 = new emp("Ramu", 50000);
        emp e2 = new emp("Sita", 65000);


        e1.display();
        System.out.println();
        e2.display();
    }
}