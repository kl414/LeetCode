/** one fast solution
 * but won't work if n/2 is not set
 * probably can't use Arrays.sort() in interview either
 */
/*
public class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length / 2];
    }
}
*/

//voting algo
public class Solution {
    public int majorityElement(int[] num) {
        int ret = 0;
        int count = 0;
        int n = num.length;
        
        for(int i = 0; i < n; i++){
            if(count == 0){
                ret = num[i];
                count++;
            }else if(num[i] == ret){
                count++;
                //just to put below line for better performance in some ideal cases
                if(count > n/2) return ret;
            }else{
                count--;
            }
        }
        return ret;
    }
}
