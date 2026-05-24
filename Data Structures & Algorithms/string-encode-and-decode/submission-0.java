class Solution {

   public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str: strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {

        //start from 0 index to take the String's Length
        //go one more to get to the start of the string past the #
        //now substring from the start to the index length
        // return those strings into a list
        ArrayList<String> completed = new ArrayList<>();


        int j = 0; // set j to start at zero
        while(j < str.length()){ // iterate through the encoded string until the end

            int i=j;
            while(!(str.charAt(j) == '#')){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j)); // grab the length of the string you need

            j++; // find the start of the string

           String decodedString = str.substring(j, j + length); // return the start to the end of the string


           completed.add(decodedString); // add to array

           j += length; //skip past string to the length of the next

        }

        return completed;
    }
}

