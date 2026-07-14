import java.util.Arrays;
import java.util.Collections;
public class REVERSE {
    public static void main(String[] args) {
        Integer[] arr = {12, 56, 99, 74, 65};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        }
    }
