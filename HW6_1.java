import java.util.TreeMap;

public class HW6_1 {

    public static void main(String[] args) {
    
        MySet mySet = new MySet();
    
        mySet.add(30);
        mySet.add(12);
        mySet.add(6);
        mySet.add(90);
        
        System.out.println(mySet.toString());        

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));            
        }    
    }
}
    
class MySet {
        
    private TreeMap<Integer,Object> treeMap2 = new TreeMap<>();
    private final Object OBJ = new Object();
    
    public boolean add(Integer i){
        return treeMap2.put(i, OBJ)!=null?true:false;
    }    

    @Override
    public String toString() {        
        return treeMap2.keySet().toString();
    }

    public Integer size(){
        return treeMap2.size();
    }

    public Integer get(Integer item){
        return (Integer) treeMap2.keySet().toArray()[item];
    }

}