public class rect {
    int len;
    int bre;

    rect(int len,int bre){
        this.len = len;
        this.bre = bre;
    }
    public void display() {
        System.out.println("teh length is  : " + len);
        System.out.println("the bredth is  : " + bre);
        System.out.println(len*bre);
    }
    public static void main(String[] args) {

        rect e2 = new rect(25, 50);


        e2.display();


    }



}
