package vmsm;
public class TRACE {
    public static void initArray(String str, int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("代入 " + str + "[" + i + "] " + array[i]);
        }
    }

    public static void init(String str, String str2, int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("参照 " + str + "[" + i + "] " + array[i]);
            System.out.println("代入 " + str2 + "[" + i + "] " + array[i]);
        }
    }

    public static void assArray(String str, int[] array, int num) {
        System.out.println("代入 " + str + "[" + num + "] " + array[num]);
    }

    public static void refArray(String str, int[] array, int num) {
        System.out.println("参照 " + str + "[" + num + "] " + array[num]);
    }

    public static void assInt(String str, int var) {
        System.out.println("代入 " + str + " " + var);
    }

    public static void refInt(String str, int var) {
        System.out.println("参照 " + str + " " + var);
    }
}