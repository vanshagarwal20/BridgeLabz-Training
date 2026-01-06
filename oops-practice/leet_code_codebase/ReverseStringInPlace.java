package leet_code_codebase;

public class ReverseStringInPlace {
    public static void main(String[] args) {

        String s = "hello";
        char[] arr = s.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(arr));
    }
}

