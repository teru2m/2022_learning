/* LinearSearch */
// [print & initialize]_method
// search_method
// method_conect

public class TestC_4 {
    static void printNth(int x, int pos) {
        if(pos < 0) {
            System.out.println(x + " => x");
        } else {
            System.out.println(x + " => " + pos);
        }
        System.out.println();
    }

    static void printNths(int x, int pos, int count, int[] array) {
        if(pos < 0) {
            System.out.println(x + "\n");
        } else {
            System.out.print(x + " => " + count + ", ");
            for(int i = 0; i < array.length; i++) {
                if(array[i] > -1) {
                    System.out.print(i+ " ");
                }
            }
            System.out.println("\n");
        }
    }

    static void runProcess(int x, int[] array, int flag) {
        Search sValue = new Search();
        Search value;

        value = sValue.searchMethod(x, array, flag);
        if(flag == 0) {
            printNth(x, value.pos);
        }
        if(flag == 1) {
            printNths(x, value.pos, value.count, value.sArray);
        }
    }

    public static void main(String args[]) {
        int[] a = { 4, 2, 3, 9, 5, 2, 8, 8, 10, 1, 8, 2, 3, 5, 8, 9};
        int[] b = { 1, 1, 5, 7, 7, 9, 3, 3, 3, 3, 9, 9, 3};
        int x;

        runProcess(3, a, 0);
        runProcess(7, a, 0);
        runProcess(5, b, 1);
        runProcess(3, b, 1);

    }
}

class Search {
    int pos = -1;
    int count = 0;
    int[] sArray;

    static void initialize(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    static Search searchMethod(int x, int[] array, int flag) {
        Search sValue = new Search();
        sValue.sArray = new int[array.length];
        initialize(sValue.sArray);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(array[i] == x) {
                sValue.pos = i;
                if(flag == 0)break;
                else if(flag == 1) {
                    sValue.sArray[i] = sValue.pos;
                    sValue.count++;
                }
            }
        }

        return sValue;
    }
}
