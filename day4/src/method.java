public class method {
    public static void newarr(int[] arr) {
        arr[0]=arr[0]+10;

    }
    public static void main(String[] args) {
        int array[]={10,20,30,40};
        newarr(array);
        System.out.println(array[0]);
    }
}
