/*
This is probably the least space and run time code.
It's also very clean and straight forward.
*/
public class Solution {
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}

/*
Use more logic but actually slower
*/
/*
public String intToRoman(int num) {
    int[] weights={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] tokens={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder rs=new StringBuilder("");
    int start=0;
    while(num>0){
        for(int i=start;i<13;i++){
            if(num>=weights[i]){
                num-=weights[i];
                rs.append(tokens[i]);
                break;
            }
            start=i+1; // skip those impossible check, make it faster
        }
    }
    return rs.toString();
}
*/
