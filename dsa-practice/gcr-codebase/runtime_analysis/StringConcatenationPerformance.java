package runtime_analysis;

public class StringConcatenationPerformance {

    static void usingString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
    }

    static void usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
    }

    static void usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
    }

    public static void main(String[] args) {

        int N = 10000;
        long start, time;

//         String
        start = System.nanoTime();
        usingString(N);
        time = System.nanoTime() - start;
        System.out.println("String Time        : " + time + " ns");

//         StringBuilder
        start = System.nanoTime();
        usingStringBuilder(N);
        time = System.nanoTime() - start;
        System.out.println("StringBuilder Time : " + time + " ns");

//         StringBuffer
        start = System.nanoTime();
        usingStringBuffer(N);
        time = System.nanoTime() - start;
        System.out.println("StringBuffer Time  : " + time + " ns");
    }
}

