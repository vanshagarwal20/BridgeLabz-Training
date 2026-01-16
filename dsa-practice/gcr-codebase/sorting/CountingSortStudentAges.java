package sorting;

class CountingSortStudentAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 14, 13, 10, 18};

        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        for (int age : ages)
            count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i + min;
                count[i]--;
            }
        }

        for (int a : ages)
            System.out.print(a + " ");
    }
}
