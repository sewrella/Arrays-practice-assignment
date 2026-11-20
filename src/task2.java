public class task2 {
        public static void main(String[] args) {

            int[] numbers = {12, 5, 28, 3, 19, 7, 15, 9};

            int largest = numbers[0];
            int smallest = numbers[0];

            int largestIndex = 0;
            int smallestIndex = 0;

            for (int i = 1; i < numbers.length; i++) {

                if (numbers[i] > largest) {
                    largest = numbers[i];
                    largestIndex = i;
                }

                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                    smallestIndex = i;
                }
            }

            System.out.print("Array: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\nLargest: " + largest + " at index " + largestIndex);
            System.out.println("Smallest: " + smallest + " at index " + smallestIndex);
        }
    }


