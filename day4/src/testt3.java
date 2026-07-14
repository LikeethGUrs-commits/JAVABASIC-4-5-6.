import java.util.Scanner;
public class testt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter the number of choice : ");
            int num = sc.nextInt();

            if(num!=0){
                System.out.println("the number is valid"+num);
            }else{
                System.out.println("the number is in valid :"+num);
                break;
            }

        }
        System.out.println("the printed number is that : ");

        //th........................

        for (int j=1;j<=20;j++){
            if((j%3)==0){

                continue;
            }
            System.out.println("the out of this is : "+j);
        }
    }
}
