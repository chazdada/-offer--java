public class Q_5 {
    /*
    * 替换空格
    * https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
    * */
    public String replaceSpace(StringBuffer str) {
        int n = str.indexOf(" ");
        while (n != -1){
            str.replace(n,n+1,"%20");
            n = str.indexOf(" ",n+1);
        }
        return str.toString();
    }
}
