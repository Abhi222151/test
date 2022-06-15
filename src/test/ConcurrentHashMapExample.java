package test;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {   
    public static void main(String[] args)   
    {   
        ConcurrentHashMap h=new ConcurrentHashMap();   
        h.put(100,"Stark");   
        h.put(101,"Michale");   
        h.put(101,"Ani");   
        h.put(102,"Anit"); 
       // h.put(null,"Sofia");   
        System.out.println(h);   
        
        h.putIfAbsent(100, "Abhi");
        h.remove(102,"Anit");
        h.putIfAbsent(105, "tt");
        h.replace(100, "Stark", "Steve");
        System.out.println(h);
    }   
}   
