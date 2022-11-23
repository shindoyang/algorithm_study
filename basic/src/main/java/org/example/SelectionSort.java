package org.example;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {5,3,6,8,1,7,9,4,2};

        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            //找到最小值的下标位置
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            System.out.println("minPos 的下标：" + minPos);

            int tmp = arr[i];
            arr[i] =  arr[minPos];
            arr[minPos] = tmp;
        }

        print(arr);
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
