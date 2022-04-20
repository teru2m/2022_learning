/* LinearSearch */

public class TestC_1 {
    public static void main(String args[]) {
        int[] a = {4, 2, 3, 9, 5, 2, 8, 8, 10, 1, 8, 2, 3, 5, 8, 9};
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
        if(pos < 0) {
            System.out.println(x + " => x");
        } else {
            System.out.println(x + " => " + pos);
        }
        System.out.println();

        x = 7;
        pos = -1;
        for(int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
            if(a[i] == x) {
                pos = i;
                break;
            }
        }
        if(pos < 0) {
            System.out.println(x + " => x");
        } else {
            System.out.println(x + " => " + pos);
        }
        System.out.println();

        for(int i = 0; i < checkB.length; i++) {
            checkB[i] = -1;
        }
        x = 5;
        pos = -1;
        count = 0;
        for(int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
            if(b[i] == x) {
                pos = i;
                checkB[i] = i;
                count++;
            }
        }
        if(pos < 0) {
            System.out.println(x + "\n");
        } else {
            System.out.print(x + " => " + count + ", ");
            for(int i = 0; i < checkB.length; i++) {
                if(checkB[i] > -1) {
                    System.out.print(i+ " ");
                }
            }
            System.out.println("\n");
        }

        for(int i = 0; i < checkB.length; i++) {
            checkB[i] = -1;
        }
        x = 3;
        pos = -1;
        count = 0;
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            if(b[i] == x) {
                pos = i;
                checkB[i] = pos;
                count++;
            }
        }
        if(pos < 0) {
            System.out.println(x + "\n");
        } else {
            System.out.print(x + " => " + count + ", ");
            for(int i = 0; i < checkB.length; i++) {
                if(checkB[i] > -1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
