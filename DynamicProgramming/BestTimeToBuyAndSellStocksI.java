public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if(A.size()==0 || A.size() == 1){
            return 0;
        }
        int min = A.get(0);
        int maxProfit = A.get(1)-A.get(0);
        for(int i=1;i<A.size();i++){
            min = Math.min(min,A.get(i-1));
            maxProfit = Math.max(maxProfit,A.get(i)-min);
        }
        return (maxProfit>=0)?maxProfit:0;
    }
}
