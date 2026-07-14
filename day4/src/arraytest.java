public class arraytest {
    public static void main(String[] args) {
        int marks[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : marks) {
            sum += num;
        }
        System.out.println("the out of this sum is  : " +sum);
    }


}