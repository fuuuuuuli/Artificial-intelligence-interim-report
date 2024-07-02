public class BubbleSort3 {   //No.4
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 4, 2, 1, 7};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    // swap a[j] and a[j - 1]
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swapped = true;
                }
            }
            // if no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}
