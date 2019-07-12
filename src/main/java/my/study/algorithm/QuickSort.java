package my.study.algorithm;

import java.util.Arrays;

/**
 * @author wgyang
 * Create time: 2019-07-12 22:16
 * Description:快速排序
 * 对数组numbers进行快速排序，执行步骤：
 * 分解：数据numbers[start..end]被划分成两个（可能为空）子数组numbers[start..q-1]和number[q+1..end]，
 * 使得numbers[start..q-1]中的每一个元素都小于等于numbers[q]，而numbers[q]也小于等于numbers[q+1..end]
 * 中的每个元素。其中，计算下标q也是划分过程的一部分。
 * 解决：通过递归调用快速排序，对子数组numbers[start..q-1]和numbers[q+1..end]进行排序。
 * 合并：因为子数组都是原址排序的，所以不需要合并操作：数组numbers[start..end]已经有序。
 */
public class QuickSort {
    /**
     * partition过程总是选择数组中的一个元素x=numbers[end]作为主元，并根据这个主元对数组进行划分。
     *
     * @param numbers 需要排序的数组
     * @param start   起始元素的小标
     * @param end     结束元素的下标
     * @return 返回分组元素的下标
     */
    public static int partition(int[] numbers, int start, int end) {
        // 选择主元
        int x = numbers[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            // <=条件为升序排序；>=条件为降序排序
            if (numbers[j] <= x) {
                i += 1;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        numbers[end] = numbers[i + 1];
        numbers[i + 1] = x;
        return i + 1;
    }

    public static int[] quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int q = partition(numbers, start, end);
            quickSort(numbers, start, q - 1);
            quickSort(numbers, q + 1, end);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 7};
        System.out.println(Arrays.toString(quickSort(a, 0, a.length - 1)));
        int[] b = {2, 2, 2, 2, 2, 2, 2, 2,};
        System.out.println(Arrays.toString(quickSort(b, 0, b.length - 1)));
        int[] c = {9, 23, 5, 1, 7, 1, 76, 2, 8, 32, 9, 2, 0, 1, 5, 8, 3};
        System.out.println(Arrays.toString(quickSort(c, 0, c.length - 1)));
    }
}
