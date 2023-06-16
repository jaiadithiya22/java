import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // Corrected the array initialization
        numbers[0] = 1;
        numbers[4] = 8;  // Changed index 5 to index 4 since arrays are zero-indexed
        System.out.println(Arrays.toString(numbers));
    }
}
