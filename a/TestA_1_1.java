public class TestA_1_1{


    static void pnt(int[] array,int x){
        for(int i = 0;i<array.length;i++)
            System.out.print(array[i] + " ");
        System.out.println();

        if(x==0)
            System.out.println("");
        
    }

    static void max(int[] array, int max ,int x){
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        if(x==0)
            System.out.println("");
    }


    static void min(int[] array, int min){
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }


    static void sort(int[] sArray,int[] array,int flag){
        
        for(int i = 0; i < array.length; i++) {
            sArray[i] = array[i];
        }
        
        if(flag == 1){
            for(int i = sArray.length-1; i > 0; i-- ) {
                for(int j = 0; j < i; j++) {
                    if(sArray[j] > sArray[j+1]) {
                        int temp = sArray[j];
                        sArray[j] = sArray[j+1];
                        sArray[j+1] = temp;
                    }
                }
            
            }
        }else{
            for(int i = 0; i < array.length; i++) {
                sArray[i] = array[i];
            }
            for(int i = sArray.length-1; i > 0; i-- ) {
                for(int j = 0; j < i; j++) {
                    if(sArray[j] < sArray[j+1]) {
                        int temp = sArray[j];
                        sArray[j] = sArray[j+1];
                        sArray[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data0 = {5, 10, 3, 7, 8, 1, 9};
        int[] data1 = {4, 10, -9, -13, 5};
        int[] sData0 = new int[data0.length];
        int[] sData1 = new int[data1.length];
        int max, min;

        pnt(data0,1);
        
        max = data0[0];
        max(data0,max,1);

        min = data0[0];
        min(data0,min);
       
        
        sort(sData0,data0,1);
       
        pnt(sData0,0);
        
        pnt(data1,1);

        max = data1[0];
        max(data1,max,1);

        min = data1[0];
        min(data1,min);

        sort(sData1,data1,0);
        pnt(sData1,0);
    }
}
