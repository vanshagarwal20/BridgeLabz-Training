package stack_queue;

public class CircularTourProblem {

//     petrol[i] = petrol at pump i
//     dist[i]   = distance from pump i to next pump
    public static int circularTour(int[] petrol, int[] dist) {
        int n = petrol.length;

        int start = 0;     // candidate starting pump
        int surplus = 0;   // current petrol in tank
        int deficit = 0;   // petrol shortfall

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - dist[i];

//             If petrol becomes negative, cannot start from 'start'
            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }

//         Check if total petrol >= total distance
        return (surplus + deficit >= 0) ? start : -1;
    }

//     Main method
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] dist   = {6, 5, 3, 5};

        int startIndex = circularTour(petrol, dist);
        System.out.println(startIndex); // Output: 1
    }
}

