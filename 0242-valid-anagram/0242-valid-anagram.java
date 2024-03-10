class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS=s.toCharArray();
        char[] charT=t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String stringS= String.valueOf(charS);
        String stringT=String.valueOf(charT);
        return stringS.equals(stringT);
    }
}