import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Смоделировать добавление элементов Set, но без использования сета.

public class Task6_1 {      
    
    public static void main(String[] args) {
        TreeMap<Integer, Object> treeMap = new TreeMap<>();
        Object OBJ = new Object();

        treeMap.put(11, OBJ);
        treeMap.put(1, OBJ);
        treeMap.put(18, OBJ);
        treeMap.put(9, OBJ);

        System.out.println(treeMap);        
        
        String str = "";
        
        str+= treeMap.keySet();
        System.out.println(str);
    }
}

/**
 * InnerTask6_1
 */
class MySet {

    

    
}