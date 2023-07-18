import java.util.HashMap;
import java.util.Map;

public class inbuildHasMethod {
    public static void main(String[] args) {
        Map<Integer,String> dataMap = new HashMap<>();


        String name = "Bharath ram";
        int hashCode = name.hashCode();

        //Key -> hashCode
        dataMap.put(hashCode, name);
        String outputName = dataMap.get(hashCode);
        System.out.println("Name:" + name + "\nHashCode: "+ hashCode);
    }    
}
