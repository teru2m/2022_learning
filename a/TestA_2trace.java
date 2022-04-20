/* MaxMin & BubbleSort */
// print_method
import vmsm.TRACE;

public class TestA_2trace {
    public static TRACE t = new TRACE();

    static void printData(int[] array) {
        for(int i=0; i < array.length; i++) {
            t.assInt("i", i);
            // // System.out.print(data0[i] + " ");
            if(i == array.length-1)break;
            t.refInt("i", i);
        }
        // System.out.println();
    }

    static void printMaxMin(int max, int min) {
        t.refInt("max", max);
        t.assInt("max", max);
        t.refInt("min", min);
        t.assInt("min", min);
        // System.out.println(max);
        // System.out.println(min);
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};
        int[] sData0 = new int[data0.length];
        int[] sData1 = new int[data1.length];
        int max, min;

        t.initArray("data0", data0);
        t.initArray("data1", data1);

        t.init("data0", "array", data0);
        printData(data0);

        t.refArray("data0", data0, 0);
        max = data0[0];
        t.assInt("max", data0[0]);
        for(int i = 1; i < data0.length; i++) {
            t.assInt("i", i);
            if(max < data0[i]) {
                t.refInt("i", i);
                t.refArray("data0", data0, i);
                max = data0[i];
                t.assInt("max", max);
            }
            if(i == data0.length-1)break;
            t.refInt("i", i);
        }
        t.refArray("data0", data0, 0);
        min = data0[0];
        t.assInt("min", min);
        for(int i = 1; i < data0.length; i++) {
            t.assInt("i", i);
            if(min > data0[i]) {
                t.refInt("i", i);
                t.refArray("data0", data0, i);
                min = data0[i];
                t.assInt("min", min);
            }
            if(i == data0.length-1)break;
            t.refInt("i", i);
        }

        for(int i = 0; i < data0.length; i++) {
            t.assInt("i", i);
            t.refInt("i", i);
            t.refArray("data0", data0, i);
            sData0[i] = data0[i];
            t.refInt("i", i);
            t.assArray("sData0", data0, i);
            if(i == data0.length-1)break;
            t.refInt("i", i);
        }

        printMaxMin(max, min);

        // t.refInt("sData0.length", sData0.length);
        for(int i = sData0.length-1; i > 0; i-- ) {
            t.assInt("i", i);
            for(int j = 0; j < i; j++) {
                t.assInt("j", j);
                if(sData0[j] > sData0[j+1]) {
                    t.refInt("j", j);
                    t.refArray("sData0", sData0, j);
                    int temp = sData0[j];
                    t.assInt("temp", temp);
                    t.refInt("j", j);
                    t.refArray("sData0", sData0, j+1);
                    sData0[j] = sData0[j+1];
                    t.refInt("j", j);
                    t.assArray("sData0", sData0, j);
                    t.refInt("temp", temp);
                    sData0[j+1] = temp;
                    t.refInt("j", j);
                    t.assArray("sData0", sData0, j+1);
                }
                if(j == i-1)break;
                t.refInt("j", j);
            }
            if(i ==1)break;
            t.refInt("i", i);
        }
        t.init("sData0", "array", sData0);
        printData(sData0);
        // System.out.println();

        t.init("data1", "array", data1);
        printData(data1);
        t.refArray("data1", data1, 0);
        max = data1[0];
        t.assInt("max", max);
        for(int i = 1; i < data1.length; i++) {
            t.assInt("i", i);
            if(max < data1[i]) {
                t.refInt("i", i);
                t.refArray("data1", data1, i);
                max = data1[i];
                t.assInt("max", max);
            }
            if(i ==data1.length-1)break;
            t.refInt("i", i);
        }
        t.refArray("data1", data1, 0);
        min = data1[0];
        t.assInt("min", min);
        for(int i = 1; i < data1.length; i++) {
            t.assInt("i", i);
            if(min > data1[i]) {
                t.refInt("i", i);
                t.refArray("data1", data1, i);
                min = data1[i];
                t.assInt("min", min);
            }
            if(i ==data1.length-1)break;
            t.refInt("i", i);
        }
        printMaxMin(max, min);
        for(int i = 0; i < data1.length; i++) {
            t.assInt("i", i);
            t.refInt("i", i);
            t.refArray("data1", data1, i);
            sData1[i] = data1[i];
            t.refInt("i", i);
            t.assArray("sData1", sData1, i);
            if(i ==data1.length-1)break;
            t.refInt("i", i);
        }
        // t.refInt("sData1.length", sData1.length);
        for(int i = sData1.length-1; i > 0; i-- ) {
            t.assInt("i", i);
            for(int j = 0; j < i; j++) {
                t.assInt("j", j);
                if(sData1[j] < sData1[j+1]) {
                    t.refInt("j", j);
                    t.refArray("sData1", sData1, j);
                    int temp = sData1[j];
                    t.assInt("temp", temp);
                    t.refInt("j", j);
                    t.refArray("sData1", sData1, j+1);
                    sData1[j] = sData1[j+1];
                    t.refInt("j", j);
                    t.assArray("sData1", sData1, j);
                    t.refInt("temp", temp);
                    sData1[j+1] = temp;
                    t.refInt("j", j);
                    t.assArray("sData1", sData1, j+1);
                }
                if(j == i-1)break;
                t.refInt("j", j);
            }
            if(i ==1)break;
            t.refInt("i", i);
        }
        t.init("sData", "array", sData1);
        printData(sData1);
        // System.out.println();

    }
}
