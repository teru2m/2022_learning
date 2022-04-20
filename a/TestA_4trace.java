/* BubbleSort + MaxMin */
// print_method
// process_method
// method_connect
import vmsm.TRACE;

public class TestA_4trace {
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

    static void runProcess(int[] array, int flag) {
        int max, min;
        int[] sData = new int[array.length];
        t.assInt("flag", flag);
        t.init("array", "array", array);
        printData(array);
        t.init("array", "array", array);
        max = calcMaxMin(array, 0);
        t.refInt("num", max);
        t.assInt("max", max);
        t.init("array", "array", array);
        min = calcMaxMin(array, 1);
        t.refInt("num", min);
        t.assInt("min", min);
        printMaxMin(max, min);
        t.init("array", "sArray", array);
        sData = sort(array, 0);
        t.init("sArray", "sArray",sData);
        t.init("sData", "array", sData);
        printData(sData);
        //System.out.println();
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};

        t.initArray("data0", data0);
        t.initArray("data1", data1);

        t.init("data0", "array", data0);
        runProcess(data0, 0);
        t.init("data1", "array", data1);
        runProcess(data1, 1);
    }
}
