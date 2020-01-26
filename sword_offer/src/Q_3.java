public class Q_3 {

    public static int find_dul(int[] nums){
        /*
        * 给定一个长度为n的数组，数组内数的范围都是0-n-1,找出一个重复的数。
        * 时间复杂度：O(n)
        * 空间复杂度:O(1)
        * */

        for(int i = 0 ; i < nums.length; i++){
            while (nums[i] != i){
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                if(nums[tmp] == tmp){
                    return nums[i];
                }else {
                    nums[tmp] = tmp;
                }
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,1,0,2,6,6};
        int dul = find_dul(nums);
        System.out.println(dul);
    }
}
