package ait;

public class sample {
    String name;
    static String school=" the abc";
    sample(String s){
        name = s;
    }
    void show(){
        System.out.println("name : "+name);
        System.out.println("school :" +school);
        System.out.println(".............................");
    }

    static void main(String[] args) {
        sample s1 =new sample("xyz");
        s1.show();
        sample s2 =new sample("dfg");
        s2.show();
    }
}
