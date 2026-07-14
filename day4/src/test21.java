public class test21 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd =0;
        for (int num : arr) {
            if ((num % 2) == 0) {
                System.out.println("te evne numbers are : "+num);
               even++;

            }else{
                System.out.println("the odd ARE "+num);
                odd++;
            }


        }
        System.out.println("the number are even are : " + even);
        System.out.println("the number are odd are : " + odd);
    }
}