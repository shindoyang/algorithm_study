package org.example;

/**
 * 插入排序
 * 抽出第 i 张牌，需要看能不能插到前面去，怎么插，挨个和前面的值比较，如果小于前面的
 */
public class InsertionSort {

    public static void main(String[] args){
        int[] arr = { 9, 3, 1, 4, 6, 8, 7, 5, 2 };
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){
        //从指定位置往前比较大小，小的往前插
        for (int i = 1; i > 0; i--) {
            if(arr[i] < arr[i-1]){
                swap(arr, i, i-1);
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
