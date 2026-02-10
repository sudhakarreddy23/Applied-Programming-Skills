class Solution {
    public boolean halvesAreAlike(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int c=0;
        for (int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
            c++;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        int c1=0;
        for(int i=s.length()/2;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
            c1++;
            
        }
        if(c==c1) return true;
        return false;
    }
}