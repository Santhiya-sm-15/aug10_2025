class Solution {
    public boolean reorderedPowerOf2(int n) {
        Set<String> st=new HashSet<>();
        long x=1;
        st.add(String.valueOf(x));
        while(x<(long)1e9)
        {
            x*=2;
            char[] c=String.valueOf(x).toCharArray();
            Arrays.sort(c);
            st.add(new String(c));
        }
        char[] c=String.valueOf(n).toCharArray();
        Arrays.sort(c);
        return st.contains(new String(c));
    }
}