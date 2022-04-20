/* MaxMin & BubbleSort */
// print_method
// process_method
import vmsm.TRACE;

public class TestA_3trace {
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

    static int calcMaxMin(int[] array, int flag) {
        t.assInt("flag", flag);
        t.refArray("array", array, 0);
        int num = array[0];
        t.assInt("num", num);
        if(flag == 0) {
            for(int i = 1; i < array.length; i++) {
                t.assInt("i", i);
                if(num < array[i]) {
                    t.refInt("i", i);
                    t.refArray("array", array, i);
                    num = array[i];
                    t.assInt("num", num);
                }
                if(i == array.length-1) break;
                t.refInt("i", i);
            }
        } else if(flag == 1) {
            for(int i = 1; i < array.length; i++) {
                t.assInt("i", i);
                if(num > array[i]) {
                    t.refInt("i", i);
                    t.refArray("array", array, i);
                    num = array[i];
                    t.assInt("num", num);
                }
                if(i == array.length-1) break;
                t.refInt("i", i);
            }
        }
        return num;
    }

    static int[] sort(int[] array, int flag) {
        t.assInt("flag", flag);
        int[] sArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            t.assInt("i", i);
            t.refInt("i", i);
            t.refArray("array", array, i);
            sArray[i] = array[i];
            t.refInt("i", i);
            t.assArray("sArray", array, i);
            if(i == array.length-1)break;
            t.refInt("i", i);
        }
        // t.refInt("sArray.length", sArray.length);
        for (int i = sArray.length-1; i > 0; i-- ) {
            t.assInt("i", i);
            for (int j = 0; j < i; j++) {
                t.assInt("j", j);
                if(flag == 0) {
                    if(sArray[j] > sArray[j+1]) {
                        t.refInt("j", j);
                        t.refArray("sArray", sArray, j);
                        int temp = sArray[j];
                        t.assInt("temp", temp);
                        t.refInt("j", j);
                        t.refArray("sArray", sArray, j+1);
                        sArray[j] = sArray[j+1];
                        t.refInt("j", j);
                        t.assArray("sArray", sArray, j);
                        t.refInt("temp", temp);
                        sArray[j+1] = temp;
                        t.refInt("j", j);
                        t.assArray("sArray", sArray, j+1);
                    }
                } else if(flag == 1) {
                    if(sArray[j] < sArray[j+1]) {
                        t.refInt("j", j);
                        t.refArray("sArray", sArray, j);
                        int temp = sArray[j];
                        t.assInt("temp", temp);
                        t.refInt("j", j);
                        t.refArray("sArray", sArray, j+1);
                        sArray[j] = sArray[j+1];
                        t.refInt("j", j);
                        t.assArray("sArray", sArray, j);
                        t.refInt("temp", temp);
                        sArray[j+1] = temp;
                        t.refInt("j", j);
                        t.assArray("sArray", sArray, j+1);
                    }
                }
                if(j == i-1) break;
                t.refInt("j", j);
            }
            if(i == 1) break;
            t.refInt("i", i);
        }
        return sArray;
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
        t.init("data0", "array", data0);
        max = calcMaxMin(data0, 0);
        t.refInt("num", max);
        t.assInt("max", max);
        t.init("data0", "array", data0);
        min = calcMaxMin(data0, 1);
        t.refInt("num", min);
        t.assInt("min", min);
        printMaxMin(max, min);
        t.init("data0", "sArray", data0);
        sData0 = sort(data0, 0);
        t.init("sArray", "sData0",sData0);
        t.init("sData0", "array", sData0);
        printData(sData0);
        // System.out.println();
        t.init("data1", "array", data1);
        printData(data1);
        t.init("data1", "array", data1);
        max = calcMaxMin(data1, 0);
        t.refInt("num", max);
        t.assInt("max", max);
        t.init("data1", "array", data1);
        min = calcMaxMin(data1, 1);
        t.refInt("num", min);
        t.assInt("min", min);
        printMaxMin(max, min);
        t.init("data1", "sArray", data1);
        sData1 = sort(data1, 0);
        t.init("sArray", "sData1",sData1);
        t.init("sData1", "array", sData1);
        printData(sData1);
        // System.out.println();
    }
}