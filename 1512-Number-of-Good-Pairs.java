class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int pairs = 0;
        for(int num : nums){
            pairs = pairs + hash.getOrDefault(num, 0);
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        return pairs;
    }
}