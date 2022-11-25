package org.example;

/**
 * 快速排序
 * 从数组两边同时向中间推进，找到左边比轴数大，右边比轴数小，两个位置的数直接交换。
 */
public class QuickSort {

    public static void main(String[] args) {
//        int[] arr = {7,3,2,8,1,9,5,4,6};
//        int[] arr = {7,3,2,8,1,9,5,4,6,10};
        int[] arr = {7,3,2,8,1,9,5,4,6,0};
        sort(arr, 0, arr.length -1);
        print(arr);
    }

    static void sort(int[] arr, int leftBound, int rightBound){
        if(leftBound >= rightBound) return;
        partition(arr, leftBound, rightBound);
    }

    /**
     * partition 分治
     * @param arr
     * @param leftBound 左边界
     * @param rightBound 右边界
     */
    static void partition(int[] arr, int leftBound, int rightBound){
        //取最右侧做为轴
        int pivot = arr[rightBound];
        int left = leftBound;
        //右侧的起始位置应该排除轴的位置
        int right = rightBound - 1;

        while(left < right){
            //如果不加 = 这个判断，当轴在数值刚好是数组最大时，就会出现错误的交换  {7,3,2,8,1,9,5,4,6,10}  --> {7,3,2,8,1,9,5,4,10,6}
            while(left <= right && arr[left] <= pivot){
                left++;
            }
            while(left < right && arr[right] >= pivot){
                right --;
            }
            if(left < right){
                System.out.println("before swap, left = " +left + ", right = " + right);
                swap(arr, left, right);
            }
        }
        swap(arr, left, rightBound);
    }

    static void swap(int[] arr, int i, int j){
        System.out.println("交换 i = " + i + ", j = " + j);
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
