/* CalcTest */
// [initialize & print]_method

public class TestB_2 {
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

    public static void main(String[] args) {
        int[] a = {5, 10, 3, 7, 8, 1, 9};
        int[] b = {3, 1, 2, 9, 13};
        int[] c = {-5, 4, -8, 3, 5, 1, 1, 6, -3};
        double[] result = new double[4];
        
        result = initialize(a);
        for(int i=1; i < a.length; i++) {
            result[0] += a[i];
        }
        for(int i=1; i < a.length; i++) {
            result[1] *= a[i];
        }
        for(int i=1; i < a.length; i++) {
            if(i % 2 == 0)  result[2] += a[i];
            else result[2] -= a[i];
        }
        for(int i=1; i < a.length; i++) {
            if(i % 2 == 0)  result[3] *= a[i];
            else result[3] /= a[i];
        }
        printResult(result);

        result = initialize(b);
        for(int i=1; i < b.length; i++) {
            result[0] += b[i];
        }
        for(int i=1; i < b.length; i++) {
            result[1] *= b[i];
        }
        for(int i=1; i < b.length; i++) {
            if(i % 2 == 0)  result[2] += b[i];
            else result[2] -= b[i];
        }
        for(int i=1; i < b.length; i++) {
            if(i % 2 == 0)  result[3] *= b[i];
            else result[3] /= b[i];
        }
        printResult(result);

        result = initialize(c);
        for(int i=1; i < c.length; i++) {
            result[0] += c[i];
        }
        for(int i=1; i < c.length; i++) {
            result[1] *= c[i];
        }
        for(int i=1; i < c.length; i++) {
            if(i % 2 == 0)  result[2] += c[i];
            else result[2] -= c[i];
        }
        for(int i=1; i < c.length; i++) {
            if(i % 2 == 0)  result[3] *= c[i];
            else result[3] /= c[i];
        }
        printResult(result);
    }
}
