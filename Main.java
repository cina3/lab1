public class Main {
    public static void printMenu() {
                boolean cont = false;
        if (size > 0) {
            cont = true;
            arr = createRandomArray(size);
        }
        while (cont) {
            System.out.println("\n0 - Print array");
            System.out.println("1 - Find maxiumum");
            System.out.println("2 - Find minimum");
            System.out.println("3 - Calculate average");
            System.out.println("4 - Calculate sum of numbers with even indexes");
            System.out.println("5 - Calculate sum of odd numbers with odd indexes");
            System.out.println("6 - Calculate deviations from average");
            System.out.println("7 - Exit");

            System.out.print("\nEnter choice: ");
            int choice = -1;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            }
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.print("Array: ");
                    for (int element: arr) {
                        System.out.print(element + " ");
                    }

                    System.out.println();
                    break;
                case 1:
                    System.out.println("Maximum: " + findMax(arr));
                    break;
                case 2:
                    System.out.println("Minimum: " + findMin(arr));
                    break;
                case 3:
                    System.out.printf("Average(rounded): %.3f\n", calculateAverage(arr));
                    break;
                case 4:
                    System.out.println("Sum of numbers with even indexes: " + calculateSumOfEvenIndexes(arr));
                    break;
                case 5:
                    System.out.println("Sum of numbers with odd indexes: " + calculateSumOfOddIndexes(arr));
                    break;
                case 6:
                    double[] deviations = null;
                    deviations = calculateDeviations(arr);

                    System.out.print("Deviations(rounded): ");
                    for (double element: deviations) {
                        System.out.printf("%.1f ",element);
                    }

                    System.out.println();
                    break;
                case 7:
                    cont = false;
            }
        }

        sc.close();
    }
    }

    public static int[] createRandomArray(int arraySize) {
       int[] arr = new int[arraySize];
        
        Random rnd = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = rnd.nextInt(101);
        }

        return arr;
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
        printMenu();
    }
}
