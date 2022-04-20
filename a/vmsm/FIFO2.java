package vmsm;

import java.util.ArrayList;

public class FIFO2 {
    public static ArrayList<String> list1 = new ArrayList<>();
    public static ArrayList<Integer> list2 = new ArrayList<>();
    public static int count = 0;
    
    public static void assQ(String name, int[] array) {
        for(int tes = 0; tes < array.length; tes++) {
            assQ(name, array, tes);
        }
    }

    public static void assQ(String name, String name2, int[] array) {
        for(int tes = 0; tes < array.length; tes++) {
            refQ(name, array, tes);
            assQ(name2, array, tes);
        }
    }

    public static void assQ(String name, int[] array, int num) {
        String str = name + "[" +num+ "]";
        System.out.println();
        if(list1.size() == 1) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            }
        }else if(list1.size() == 2) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            } else if( str.equals(list1.get(1))) {
                list1.remove(1);
                list2.remove(1);
                count--;
            }
        } else if(list1.size() == 3) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            } else if( str.equals(list1.get(1))) {
                list1.remove(1);
                list2.remove(1);
                count--;
            } else if( str.equals(list1.get(2))) {
                list1.remove(2);
                list2.remove(2);
                count--;
            }
        }
        if(count == 3) {
            list1.remove(0);
            list2.remove(0);
            count--;
        }

        count ++;
        list1.add(str);
        list2.add(array[num]);
        
        System.out.print(list2);
    }

    public static void assQ(String str, int num) {
        System.out.println();
        if(list1.size() == 1) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            }
        }else if(list1.size() == 2) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            } else if( str.equals(list1.get(1))) {
                list1.remove(1);
                list2.remove(1);
                count--;
            }
        } else if(list1.size() == 3) {
            if( str.equals(list1.get(0))) {
                list1.remove(0);
                list2.remove(0);
                count--;
            } else if( str.equals(list1.get(1))) {
                list1.remove(1);
                list2.remove(1);
                count--;
            } else if( str.equals(list1.get(2))) {
                list1.remove(2);
                list2.remove(2);
                count--;
            }
        }
        if(count == 3) {
            list1.remove(0);
            list2.remove(0);
            count--;
        }

        count ++;
        list1.add(str);
        list2.add(num);
        
        System.out.print(list2);
    }

    public static void refQ(String name, int[] array, int num) {
        String str = name + "[" +num+ "]";
        if( str.equals(list1.get(0)) || str.equals(list1.get(1)) || str.equals(list1.get(2)) ) {
                System.out.println("\tRC");
        } else {
            list1.remove(0);
            list2.remove(0);
            list1.add(str);
            list2.add(array[num]);
            System.out.println();
            System.out.print(list2);
            System.out.println("\t\tBT");
            
        }
    }

    public static void refQ(String str, int num) {
        if( str.equals(list1.get(0)) || str.equals(list1.get(1)) || str.equals(list1.get(2)) ) {
                System.out.println("\tRC");
        } else {
            list1.remove(0);
            list2.remove(0);
            list1.add(str);
            list2.add(num);
            System.out.println();
            System.out.print(list2);
            System.out.println("\t\tBT");
            
        }
    }

    public static void check(String str) {
        System.out.println(list1.get(0));
        System.out.println(str);
    }
}