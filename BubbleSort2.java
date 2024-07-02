public class BubbleSort2 {  //No.3
    // バブルソートを行うメソッド
    public static void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 要素を入れ替える
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // 交換が行われなければ、配列はすでにソートされているので終了
            if (!swapped) break;
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("ソート前の配列:");
        printArray(array);
        
        sort(array);
        
        System.out.println("ソート後の配列:");
        printArray(array);
    }

    // 配列を出力するメソッド
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}