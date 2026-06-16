import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC271_Encode_Decode {
   /* Design an algorithm to encode a list of strings to a string.
    The encoded string is then sent over the network and is decoded back to the original list of strings.

     Machine 1 (sender) has the function:

    String encode(List<String> strs) {
        // ... your code
        return encoded_string;
    }
    Machine 2 (receiver) has the function:

    List<String> decode(String encoded_string) {
        // ... your code
        return decoded_strs;
        }


        */
    private final char chr  = (char) 257;

   public String encode(List<String> strs) {
       if(strs == null || strs.isEmpty()){
           return "";
       }
       StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str);
            sb.append(chr);
        }

        return sb.toString();
       //sbse phle edge case check kro ki given list empty to nhi h
       //phir stringbuilder lenge or usme hr ek string daalenge or fr ek special character
       //phir stringbuider ko string me convert krke use return kr denge
       //kuch aisa ["abc#bch#bhd#"]

   }

    public List<String> decode(String str) {
       if(str == null || str.isEmpty()){
           return new ArrayList<>();
       }
        String[] arr = str.split(String.valueOf(chr), -1);
       List<String> list = new ArrayList<>(Arrays.asList(arr));


           list.remove(list.size()-1);

       return list;
       //sbse phle isme v check krnege khi empty string to nhi aayi h
        //ab ek string type ka array bnayenge usme jiske base p hmne string ko merge kra tha
        //usi ke base p use split krenge
        //fr list me daal denge

        //or list ko return



    }


}
