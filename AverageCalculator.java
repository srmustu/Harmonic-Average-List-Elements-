public class AverageCalculator {
    static int averageCalc(int[] list){
        int result = 0;
        for (int i = 0; i < list.length; i++){
            result += list[i];
        }
        result /= list.length;
        return result;
    }

    static double harmonicCalc(double[] list){
        double result = 0;
        double calculator = 0;

        for (double v : list) {
            result += (1 / v);
            calculator = list.length / result;
            return calculator;

        }
        return calculator;
    }
}
