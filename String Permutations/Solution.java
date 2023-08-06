class Solution
{
    private ArrayList<String> out = new ArrayList<>();

    private void check(StringBuilder s, int i, int n)
    {
        if(i == n)
        {
            out.add(s.toString());
            return;
        }

        for(int j = i; j < n; ++j)
        {
            swap(s, i, j);
            check(s, i+1, n);
            swap(s, i, j);
        }
    }

    private void swap(StringBuilder s, int i, int j)
    {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    public ArrayList<String> permutation(String S)
    {
        int n = S.length();
        check(new StringBuilder(S), 0, n);
        Collections.sort(out);
        return out;
    }
}
