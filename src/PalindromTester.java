public class PalindromTester {

    public static void main(String []args){

        String x="racecarj";
        System.out.println(isPlaindrome(x)? "the string is palindrome,":"the string is not a palindrome");

    }
    public static boolean isPlaindrome(String str){

        if (str==null||str.length()==0)
            return true;

        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = str.length()/2-1;
        int right=(str.length()%2==0)? str.length()/2:str.length()/2+1;
        return midExpand(str,left,right);


    }

    private static boolean midExpand(String str, int left,int right){
        while (left>=0&& right<str.length()) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left--;
            right++;

        }
        return true;
    }
}
