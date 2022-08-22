import java.util.*;  
class treemap
{  
 public static void main(String args[])
 {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Aditya");    
      map.put(105,"Sam");    
      map.put(101,"Mak");    
      map.put(103,"Rock");    
        
      for(Map.Entry m:map.entrySet())
      {    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}