package org.example;

/**
 * 希尔排序--插入排序的升级版
 * 以固定间隔，拉取新数组，用插入排序对新数组排序。完成后，缩小间隔，继续重复上述操作。直至间隔为1
 */
public class ShellSort {
    public static void main(String[] args){
        int[] arr = { 9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2 };
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){
        for (int gap = arr.length/2; gap >0 ; gap/=2) {
            //以间隔为4的新数组，使用插入排序排序
            for (int j = gap; j < arr.length; j++) {
                //从指定位置往前比较大小，小的往前插
                for (int i = j; i > gap -1 ; i-= gap) {
                    if(arr[i] < arr[i-gap]){
                        swap(arr, i, i-gap);
                    }
                }
            }
        }


    }

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
