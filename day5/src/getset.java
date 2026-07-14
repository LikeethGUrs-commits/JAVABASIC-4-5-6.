public class getset {
    private String name;
    private int age;
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }else System.out.println("invalid age");
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
