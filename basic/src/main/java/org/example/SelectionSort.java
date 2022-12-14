package org.example;

/**
 * 选择排序
 * 每次遍历整个数组，找出最小值，放到数组前面的位置
 * 遍历顺序：从左往右
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {5,3,6,8,1,7,9,4,2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            //找到最小值的下标位置
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            swap(arr, i, minPos);
            System.out.print("经过第 " + i + "次循环之后，数组的内容：");
            print(arr);
        }
        print(arr);
    }

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] =  arr[j];
        arr[j] = tmp;
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
