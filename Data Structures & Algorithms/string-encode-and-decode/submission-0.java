class Solution {

    public String encode(List<String> arr) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i< arr.size() ;i++)
        {
            sb.insert(0, arr.get(i).length() );
            sb.append(arr.get(i));
        }
        sb.insert(0, arr.size());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str =="")return ans;
        
        StringBuilder sb = new StringBuilder(str);

        int tlen = sb.length();
        int arrlen = str.charAt(0) - '0';

        for(int i =1 ; i <= arrlen ; i++)
        {
            int clen = str.charAt(i) - '0';

            ans.add(sb.substring( tlen - clen, tlen).toString());
            // System.out.println(arrlen - clen);
            // System.out.println(arrlen);

            tlen -= clen;
        }
        Collections.reverse(ans);
        return ans;
    }
}
