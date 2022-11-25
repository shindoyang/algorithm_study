package org.example;

/**
 * 计数排序
 * 不做比较，根据数据的范围生成新数组，下标统计，最后再对统计好的数组展开为排好序的结果数组
 */
public class CountSort {
    public static void main(String[] args) {
        //假设数组的范围是：0~9
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = sort(arr);
        print(result);
    }

    static int[] sort(int[] arr){
        int[] result = new int[arr.length];

        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //以原数组的值做为下标，统计相同的值重复了多少次
            count[arr[i]]++;
        }
        print(count);

        //通过j来记录结果数组的下标移动情况 -- 不稳定
        /*for (int i=0, j = 0; i < count.length; i++) {
            while(count[i]-- > 0){
                result[j++] = i;
                print(result);
            }
        }*/

        //通过累加数组实现 -- 稳定
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        print(count);

        for (int i = arr.length-1; i >0 ; i--) {
            //之所以要先--，因为累加数组的下标是个数，转换为下标时，要从0开始，故要先减1
            result[--count[arr[i]]] = arr[i];
        }

        return result;
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
