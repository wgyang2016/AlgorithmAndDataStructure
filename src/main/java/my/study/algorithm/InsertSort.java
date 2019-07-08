package my.study.algorithm;

import java.util.Arrays;

/**
 * @author wgyang
 * Create time: 2019-07-08 23:15
 * Description: 插入排序
 */
public class InsertSort {

    /**
     * 插入排序升序
     *
     * @param numbers 需要排序的数组
     * @return 按升序排序好的数组
     */
    public static int[] insertSortAscending(int[] numbers) {
        for (int j = 1; j < numbers.length; j++) {
            int key = numbers[j];
            int i = j - 1;
            while (i >= 0 && numbers[i] > key) {
                numbers[i + 1] = numbers[i];
                i = i - 1;
            }
            numbers[i + 1] = key;
        }
        return numbers;
    }

    /**
     * 插入排序降序
     *
     * @param numbers 需要排序的数组
     * @return 按降序排序好的数组
     */
    public static int[] insertSortDescending(int[] numbers) {
        for (int j = 1; j < numbers.length; j++) {
            int key = numbers[j];
            int i = j - 1;
            while (i >= 0 && numbers[i] < key) {
                numbers[i + 1] = numbers[i];
                i = i - 1;
            }
            numbers[i + 1] = key;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 2, 6, 8, 2};
        System.out.println(Arrays.toString(insertSortAscending(a)));
        System.out.println(Arrays.toString(insertSortDescending(a)));

        int[] b = {1};
        System.out.println(Arrays.toString(insertSortAscending(b)));
        System.out.println(Arrays.toString(insertSortDescending(b)));
    }
}
