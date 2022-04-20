/* CalcTest */
// [initialize & print]_method
// calc_method
// method_connect

public class TestB_4 {
    static double[] initialize(int[] array) {
        double[] init = {array[0], array[0], array[0], array[0]};
        
        return init;
    }

    static void printResult(double[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.printf("%.3f\n", array[3]);
        System.out.println();
    }

    static double[] calcArray(int[] array) {
        double[] calc = new double[4];
        
        calc = initialize(array);
        for(int i = 1; i < array.length; i++) {
            calc[0] += array[i];
            calc[1] *= array[i];
            if(i%2 == 0) {
                calc[2] += array[i];
                calc[3] *= array[i];
            } else {
                calc[2] -=array[i];
                calc[3] /= array[i];
            }
        }
        return calc;
    }

    static void runProcess(int[] array) {
        double[] result = new double[4];
        
        result = initialize(array);
        result = calcArray(array);
        printResult(result);
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 3, 7, 8, 1, 9};
        int[] b = {3, 1, 2, 9, 13};
        int[] c = {-5, 4, -8, 3, 5, 1, 1, 6, -3};
        
        runProcess(a);
        runProcess(b);
        runProcess(c);
    }
}
