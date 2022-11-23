package org.example;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {5,3,6,8,1,7,9,4,2};

        int minPos = 0;
        //找到最小值的下标位置
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] < arr[minPos]){
                minPos = j;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("minPos 的下标：" + minPos);

        int tmp = arr[0];
        arr[0] =  arr[minPos];
        arr[minPos] = tmp;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

