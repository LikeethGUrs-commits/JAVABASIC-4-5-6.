public class contest {
    String name;
    int age;

    contest() {
        name = "Unknown";
        age = 0;
    }

    contest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        contest s1 = new contest();
        contest s2 = new contest("Ramu", 23);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}