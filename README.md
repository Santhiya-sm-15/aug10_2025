# aug10_2025
The problem that i solved today in leetcode

You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this so that the resulting number is a power of two.

Code:
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
