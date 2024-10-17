import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {
    public static void main(String[] args){
        String[] document = {"apple","applet","bread","aper"};
        String prefix = "ap";
        List<String> words = findWords(document, prefix);
        System.out.println(words);

    }

    public static List<String> findWords(String[] document, String prefix){
        ArrayList<String> result = new ArrayList<>();
        for (String word:document){
            if(word.startsWith(prefix)){
                result.add(word);
            }
        }
        return result;

    }



}
