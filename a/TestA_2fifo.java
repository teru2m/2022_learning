/* MaxMin & BubbleSort */
// print_method
import vmsm.FIFO;

public class TestA_2fifo {
    public static FIFO f = new FIFO();

    static void printData(int[] array) {
        for(int i=0; i < array.length; i++) {
            f.assQ("i", i);
            // // System.out.print(data0[i] + " ");
            if(i == array.length-1)break;
            f.refQ("i", i);
        }
        // System.out.println();
    }

    static void printMaxMin(int max, int min) {
        f.refQ("max", max);
        f.assQ("max", max);
        f.refQ("min", min);
        f.assQ("min", min);
        // System.out.println(max);
        // System.out.println(min);
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};
        int[] sData0 = new int[data0.length];
        int[] sData1 = new int[data1.length];
        int max, min;

        f.assQ("data0", data0);
        f.assQ("data1", data1);

        f.assQ("data0", "array", data0);
        printData(data0);

        f.refQ("data0", data0, 0);
        max = data0[0];
        f.assQ("max", data0[0]);
        for(int i = 1; i < data0.length; i++) {
            f.assQ("i", i);
            if(max < data0[i]) {
                f.refQ("i", i);
                f.refQ("data0", data0, i);
                max = data0[i];
                f.assQ("max", max);
            }
            if(i == data0.length-1)break;
            f.refQ("i", i);
        }
        f.refQ("data0", data0, 0);
        min = data0[0];
        f.assQ("min", min);
        for(int i = 1; i < data0.length; i++) {
            f.assQ("i", i);
            if(min > data0[i]) {
                f.refQ("i", i);
                f.refQ("data0", data0, i);
                min = data0[i];
                f.assQ("min", min);
            }
            if(i == data0.length-1)break;
            f.refQ("i", i);
        }

        for(int i = 0; i < data0.length; i++) {
            f.assQ("i", i);
            f.refQ("i", i);
            f.refQ("data0", data0, i);
            sData0[i] = data0[i];
            f.refQ("i", i);
            f.assQ("sData0", data0, i);
            if(i == data0.length-1)break;
            f.refQ("i", i);
        }

        printMaxMin(max, min);

        // f.refQ("sData0.length", sData0.length);
        for(int i = sData0.length-1; i > 0; i-- ) {
            f.assQ("i", i);
            for(int j = 0; j < i; j++) {
                f.assQ("j", j);
                if(sData0[j] > sData0[j+1]) {
                    f.refQ("j", j);
                    f.refQ("sData0", sData0, j);
                    int temp = sData0[j];
                    f.assQ("temp", temp);
                    f.refQ("j", j);
                    f.refQ("sData0", sData0, j+1);
                    sData0[j] = sData0[j+1];
                    f.refQ("j", j);
                    f.assQ("sData0", sData0, j);
                    f.refQ("temp", temp);
                    sData0[j+1] = temp;
                    f.refQ("j", j);
                    f.assQ("sData0", sData0, j+1);
                }
                if(j == i-1)break;
                f.refQ("j", j);
            }
            if(i ==1)break;
            f.refQ("i", i);
        }
        f.assQ("sData0", "array", sData0);
        printData(sData0);
        // System.out.println();

        f.assQ("data1", "array", data1);
        printData(data1);
        f.refQ("data1", data1, 0);
        max = data1[0];
        f.assQ("max", max);
        for(int i = 1; i < data1.length; i++) {
            f.assQ("i", i);
            if(max < data1[i]) {
                f.refQ("i", i);
                f.refQ("data1", data1, i);
                max = data1[i];
                f.assQ("max", max);
            }
            if(i ==data1.length-1)break;
            f.refQ("i", i);
        }
        f.refQ("data1", data1, 0);
        min = data1[0];
        f.assQ("min", min);
        for(int i = 1; i < data1.length; i++) {
            f.assQ("i", i);
            if(min > data1[i]) {
                f.refQ("i", i);
                f.refQ("data1", data1, i);
                min = data1[i];
                f.assQ("min", min);
            }
            if(i ==data1.length-1)break;
            f.refQ("i", i);
        }
        printMaxMin(max, min);
        for(int i = 0; i < data1.length; i++) {
            f.assQ("i", i);
            f.refQ("i", i);
            f.refQ("data1", data1, i);
            sData1[i] = data1[i];
            f.refQ("i", i);
            f.assQ("sData1", sData1, i);
            if(i ==data1.length-1)break;
            f.refQ("i", i);
        }
        // f.refQ("sData1.length", sData1.length);
        for(int i = sData1.length-1; i > 0; i-- ) {
            f.assQ("i", i);
            for(int j = 0; j < i; j++) {
                f.assQ("j", j);
                if(sData1[j] < sData1[j+1]) {
                    f.refQ("j", j);
                    f.refQ("sData1", sData1, j);
                    int temp = sData1[j];
                    f.assQ("temp", temp);
                    f.refQ("j", j);
                    f.refQ("sData1", sData1, j+1);
                    sData1[j] = sData1[j+1];
                    f.refQ("j", j);
                    f.assQ("sData1", sData1, j);
                    f.refQ("temp", temp);
                    sData1[j+1] = temp;
                    f.refQ("j", j);
                    f.assQ("sData1", sData1, j+1);
                }
                if(j == i-1)break;
                f.refQ("j", j);
            }
            if(i ==1)break;
            f.refQ("i", i);
        }
        f.assQ("sData", "array", sData1);
        printData(sData1);
        // System.out.println();

    }
}
