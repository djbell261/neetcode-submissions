class Solution {

   public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for(String word : strs){
            encoded_string.append(word.length())
            .append("#")
            .append(word);
        }
        

       return encoded_string.toString();
    }  

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int j = 0;
        while(j < str.length()){
            int i =j;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(
                str.substring(i, j)
            );
            j++;

            decoded_strs.add(str.substring(j, j + length));

            j += length;
    
        }
            
        


        
 

        return decoded_strs;
    }
}

//For each loop through the List of strings
// 