/* CalcTest */

public class TestB_1 {
    public static void main(String[] args) {
        int[] a = {5, 10, 3, 7, 8, 1, 9};
        int[] b = {3, 1, 2, 9, 13};
        int[] c = {-5, 4, -8, 3, 5, 1, 1, 6, -3};
        double[] result = new double[4];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = a[0];
        }
        for(int i = 1; i < a.length; i++) {
            result[0] += a[i];
            // if(i == 4)System.out.println("1_" + result[0]);
        }
        for(int i = 1; i < a.length; i++) {
            result[1] *= a[i];
        }
        for(int i = 1; i < a.length; i++) {
            if(i % 2 == 0)  result[2] += a[i];
            else result[2] -=a [i];
        }
        for(int i = 1; i < a.length; i++) {
            if(i % 2 == 0)  result[3] *= a[i];
            else result[3] /= a[i];
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.printf("%.3f\n", result[3]);
        System.out.println();

        for(int i = 0; i < result.length; i++) {
            result[i] = b[0];
        }
        for(int i = 1; i < b.length; i++) {
            result[0] += b[i];
        }
        for(int i = 1; i < b.length; i++) {
            result[1] *= b[i];
        }
        for(int i = 1; i < b.length; i++) {
            if(i % 2 == 0)  result[2] += b[i];
            else result[2] -= b[i];
        }
        System.out.println("2_" + result[2]);
        for(int i = 1; i < b.length; i++) {
            if(i % 2 == 0)  result[3] *= b[i];
            else result[3] /= b[i];
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.printf("%.3f\n", result[3]);
        System.out.println();

        for(int i = 0; i < result.length; i++) {
            result[i] = c[0];
        }
        for(int i = 1; i < c.length; i++) {
            result[0] += c[i];
        }
        for(int i = 1; i < c.length; i++) {
            result[1] *= c[i];
        }
        for(int i = 1; i < c.length; i++) {
            if(i % 2 == 0)  result[2] += c[i];
            else result[2] -= c[i];
        }
        for(int i = 1; i < c.length; i++) {
            if(i % 2 == 0)  result[3] *= c[i];
            else result[3] /= c[i];
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.printf("%.3f\n", result[3]);
        System.out.println();
    }
}
