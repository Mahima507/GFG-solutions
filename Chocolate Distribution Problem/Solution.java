class Solution
{
    public int findMinDiff(ArrayList<Integer> a, int n, int m)
    {
        //code
        Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        int i = 0, j = m - 1;
        while (j < n) {
            if (ans > (a.get(j) - a.get(i))) {
                ans = a.get(j) - a.get(i);
            }
            i++;
            j++;
        }
        return ans;
    }
}
