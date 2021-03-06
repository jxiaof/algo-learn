package algorithm.binarysearch;

/**
 * @author roseduan
 * @time 2019/11/18 22:22
 * @description 二分查找变体问题：查找最后一个等于给定值
 */
public class FindLastEquals {

    public static void main(String[] args) {
        int a = -10 >> 1;
        System.out.println(a);

        int[] data = {7, 7};
        int i = find(data, 7);

        System.out.println("i = " + i);
    }

    private static int find(int[] data, int k){
        int low = 0, high = data.length - 1;

        while (low <= high){
            int mid = low + ((high - low) >> 1);

            if (data[mid] > k){
                high = mid - 1;
            } else if (data[mid] < k){
                low = mid + 1;
            } else {
                if (mid == data.length - 1 || data[mid + 1] != data[mid]){
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
