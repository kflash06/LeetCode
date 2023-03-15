class Solution {
    public int subtractProductAndSum(int n) {
        long sum=0;
        long pro=1;
        while(n>0)
        {
            int res=n%10;
            sum+=res;
            pro*=res;
            n/=10;
        }
        return (int)(pro-sum);
        
    }
}