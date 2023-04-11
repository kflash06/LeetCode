class Solution {
public int sumOfUnique(int[] nums) {
    Arrays.sort(nums);
    int c=0,sum=0;
    for(int i=0;i<nums.length;i=i+c)
    {
        c=0;
        for(int j=i;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }else{
                break;
            }
        }
        if(c==1)
        {
            sum=sum+nums[i];
        }
    }
    return sum;
}
}