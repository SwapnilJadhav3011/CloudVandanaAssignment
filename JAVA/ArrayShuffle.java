import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        // Create an array
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        // Shuffle the array using the Fisher-Yates shuffle
        shuffleArray(array);

        // Print the shuffled array
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
