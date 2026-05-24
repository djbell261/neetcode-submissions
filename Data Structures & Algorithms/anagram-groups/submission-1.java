class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sortedWord =  Arrays.toString(characters);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(str);
        }

        return new ArrayList<>(map.values());
}
}