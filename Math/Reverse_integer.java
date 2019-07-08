public class Solution {
    public int reverse(int A) {
        try{
        boolean isNegative = false;
        if(A<0)
            isNegative = true;
        else
            isNegative = false;
        A = Math.abs(A);
        StringBuilder input1 = new StringBuilder(); 
        input1.append(String.valueOf(A)); 
        input1 = input1.reverse(); 
        return isNegative?-Integer.parseInt(input1.toString()):Integer.parseInt(input1.toString());
        }
        catch(Exception e){
            return 0;
        }
        }
}
