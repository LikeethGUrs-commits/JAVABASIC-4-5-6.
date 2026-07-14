import java.util.Scanner;
public class userarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("the size  is that : ");
        int n = sc.nextInt();

        //to  obtain the size fomr the uesr
        int arr[]=new int[n];

        /////input values
        System.out.println("enter the " + n + " Values ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the output is : ");
        for (int i:arr){
            System.out.print( i+" " );
        }

    }
}
