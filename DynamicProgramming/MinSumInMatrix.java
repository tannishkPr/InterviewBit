public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int[][] arr = new int[A.size()][A.get(0).size()];
        int sum = 0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i).get(0);
            arr[i][0] = sum;
        }
        sum = 0;
        for(int j=0;j<A.get(0).size();j++){
            sum+=A.get(0).get(j);
            arr[0][j] = sum;
        }
        for(int i=1;i<A.size();i++){
            for(int j=1;j<A.get(i).size();j++){
                arr[i][j]= Math.min(arr[i-1][j],arr[i][j-1])+A.get(i).get(j);
            }
        }
        
        // for(int i=0;i<A.size();i++){
        //     for(int j=0;j<A.get(i).size();j++){
        //         System.out.print(arr[i][j]+",");
        //     }
        //     System.out.println("");
        // }
        return arr[A.size()-1][A.get(0).size()-1];
    }
}
