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


// put(K key, V value): Inserts a key-value mapping into the HashMap. If the key already exists, the value is overwritten.

// get(Object key): Retrieves the value associated with the specified key. Returns null if the key is not found.

// containsKey(Object key): Checks if the HashMap contains the specified key. Returns true if the key is found.

// containsValue(Object value): Checks if the HashMap contains the specified value. Returns true if the value is found.

// remove(Object key): Removes the key-value mapping associated with the specified key from the HashMap.

// size(): Returns the number of key-value mappings in the HashMap.

// isEmpty(): Checks if the HashMap is empty. Returns true if the HashMap contains no mappings.