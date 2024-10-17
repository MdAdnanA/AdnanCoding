import java.awt.*;

public class LongestMatchedSubString {
    public static void main (String[]args){
        String[] s = {"good","google","going","goodhabbit"};
        String goo = longestMatchedSubStr(s, "n");
        System.out.println(goo);
    }

        public static String longestMatchedSubStr (String[] s, String value){
            int index = -1;
            int len = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i].contains(value) && s[i].length() > len) {
                    index = i;
                }
            }
            if (index >= 0) {
                return s[index];
            }
            return "None Found";
        }
    }
