
/*

Keys: HashMap + Sliding Window, 
add the s1 characters to the Hashmap
using the s1 length as the k size of the window on s2,
add/remove characters to another hashmap as the window moves
once size is k check if both hashmaps are equal
if so return true
if the end of string is reached w/o ==, then return false

EDGE: if the s2 length is smaaler then s1 retutn false


s1 = "abc", s2 = "lecabee"
map1 = {a=1, b=1, c=1}
map2 = { c=1, a=1, b=1}

lecabee
  ^
    ^ 

if(right - left)+1 == s1.length && map1.isEqual(map2))
    return true

else
    left++;


PSEDOU
HashMap = map1
HashMap = map2
int left = 0;

for s1 length times
    map.put char , 0 OR map.get char + 1

for s2 length tines
    map.put map.put s2 char , (0 OR map.get s2 char) + 1

    if (right - left) + 1 == s1 len 
        if map1.isEqual(map2)
            return true
        
        else
            map.put map.put s2 char , map.get s2 char - 1
            if map.get(s2 char at left) == 0
                map.remove(s2 char at left)
            left++    

return false
*/
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int left=0;

        for(int i =0; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);

        }

        for(int i =0; i < s2.length();i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);

            if((i - left) + 1 == s1.length()){
                if(map2.equals(map1)){
                    return true;
                }
                map2.put(s2.charAt(left), map2.get(s2.charAt(left))-1);
                if(map2.get(s2.charAt(left))==0){
                map2.remove(s2.charAt(left));
                }
                left++;
            }
             
                 
                
            

        }

    return false;
        
    }
}
/*

s1 = "abc", s2 = "lecabee"
                    ^
                      ^  
map1 = {a=1, b=1, c=1}
map2 = {c=1, a=1, b=1}



*/