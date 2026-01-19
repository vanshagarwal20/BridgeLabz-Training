package runtime_analysis;

import java.util.*;

public class SortingPerformance {

//     Bubble Sort - O(N^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//     Merge Sort - O(N log N)
    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

//     Quick Sort - O(N log N) average
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[(low + high) / 2];
        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }

    public static void main(String[] args) {

        int N = 10000;
        int[] data1 = new int[N];
        int[] data2 = new int[N];
        int[] data3 = new int[N];

        for (int i = 0; i < N; i++) {
            int val = (int) (Math.random() * N);
            data1[i] = data2[i] = data3[i] = val;
        }

        long start, time;

//         Bubble Sort
        start = System.nanoTime();
        bubbleSort(data1);
        time = System.nanoTime() - start;
        System.out.println("Bubble Sort Time : " + time + " ns");

//         Merge Sort
        start = System.nanoTime();
        mergeSort(data2, 0, data2.length - 1);
        time = System.nanoTime() - start;
        System.out.println("Merge Sort Time  : " + time + " ns");

//         Quick Sort
        start = System.nanoTime();
        quickSort(data3, 0, data3.length - 1);
        time = System.nanoTime() - start;
        System.out.println("Quick Sort Time  : " + time + " ns");
    }
}

