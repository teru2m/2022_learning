/* LinearSearch */
// [print & initialize]_method
// search_method


public class TestC_3 {

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

    public static void main(String args[]) {
        int[] a = { 4, 2, 3, 9, 5, 2, 8, 8, 10, 1, 8, 2, 3, 5, 8, 9};
        int[] b = { 1, 1, 5, 7, 7, 9, 3, 3, 3, 3, 9, 9, 3};
        int x;

        Search sValue = new Search();
        Search value;

        x = 3;
        value = sValue.searchMethod(x, a, 0);
        printNth(x, value.pos);
        
        x = 7;
        value = sValue.searchMethod(x, a, 0);
        printNth(x, value.pos);

        x = 5;
        value = sValue.searchMethod(x, b, 1);
        printNths(x, value.pos, value.count, value.sArray);

        x = 3;
        value = sValue.searchMethod(x, b, 1);
        printNths(x, value.pos, value.count, value.sArray);
        
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

        int check = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(array[i] == x) {
                sValue.pos = i;
                if(flag == 0)break;
                else if(flag == 1) {
                    sValue.sArray[i] = sValue.pos;
                    sValue.count++;
                }
                if(x == 3 && i == 3) check++;
            }
            
            if(x == 5 && i == 5) System.out.println("2_" + sValue.count);
        }
        if(x == 3 && check == 1) {
                System.out.println("1_" + sValue.pos);
                check++;
        }

        return sValue;
    }
}
