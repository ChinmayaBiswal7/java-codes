package Day_15;
import java.util.*;

public class map {
    public static void main (String args []){
        Map<String,String> mapping = new HashMap<>();

         //insertion

         mapping.put("in","India");
         mapping.put("Us","America");
         mapping.put("Aus","Australia");
         System.out.println(mapping);

         Map<String,String> table = new HashMap<>();

         System.out.println(table);
         table.put("br","Brazil");

         table.putAll(mapping);

         System.out.println(table);
         


    }
}
