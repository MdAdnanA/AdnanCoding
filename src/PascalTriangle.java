import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(buildPascalProgram(4));
    }

    public static List<List<Integer>> buildPascalProgram(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        if(numRows != 1){
            List<Integer> temp = List.of(1);
            for(int i=1; i<numRows; i++){
                temp = getNextRow(temp);
                res.add(temp);
            }
        }
        return res;
    }

    private static List<Integer> getNextRow(List<Integer> temp) {
        List<Integer> res = new ArrayList<>(temp.size()+1);
        for(int i=0; i<temp.size()+1; i++){
            if(i==0 || i==temp.size()){
                res.add(1);
            }else{
                res.add(temp.get(i-1)+temp.get(i));
            }
        }
        return res;
    }

}