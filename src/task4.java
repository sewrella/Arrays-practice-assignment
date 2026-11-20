
public class task4 {
    public static void main(String[] args) {

        int[] numbers = {3, 8, 12, 5, 9, 2, 7};

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nReversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
