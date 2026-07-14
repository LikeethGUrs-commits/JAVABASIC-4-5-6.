 public interface abstrac {
     void man();

}
class dog implements abstrac{
    @Override
    public void man(){
        System.out.println("the thing is shouting  ");

    }
}
class cat extends dog{
     @Override
     public void man() {
         System.out.println("the thing is shouting .......... ");

     }
 }
class inde{
    public static void main(String[] args) {
        abstrac lo =new dog();
        dog loq =new cat();
        lo.man();
    }
}