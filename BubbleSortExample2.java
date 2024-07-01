public class BubbleSortExample2 {   //No.5
    public static void main(String[] args) {
        // 配列を定義
        int[] array = {5, 1, 4, 2, 3};

        // バブルソートを実行
        bubbleSort(array);

        // ソート後の配列を表示
        System.out.println("ソート後の配列:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // バブルソートのメソッド
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 要素を交換
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // もし交換が行われなかった場合、ソートは終了している
            if (!swapped) break;
        }
    }
}
