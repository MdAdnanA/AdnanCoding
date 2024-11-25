import java.util.HashMap;

public class NonRepeatingChar {
    public static void main (String []args){

        String str1 = "12345";
        String str2 = "abbacd";
        System.out.println("first non repeating Character in : " + str2+" is "+ findNonRepFirstChar(str2));
    }

    public static char findNonRepFirstChar(String str){

       HashMap<Character, Integer> hasMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            hasMap.put(c,hasMap.getOrDefault(c,0)+1);
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(hasMap.get(c)==1){
                return c;
            }
        }
        return '\0';


    }

     public static String nonRepeating(String str){

    for(int i = 0; i< str.length();i++){
      boolean flag = true;
      for(int j = 0; j<str.length(); j++){
        if(i!=j && str.charAt(i) == str.charAt(j)){
          flag = false;
          break;
        }
      }

      if(flag)
        return Character.toString(str.charAt(i));
    }

    return "None Found";
    
 } public static String nonRepeating(String str){

    for(int i = 0; i< str.length();i++){
      boolean flag = true;
      for(int j = 0; j<str.length(); j++){
        if(i!=j && str.charAt(i) == str.charAt(j)){
          flag = false;
          break;
        }
      }

      if(flag)
        return Character.toString(str.charAt(i));
    }

    return "None Found";
    
 }
    
 } 
second and best approch
    
public static String nonRepeating(String str){

    for(int i = 0; i< str.length();i++){
      boolean flag = true;
      for(int j = 0; j<str.length(); j++){
        if(i!=j && str.charAt(i) == str.charAt(j)){
          flag = false;
          break;
        }
      }

      if(flag)
        return Character.toString(str.charAt(i));
    }

    return "None Found";
    
 }

}
