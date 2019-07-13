public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i = A.size()-1;
        int j = B.size()-1;
        int k = C.size()-1;
        int maxDiff = Integer.MAX_VALUE;
        int currDiff;
        while(i>=0 && j>=0 && k>=0){
            currDiff = Math.max(A.get(i),Math.max(B.get(j),C.get(k)))-
                        Math.min(A.get(i),Math.min(B.get(j),C.get(k)));
            if(currDiff<=maxDiff)
                maxDiff = currDiff;
            
            int maxTerm = Math.max(A.get(i),Math.max(B.get(j),C.get(k)));
            if(A.get(i) == maxTerm)
                i--;
            else if(B.get(j) == maxTerm)
                j--;
            else if(C.get(k) == maxTerm)
                k--;    
        }
        return maxDiff;
    }
}
