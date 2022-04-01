package com.example.phrmeasy;


/*Given a stream of integers represented as arr[]. For each index i from 0 to n-1,
        print the multiplication of largest, second largest,
        third largest element of the subarray arr[0…i]. If i < 2 print -1.

        Input : arr[] = {1, 2, 3, 4, 5}
        Output :  -1
        -1
        6
        24
        60*/

import java.util.List;

public class Test1 {



    /*List<Integer> arrayStream(){


    }*/


    int findMultipleThree(int[] arr){

        int lrgest=Integer.MIN_VALUE,secondLrgest=Integer.MIN_VALUE, thirdLrgest=Integer.MIN_VALUE;

        if(arr.length<3)
            return -1;

        if(arr.length==3)
            return arr[0]*arr[1]*arr[2];

        for(int i=0;i<arr.length;i++){
            lrgest=Math.max(lrgest,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=lrgest)
                secondLrgest=Math.max(secondLrgest,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=lrgest && arr[i]!=secondLrgest)
                thirdLrgest=Math.max(thirdLrgest,arr[i]);
        }

        return lrgest*secondLrgest*thirdLrgest;
    }

    public static void main(String args[]){

        Test1 test1=new Test1();
        int[] arr={1,2,3,4,7,6};
        int[] arr1={1,2};
        int[] arr2={1,2,3};


        System.out.println(test1.findMultipleThree(arr));
        System.out.println(test1.findMultipleThree(arr1));
        System.out.println(test1.findMultipleThree(arr2));

    }
}
