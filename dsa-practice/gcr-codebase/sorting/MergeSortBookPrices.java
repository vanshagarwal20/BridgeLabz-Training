package sorting;

class MergeSortBookPrices {

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (i = 0; i < temp.length; i++)
            arr[l + i] = temp[i];
    }

    public static void main(String[] args) {
        int[] prices = {399, 199, 599, 299, 149};
        mergeSort(prices, 0, prices.length - 1);

        for (int p : prices)
            System.out.print(p + " ");
    }
}

