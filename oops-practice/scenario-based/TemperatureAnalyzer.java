package scenario_based;

class TemperatureAnalyzer {

    public static void analyzeTemperatures(float[][] temps) {
        int hottestDay = 0;
        int coldestDay = 0;
        float maxTemp = temps[0][0];
        float minTemp = temps[0][0];

        for (int day = 0; day < temps.length; day++) {
            float dailySum = 0;

            for (int hour = 0; hour < temps[day].length; hour++) {
                float temp = temps[day][hour];
                dailySum += temp;

                if (temp > maxTemp) {
                    maxTemp = temp;
                    hottestDay = day;
                }

                if (temp < minTemp) {
                    minTemp = temp;
                    coldestDay = day;
                }
            }

            float dailyAverage = dailySum / temps[day].length;
            System.out.println("Average temperature of Day " + (day + 1) + ": " + dailyAverage);
        }

        System.out.println("Hottest Day: Day " + (hottestDay + 1) + " with temperature " + maxTemp);
        System.out.println("Coldest Day: Day " + (coldestDay + 1) + " with temperature " + minTemp);
    }

    public static void main(String[] args) {
        float[][] weeklyTemps = {
            {30, 31, 32, 33, 34, 35, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 25, 26, 27, 28, 29},
            {28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27},
            {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25},
            {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24},
            {24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23},
            {23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22},
            {22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21}
        };

        analyzeTemperatures(weeklyTemps);
    }

}
