class Solution {

    public String encode(List<String> arr) {
        StringBuilder sb = new StringBuilder();

        for(String s: arr)
        {
            sb.append(s.length()).append('#').append(s);
        }
        System.out.print(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str =="")return ans;

        StringBuilder sb = new StringBuilder(str);


        int i = 0;
         
        while (i < str.length()) {
            int j = i;

            // reset num string
            String numS = "";

            // read length
            while (str.charAt(j) != '#') {
                numS += str.charAt(j);
                j++;
            }

            int len = Integer.parseInt(numS);

            // move past '#'
            j++;

            // extract string
            String word = str.substring(j, j + len);
            ans.add(word);

            // move pointer
            i = j + len;
        }
        return ans;
    }
}








