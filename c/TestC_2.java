/* LinearSearch */
// [print & initialize]_method

public class TestC_2 {
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

    static void initialize(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    public static void main(String args[]) {
        int[] a = { 4, 2, 3, 9, 5, 2, 8, 8, 10, 1, 8, 2, 3, 5, 8, 9};
        int[] b = { 1, 1, 5, 7, 7, 9, 3, 3, 3, 3, 9, 9, 3};
        int[] checkB = new int[b.length];
        int x, pos, count;
    
        x = 3;
        pos = -1;
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if(a[i] == x) {
                pos = i;
                break;
            }
        }
        printNth(x, pos);
        
        x = 7;
        pos = -1;
        for(int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
            if(a[i] == x) {
                pos = i;
                break;
            }
        }
        printNth(x, pos);

        x = 5;
        pos = -1;
        count = 0;
        initialize(checkB);
        for(int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
            if(b[i] == x) {
                pos = i;
                checkB[i] = pos;
                count++;
            }
        }
        printNths(x, pos, count, checkB);

        x = 3;
        pos = -1;
        count = 0;
        initialize(checkB);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            if(b[i] == x) {
                pos = i;
                checkB[i] = pos;
                count++;
            }
        }
        printNths(x, pos, count, checkB);
        
    }
}
