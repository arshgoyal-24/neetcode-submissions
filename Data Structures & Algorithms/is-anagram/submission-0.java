class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        if(s.length() != t.length())return false;
        for(int i = 0; i< s.length() ; i++)
        {
            int ind1 = s.charAt(i) - 'a';
            int ind2 = t.charAt(i) - 'a';
            arr[ind1]++;
            arr[ind2]--;
        }
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i] != 0 )return false;
        }
        return true;
    }
}
