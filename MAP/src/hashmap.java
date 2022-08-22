import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;  
class hashmap{  
 public static void main(String args[]){  
   LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();    
   System.out.println("------HASH MAP------");
   map.put(105,"Sam");    
   map.put(103,"Rock"); 
   map.put(101,"Mak");
   map.put(100,"Aditya");
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
      
  
      
      
      TreeMap<Integer,String> m2=new TreeMap<Integer,String>();  
      System.out.println("------TREEE MAP------");
     m2.put(100,"Aditya");    
      m2.put(105,"Sam");    
     m2.put(101,"Mak");    
     m2.put(103,"Rock");    
        
           
         for(Map.Entry m:m2.entrySet()){    
          System.out.println(m.getKey()+" "+m.getValue());    
         }    
 }  
}
