package org.example;

/**
 * 冒泡排序
 * 数组元素两两相比较，每次找出最大值，放到数组最后面
 * 遍历顺序：从右往左
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = { 9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){
        //两两比较，找到最大值，并放到数组最后面
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                swap(arr,i,i+1);
            }
        }
    }

    static void  swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
