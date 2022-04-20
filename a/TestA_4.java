/* BubbleSort + MaxMin */
// print_method
// process_method
// method_connect

public class TestA_4 {
    static void printData(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.print(array [i] + " ");
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

    static void runProcess(int[] array, int flag) {
        int max, min;
        int[] sData = new int[array.length];
        
        printData(array);
        max = calcMaxMin(array, 0);
        min = calcMaxMin(array, 1);
        printMaxMin(max, min);
        sData = sort(array, flag);
        printData(sData);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};

        runProcess(data0, 0);
        runProcess(data1, 1);
    }
}
