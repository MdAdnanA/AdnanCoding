public class StringCount {

    public static void main (String [] args){

        System.out.println(compressString("aaabbc"));
        System.out.println(compressString("ddhbbd"));



    }

    public static String compressString(String input){
        if(input == null|| input.isEmpty()){
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count=1;
        for (int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                compressed.append(input.charAt(i-1)).append(count);
                count=1;

            }

        }
        compressed.append(input.charAt(input.length()-1)).append(count);
        return compressed.toString();
    }
}
