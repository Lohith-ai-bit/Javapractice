class Solution {
        public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max_so_far=Integer.MIN_VALUE;
        int curr_sum=0;
        int j=0;
        int k=0;
        for(int i:nums){
            curr_sum+=i;
            if(curr_sum>max_so_far){
                max_so_far=curr_sum;
                int k=i;


            }
            if(curr_sum<0){
                curr_sum=0;
                j=i;

            }   
             }
        System.out.println("Maximum Subarray Sum: " + max_so_far);
        for (int i=j;i<=k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
