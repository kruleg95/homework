package Lesson2.homework;

import java.util.Arrays;

public class ConsolApplication {

    public static void main(String[] args) {
        int[] arr = initializeArray(100000);
        SortAlgorithms sa=new SortAlgorithms();
        //System.out.println(Arrays.toString(arr));



        //Bubble Sort
        long start = System.currentTimeMillis();

        int[] arrBubble= sa.BubbleSorting(arr);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("\n"+timeConsumedMillis);


        //Shake Sort
        long start2 = System.currentTimeMillis();

        int[] arrShake= sa.ShakeSorting(arr);

        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("\n"+timeConsumedMillis2);


        //Hairbrush Sort
        long start3 = System.currentTimeMillis();

        int[] arrHairbrush= sa.ShakeSorting(arr);

        long finish3 = System.currentTimeMillis();
        long timeConsumedMillis3 = finish3 - start3;
        System.out.println("\n"+timeConsumedMillis3);


        //Choice Sort
        long start4 = System.currentTimeMillis();

        int[] arrChoice= sa.choiceSorting(arr);

        long finish4 = System.currentTimeMillis();
        long timeConsumedMillis4 = finish4 - start4;
        System.out.println("\n"+timeConsumedMillis4);

        System.out.println("Mistakes "+checker(arrBubble,arrHairbrush));


    }

    public static int[] initializeArray(int capacity){
        int[] arr = new int[capacity];
        for (int i = 0; i <capacity ; i++) {
            arr[i]=(int)(Math.random()*10000);
        }
        return arr;
    }


    public static int checker(int[] a, int[] b){
        int mistakes=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b[i]){
                mistakes++;
            }
        }
        return mistakes;
    }
}
