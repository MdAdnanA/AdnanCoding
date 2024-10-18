public class DistanceOfWords {
    public static void main(String [] args) {

        String str = "the quick the brown quick  brown frog";
        String word1 = "quick";
        String word2 = "frog";
        int dis = minDistanceBtWords(str, word1, word2);
        System.out.println(dis);
    }


    public static int minDistanceBtWords(String str,String word1,String word2){
        String[] words = str.split(" ");
        int index1= -1,index2=-1;
        int minDistance = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                index1=i;
            }else if(words[i].equals(word2)){
                index2=i;
            }
            if(index1!=-1&& index2!=-1){
                minDistance = Math.min(minDistance,Math.abs(index1-index2));
            }
        }
        return minDistance==Integer.MAX_VALUE ? -1:minDistance;
    }
}
