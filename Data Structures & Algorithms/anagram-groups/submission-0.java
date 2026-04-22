class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map  = new HashMap<>();
        for(String str : strs)
        {
            String x = sort(str);
            if(!map.containsKey(x))
                map.put(x,new ArrayList<>());
            
            map.get(x).add(str);
        }

        for(List<String> yy : map.values())
        {
            ans.add(yy);
        }
        return ans;
    }
    public static String sort(String  str)
    {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
