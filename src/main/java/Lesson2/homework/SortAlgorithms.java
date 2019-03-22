package Lesson2.homework;

public class SortAlgorithms {



    public int[] choiceSorting(int[] arrs){
        int [] arr =new int[arrs.length];
        System.arraycopy(arrs,0,arr,0,arr.length);

        int steps=arr.length;
        int maximal=arr[0];
        int maximalLocation = 0;
        int tmp=0;

        while(steps!=1) {
            for (int i = 0; i < steps; i++) {
                if(arr[i]>maximal){
                   maximal=arr[i];
                   maximalLocation=i;
                }
            }
            tmp=arr[steps-1];
            arr[steps-1]=maximal;
            arr[maximalLocation]=tmp;
            maximal=0;
            maximalLocation=0;
            steps--;
        }
        return arr;
    }

    public int[] bubbleSorting(int[] arrs){
        int [] arr =new int[arrs.length];
        System.arraycopy(arrs,0,arr,0,arr.length);

        int step=arr.length;
        int tmp=0;

        while(step!=1){
        for (int i = 0; i <step-1 ; i++) {
            if(arr[i]>arr[i+1]){
                tmp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=tmp;
            }
        }
        step--;
        }
        return arr;
    }

    public int[] hairbrushSorting(int[] arrs){
        int [] arr =new int[arrs.length];
        System.arraycopy(arrs,0,arr,0,arr.length);
        int leng = (int)(arr.length/1.24);
        int tmp=0;
        int isanyChange=0;
        boolean isSorted=true;

        while(isSorted){
            for (int i = 0; i <(arr.length-leng) ; i++) {
                if(arr[i]>arr[i+leng]){
                    tmp=arr[i+leng];
                    arr[i+leng]=arr[i];
                    arr[i]=tmp;
                    isanyChange++;
                }
            }
            if(isanyChange==0){
                if(leng==1) {
                    isSorted = false;
                }
                leng=(int)(leng/1.24);
                if(leng<1){
                    leng=1;
                }
            }
            isanyChange=0;
        }
        return arr;
    }

    public int[] shakeSorting(int[] arrs){
        int [] arr =new int[arrs.length];
        System.arraycopy(arrs,0,arr,0,arr.length);
        int step=arr.length;
        int start=0;
        int tmp=0;

        while(step>1){
            for (int i = start; i <step-1 ; i++) {
                if(arr[i]>arr[i+1]){
                    tmp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=tmp;
                }
            }
            for (int i = step-1; i >start ; i--) {
                if(arr[i]<arr[i-1]){
                    tmp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=tmp;
                }
            }
            start++;
            step--;
        }
        return arr;
    }





}
