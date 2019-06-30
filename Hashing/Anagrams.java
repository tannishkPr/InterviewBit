public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String,ArrayList<Integer>> occurance = new HashMap<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A.size();i++){
            String mapForOne = createMap(A.get(i));
            if(occurance.containsKey(mapForOne)){
                occurance.get(mapForOne).add(i+1);
            } else {
                ArrayList<Integer> li = new ArrayList<Integer>();
                li.add(i+1);
                occurance.put(mapForOne,li);
            }
        }
        for(ArrayList<Integer> val : occurance.values()){
            result.add(val);
        }
        return result;
    }
    public String createMap(String str){
        String result = "";
        int[] map = new int[26]; 
        for(int i=0;i<26;i++){
            map[i] = 0;
        }
        for(int i=0;i<str.length();i++){
            map[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            result = result+"*"+String.valueOf(map[i]);
        }
        return result;
    }
}
