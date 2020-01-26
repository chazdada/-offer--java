public class Q_3_1 {

    public static int count(int[] nums,int k,int l){
        int res = 0;

        for (int i = 0; i < nums.length;i++){
            if (nums[i] <= k && nums[i] >= l){
                res ++;
            }
        }

        return res;
    }





    public static int find_dul(int[] nums){
        /*
         * 给定一个长度为n的数组，数组内数的范围都是0-n-1,找出一个重复的数。
         * 不允许修改数组
         * https://leetcode-cn.com/problems/find-the-duplicate-number/
         * 时间复杂度：O(nlog(n))
         * 空间复杂度:O(1)
         * */
        int l = 1;
        int r = nums.length - 1;

        while (l < r){
            int mid = (l + r) >> 1;
            System.out.println(mid);
            int l_c = count(nums,mid,l);
            if(l_c > (mid - l + 1)){
                r = mid;
            }else {
                l = mid + 1;
            }

        }

        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        //int[] nums = {1,4,4,2,4};
        int dul = find_dul(nums);
        System.out.println(dul);
    }
}
