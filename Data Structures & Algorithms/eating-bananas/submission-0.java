class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = piles[0];
        for(int pile : piles){
             maxPile = Math.max(maxPile, pile);
        }
        
        int left = 1;
        int right = maxPile;
        int ans = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(canFinish(piles, h, mid)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public boolean canFinish(int[] piles, int h, int k){
        int hours = 0;
        for (int i =0; i < piles.length; i++){
            hours += (int) Math.ceil((double)piles[i] / k);
        }
        return h >= hours;
    }
}
// For loop
// First true
// if You imagine the first example like a Monotonic graph of True 
// and False
// you can see 
// 1 2 3 4 5 6. as
// F T T T T T
// and then you just have to find the first true
// but you would have to preform a calculation, of looping though the
// array values and figuring out the piles[i] / k
// EX 1 total amount needed to eat 10 in 9 hours
// 9 * 1 = 9 One banana per hour
// 9 * 2 = 18 two banana per hour
// 1 / 2 = 1 hours
// 4 / 2 = 2 + 1 = 3 hours
// 3 / 2 = 2 + 3 = 5 hours
// 2 / 2 = 1 + 5 = 6 hours