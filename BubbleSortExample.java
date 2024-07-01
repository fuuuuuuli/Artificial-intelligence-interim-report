public class BubbleSortExample {    //No.2
    public static int bubbleSort(int[] myArray) {
        int n = myArray.length;
        int steps = 0; // ステップ数をカウントする変数

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                steps++;
                if (myArray[j] > myArray[j + 1]) {
                    // スワップ
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        int steps = bubbleSort(myArray);
        System.out.println("Sorted array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nSteps taken: " + steps);
    }
}
