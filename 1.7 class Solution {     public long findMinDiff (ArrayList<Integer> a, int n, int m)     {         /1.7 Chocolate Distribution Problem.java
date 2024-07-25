class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<(n-m+1);i++){
            int diff=(a.get(i+m-1)-a.get(i));
            min=Math.min(min,diff);
        }
        return min;
    }
}
