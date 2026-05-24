class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] characterList = word.toCharArray();
            Arrays.sort(characterList);
            String sortedWord = Arrays.toString(characterList);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);


        }

        return new ArrayList<>(map.values());
    }
}
// HashMap to store String, List<String>
// first String key will be the sorted version of the anagram
// second will be the actual words
// for loop over each sorted word putting them inside the Map
// if new sorted word create new List and add to a new keep adding to the real words to the List
// the dump String values from HashMap into the result List 