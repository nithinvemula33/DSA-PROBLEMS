class Solution {
    public boolean canAliceWin(int n) {
        int c=0,x=10;
        if(n<10)return false;
        while(n-x>=0)
        {
            n=n-x;
            if(x>1)x--;
            c++;
        }
        if(c%2==0)return false;
        return true;

    }
}