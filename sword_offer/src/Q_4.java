public class Q_4 {
    /*
    * 二维数组中查找是否有某个数
    * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    * */

    public boolean Find(int target, int [][] array) {
        int x = array.length - 1;
        int y = array[0].length - 1;
        int step_x = 0;
        int step_y = y;
        while(step_x >= 0 & step_x <= x && step_y >= 0 && step_y <=y ){
//            System.out.println(array[step_x][step_y]);
            if(array[step_x][step_y] == target){
                return true;
            }else if(array[step_x][step_y] > target){
                step_y --;
            }else{
                step_x ++;
            }
        }

        return false;
    }
}
