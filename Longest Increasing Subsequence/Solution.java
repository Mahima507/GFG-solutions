//POTD 
class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[])
    {
        // code here
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if(arr.get(arr.size()-1)<nums[i]){
                arr.add(nums[i]);
            }
            else{
                Integer[] a = new Integer[arr.size()];
                a = arr.toArray(a);
                int ind = lower(a, nums[i]);
                arr.set(ind, nums[i]);
            }
        }
        return arr.size();
    }

    private static int lower(Integer array[], int key)
    {
        int lowerBound = 0;
        while (lowerBound < array.length) {
            if (key > array[lowerBound])
                lowerBound++;
            else
                return lowerBound;
        }
 
        return lowerBound;
    }
}
