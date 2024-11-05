public class AtoiProgram {
    public static void main(String[]args){

        String str1 ="123";
        String str2 ="-123";
        String str3 ="1a23";

        System.out.println(atoi(str1));
        System.out.println(atoi(str2));
        System.out.println(atoi(str3));

    }

    public static int atoi(String str){
        if(str==null||str.length()==0){
            return -1;

        }

        str=str.trim();

        int sign=1;
        int index=0;
        int result=0;

        if (str.charAt(index)=='-'){
            sign=-1;
            index++;

        }else if(str.charAt(index)=='+') {
            index++;

        }

        for(; index < str.length();index++ ){
            char c = str.charAt(index);
            if(c<'0'||c>'9'){
                return -1;
            }
            result=result * 10 + (c -'0');

        }

         return result*sign;

    }
}
