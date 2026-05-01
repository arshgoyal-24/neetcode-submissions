class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int lsum[] = new int[n];
        int rsum[] = new int[n];

        int sum = 1;
        for(int i = n - 1; i>=0 ; i--){
            rsum[i] = arr[i]*sum;
            sum = rsum[i];
        }
        sum = 1;
    
        for(int i = 0 ; i< n; i++){
            lsum[i] = arr[i]*sum;
            sum = lsum[i];
        }

        for(int i = 0 ; i<n; i++)
        {
            if(i >0 && i<n-1)
                arr[i] = lsum[i-1]*rsum[i+1];
            
            if(i == 0 && n>1)
            {
                arr[i] = rsum[i+1];
            }
            if(i == n-1 && n>1)
            {
                arr[i] = lsum[i-1];
            }
        }
        return arr;

    }
}