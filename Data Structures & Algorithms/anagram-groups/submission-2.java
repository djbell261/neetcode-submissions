class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();

         for(String word : strs){
            char[] charAry = word.toCharArray();
            Arrays.sort(charAry);
            String srted = Arrays.toString(charAry);

            if(!map.containsKey(srted)){
                map.put(srted, new ArrayList<String>());
            }
            map.get(srted).add(word); 
         }


         return new ArrayList<>(map.values());
    }
}