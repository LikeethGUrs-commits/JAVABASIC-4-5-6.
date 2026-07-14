import java.util.Arrays;
public class bigg {
    public static void main(String[] args) {
        int arr[] = {12, 56, 99, 74, 65};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int highest = arr[arr.length - 1];
        int hiest = arr[0];
        System.out.println("Highest value: " + highest);
        System.out.println("Highest value: " + hiest);

        }
    }
