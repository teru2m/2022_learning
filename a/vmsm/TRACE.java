package vmsm;
public class TRACE {
    public static void initArray(String str, int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("��� " + str + "[" + i + "] " + array[i]);
        }
    }

    public static void init(String str, String str2, int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("�Q�� " + str + "[" + i + "] " + array[i]);
            System.out.println("��� " + str2 + "[" + i + "] " + array[i]);
        }
    }

    public static void assArray(String str, int[] array, int num) {
        System.out.println("��� " + str + "[" + num + "] " + array[num]);
    }

    public static void refArray(String str, int[] array, int num) {
        System.out.println("�Q�� " + str + "[" + num + "] " + array[num]);
    }

    public static void assInt(String str, int var) {
        System.out.println("��� " + str + " " + var);
    }

    public static void refInt(String str, int var) {
        System.out.println("�Q�� " + str + " " + var);
    }
}