class Solution {
    public int findJudge(int n, int[][] t) {
        int[] in=new int[n+1];
        int[] out=new int[n+1];
        if(n==1)
        {
            if(t.length==0) return 1;
            else return 0;
        }
        for(int i=0;i<t.length;i++)
        {
            out[t[i][0]]++;
            in[t[i][1]]++;
        }
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(out));
        for(int i=0;i<n+1;i++)
        {
            if(out[i]==0&&in[i]==n-1) return i;
        }
        return -1;
    }
}