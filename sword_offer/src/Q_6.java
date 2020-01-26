import java.util.ArrayList;

public class Q_6 {
    /*
    * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
    * */

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (listNode != null) {
            arr.add(0, listNode.val);
            listNode = listNode.next;
        }
        return arr;
    }

    // 如果打印出来的话也可以递归

}
