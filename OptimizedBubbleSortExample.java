public class OptimizedBubbleSortExample {   //No.2
    public static int optimizedBubbleSort(int[] myArray) {
        int n = myArray.length;
        int steps = 0; // ステップ数をカウントする変数
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                steps++;
                if (myArray[j] > myArray[j + 1]) {
                    // スワップ
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    swapped = true;
                }
            }
            // スワップが発生しなかった場合、アルゴリズムを停止する
            if (!swapped) break;
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};
        int steps = optimizedBubbleSort(myArray);
        System.out.println("Sorted array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nSteps taken: " + steps);
    }
}
