import java.util.HashMap;
import java.util.Map;

public class HashUse {
    public static void main(String[] args) {
        HashMap<Character,Integer>hMap=new HashMap<>();
        String str = "nanitunia";
        char []ch = str.toCharArray();
         for (char c : ch) {
            if (hMap.containsKey(c)) {

                hMap.put(c,hMap.get(c)+1);
            }
            else
            {
                hMap.put(c,1);
            }


         }

         for( Map.Entry entry: hMap.entrySet())
 
         {
            System.out.println(entry.getKey() + " " + entry.getValue());
         }
        }
}
