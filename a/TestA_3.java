/* MaxMin & BubbleSort */
// print_method
// process_method

public class TestA_3 {
    static void printData(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printMaxMin(int max, int min) {
        System.out.println(max);
        System.out.println(min);
    }

    static int calcMaxMin(int[] array, int flag) {
        int num = array[0];
        if(flag == 0) {
            num = array[0];
            for(int i = 1; i < array.length; i++) {
                if(num < array[i]) num = array[i];
            }
        } else if(flag == 1) {
            num = array[0];
            for(int i = 1; i < array.length; i++) {
                if(num > array[i]) num = array[i];
            }
        }
        return num;
    }

    static int[] sort(int[] array, int flag) {
        int[] sArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sArray[i] = array[i];
        }
        for (int i = sArray.length-1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                if(flag == 0) {
                    if(sArray[j] > sArray[j+1]) {
                        int temp = sArray[j];
                        sArray[j] = sArray[j+1];
                        sArray[j+1] = temp;
                    }
                } else if(flag == 1) {
                    if(sArray[j] < sArray[j+1]) {
                        int temp = sArray[j];
                        sArray[j] = sArray[j+1];
                        sArray[j+1] = temp;
                    }
                }
            }
        }
        return sArray;
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};
        int[] sData0 = new int[data0.length];
        int[] sData1 = new int[data1.length];
        int max, min;

        printData(data0);
        max = calcMaxMin(data0, 0);
        min = calcMaxMin(data0, 1);
        printMaxMin(max, min);
        sData0 = sort(data0, 0);
        printData(sData0);
        System.out.println();

        printData(data1);
        max = calcMaxMin(data1, 0);
        min = calcMaxMin(data1, 1);
        printMaxMin(max, min);
        sData1 = sort(data1, 1);
        printData(sData1);
        System.out.println();
    }
}