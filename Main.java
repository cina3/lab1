public class Main {
    public static void printMenu() {

    }

    public static int[] createRandomArray(int arraySize) {
       
    }

    public static int findMax(int[] arr) {
        int max = -1;

        for(int element: arr) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public static int findMin(int[] arr) {
        int min = 101;

        for(int element: arr) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        double count = 0;

        for (int element: arr) {
            count++;
            sum += element;
        }

        return sum / count;
    }

    public static double[] calculateDeviations(int[] arr) {
        double avg = calculateAverage(arr);

        int arraySize = arr.length;
        double[] finalArr = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            finalArr[i] = arr[i] - avg;
        }

        return finalArr;
    }

    public static int calculateSumOfEvenIndexes(int[] arr) {
      
    }

    public static int calculateSumOfOddIndexes(int[] arr) {
       
    }

    public static void main(String[] args) {

    }
}