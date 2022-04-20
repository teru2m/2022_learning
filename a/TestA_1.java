/* MaxMin & BubbleSort */

public class TestA_1 {
    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};
        int[] sData0 = new int[data0.length];
        int[] sData1 = new int[data1.length];
        int max, min;

        for(int i=0; i < data0.length; i++) {
            System.out.print(data0[i] + " ");
        }
        System.out.println();
        max = data0[0];
        for(int i = 1; i < data0.length; i++) {
            if(max < data0[i]) {
                max = data0[i];
            }
        }
        min = data0[0];
        for(int i = 1; i < data0.length; i++) {
            if(min > data0[i]) {
                min = data0[i];
            }
            if(i == 3)System.out.println("min = " + min);
        }
        System.out.println(max);
        System.out.println(min);
        for(int i = 0; i < data0.length; i++) {
            sData0[i] = data0[i];
        }
        for(int i = sData0.length-1; i > 0; i-- ) {
            for(int j = 0; j < i; j++) {
                if(sData0[j] > sData0[j+1]) {
                    int temp = sData0[j];
                    sData0[j] = sData0[j+1];
                    sData0[j+1] = temp;
                }
                if(i == 5 && j == 4) System.out.println("‡A" + sData0[j]);
            }
            
        }
        for(int i=0; i < sData0.length; i++) {
            System.out.print(sData0[i] + " ");
        }
        System.out.println("\n");
        
        for(int i=0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }
        System.out.println();
        max = data1[0];
        for(int i = 1; i < data1.length; i++) {
            if(max < data1[i]) {
                max = data1[i];
            }
        }
        min = data1[0];
        for(int i = 1; i < data1.length; i++) {
            if(min > data1[i]) {
                min = data1[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        for(int i = 0; i < data1.length; i++) {
            sData1[i] = data1[i];
        }
        for(int i = sData1.length-1; i > 0; i-- ) {
            for(int j = 0; j < i; j++) {
                if(sData1[j] < sData1[j+1]) {
                    int temp = sData1[j];
                    sData1[j] = sData1[j+1];
                    sData1[j+1] = temp;
                }
            }
        }
        for(int i=0; i < sData1.length; i++) {
            System.out.print(sData1[i] + " ");
        }
        System.out.println("\n");

    }
}
