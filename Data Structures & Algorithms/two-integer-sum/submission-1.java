class Solution {
    public int[] twoSum(int[] arr, int t) {
        Map<Integer , Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0 ; i< arr.length ; i++)
        {
            int req = t-arr[i];
            if(map.containsKey(req))
            {
                ans[0] = map.get(req);
                ans[1] = i;
            }else{
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}
