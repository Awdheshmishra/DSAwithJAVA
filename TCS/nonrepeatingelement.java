package TCS;
import java.util.Arrays;
public class nonrepeatingelement {
    public static int firstNonRepeating(int[] arr) {
        int n = arr.length;

        // Loop for checking each element (left to right)
        for (int i = 0; i < n; i++) {

            // Check if current element
            // appears elsewhere in array
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    break;
            }

            // If no duplicate found, return this element
            if (j == n)
                return arr[i];
        }

        // If all elements repeat, return 0
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        System.out.println(firstNonRepeating(arr));
    }
}
