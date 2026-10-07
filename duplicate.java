import java.util.*;

class duplicate
{
  public static void main(String gg[])
{
     int [] arr={2,3,4,2,4,5,6,5};
     
    HashMap<Integer,Integer> map=new HashMap<>();
    
     for(int num : arr)
{
        map.put(num, map.getOrDefault(num,0)+1);

}

for(Map.Entry<Integer,Integer> entry : map.entrySet())
{
        if(entry.getValue()>1)
{
      System.out.println(entry.getKey());
}

}

}
}