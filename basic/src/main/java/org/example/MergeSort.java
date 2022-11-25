package org.example;

/**
 * 归并排序 O(N*logN) 稳定的
 * 两个已经内部排好序的数组合并，通过一个临时变量/数组，分别比较两个数组的值并入新数组
 * 或者
 * 对数组内两段分别有序的数据进行归并
 */
public class MergeSort {
    public static void main(String[] args) {
        //arr数组可以分为2部分，第一部分：1，4，7，8； 第二部分：3，6，9；这两部分都分别排好序，可以用归并排序合并
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr);
//        print(arr);
    }

    static void sort(int[] arr){
        merge(arr);
    }

    static void merge(int[] arr){
        int mid = arr.length / 2;
        int[] tmp = new int[arr.length];
        
        //前半数据的第一个位置
        int i = 0;
        //后半数组的第一个位置
        int j = mid +1;
        //tmp 数组的第一个位置
        int k = 0;

        //两个数组都没越界
        while(i <= mid && mid < arr.length){
            if(arr[i] <= arr[j]){
                tmp[k] = arr[i];
                i++;
                k++;
            }else{
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }

        //把最后剩下的部分拷贝到新数组上
        while(i <= mid) {tmp[k++] = arr[i++];}
        while(j < arr.length){tmp[k++] = arr[j++];}

        print(tmp);

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
