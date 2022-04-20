/* BubbleSort + MaxMin */
// print_method
// process_method
// method_connect
import vmsm.FIFO;

public class TestA_4fifo {
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

    static int calcMaxMin(int[] array, int flag) {
        f.assQ("flag", flag);
        f.refQ("array", array, 0);
        int num = array[0];
        f.assQ("num", num);
        if(flag == 0) {
            for(int i = 1; i < array.length; i++) {
                f.assQ("i", i);
                if(num < array[i]) {
                    f.refQ("i", i);
                    f.refQ("array", array, i);
                    num = array[i];
                    f.assQ("num", num);
                }
                if(i == array.length-1) break;
                f.refQ("i", i);
            }
        } else if(flag == 1) {
            for(int i = 1; i < array.length; i++) {
                f.assQ("i", i);
                if(num > array[i]) {
                    f.refQ("i", i);
                    f.refQ("array", array, i);
                    num = array[i];
                    f.assQ("num", num);
                }
                if(i == array.length-1) break;
                f.refQ("i", i);
            }
        }
        return num;
    }

    static int[] sort(int[] array, int flag) {
        f.assQ("flag", flag);
        int[] sArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            f.assQ("i", i);
            f.refQ("i", i);
            f.refQ("array", array, i);
            sArray[i] = array[i];
            f.refQ("i", i);
            f.assQ("sArray", array, i);
            if(i == array.length-1)break;
            f.refQ("i", i);
        }
        // f.refQ("sArray.length", sArray.length);
        for (int i = sArray.length-1; i > 0; i-- ) {
            f.assQ("i", i);
            for (int j = 0; j < i; j++) {
                f.assQ("j", j);
                if(flag == 0) {
                    if(sArray[j] > sArray[j+1]) {
                        f.refQ("j", j);
                        f.refQ("sArray", sArray, j);
                        int temp = sArray[j];
                        f.assQ("temp", temp);
                        f.refQ("j", j);
                        f.refQ("sArray", sArray, j+1);
                        sArray[j] = sArray[j+1];
                        f.refQ("j", j);
                        f.assQ("sArray", sArray, j);
                        f.refQ("temp", temp);
                        sArray[j+1] = temp;
                        f.refQ("j", j);
                        f.assQ("sArray", sArray, j+1);
                    }
                } else if(flag == 1) {
                    if(sArray[j] < sArray[j+1]) {
                        f.refQ("j", j);
                        f.refQ("sArray", sArray, j);
                        int temp = sArray[j];
                        f.assQ("temp", temp);
                        f.refQ("j", j);
                        f.refQ("sArray", sArray, j+1);
                        sArray[j] = sArray[j+1];
                        f.refQ("j", j);
                        f.assQ("sArray", sArray, j);
                        f.refQ("temp", temp);
                        sArray[j+1] = temp;
                        f.refQ("j", j);
                        f.assQ("sArray", sArray, j+1);
                    }
                }
                if(j == i-1) break;
                f.refQ("j", j);
            }
            if(i == 1) break;
            f.refQ("i", i);
        }
        return sArray;
    }

    static void runProcess(int[] array, int flag) {
        int max, min;
        int[] sData = new int[array.length];
        f.assQ("flag", flag);
        f.assQ("array", "array", array);
        printData(array);
        f.assQ("array", "array", array);
        max = calcMaxMin(array, 0);
        f.refQ("num", max);
        f.assQ("max", max);
        f.assQ("array", "array", array);
        min = calcMaxMin(array, 1);
        f.refQ("num", min);
        f.assQ("min", min);
        printMaxMin(max, min);
        f.assQ("array", "sArray", array);
        sData = sort(array, 0);
        f.assQ("sArray", "sArray",sData);
        f.assQ("sData", "array", sData);
        printData(sData);
        //System.out.println();
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};

        f.assQ("data0", data0);
        f.assQ("data1", data1);

        f.assQ("data0", "array", data0);
        runProcess(data0, 0);
        f.assQ("data1", "array", data1);
        runProcess(data1, 1);
    }
}
