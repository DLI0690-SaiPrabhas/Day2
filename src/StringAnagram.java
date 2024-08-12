public class StringAnagram {
    public static void main(String[] args) {
        String s="sai";
        String s2="ais";
        char[] ch1=s.toCharArray();
        char[] ch2=s2.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s2.length();j++){
                if(ch1[i]==ch2[j])
                    count++;
            }

        }
        if(count==s.length()&&count==s2.length())
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
