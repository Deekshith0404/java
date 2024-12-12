package com.xworks.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        Map<String,Long> personMap=new HashMap<>();
        personMap.put("John", 9876543210L);
        personMap.put("Alice", 8765432109L);
        personMap.put("Bob", 7654321098L);
        personMap.put("David", 6543210987L);
        personMap.put("Emma", 5432109876L);
        personMap.put("Fiona", 4321098765L);
        personMap.put("George", 3210987654L);
        personMap.put("Hannah", 2109876543L);
        personMap.put("Ian", 1098765432L);
        personMap.put("Julia", 1987654321L);


        Map<String,Long> personMap2=new HashMap<>();
        personMap2.put("raman",1254789634l);
        personMap2.put("raman",4896278621l);
        personMap2.put("raman",1254789634l);
        personMap2.put("raman",5496249621l);
        personMap2.put("raman",1254789634l);
        System.out.println("size :"+personMap.size());
        System.out.println("----------compute----------");
        personMap.compute("Hannah",(k,v)->(v==null)? 120:v+50);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));
       System.out.println("-----------compute if absent----------");
      personMap.computeIfAbsent("rohan",key->25l);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("--------------compute if present----");
        personMap.computeIfPresent("Ian",(k,v)->v+360l);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("---contains key---");
        boolean result=personMap.containsKey("deekshith");
        System.out.println("contains key "+result);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("----contains value---");
        boolean result1=personMap.containsValue(1256);
        System.out.println("contains value 1256"+result1);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("------------entry set-------------");
        System.out.println(personMap.entrySet());
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("-----for each---------");
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));
        System.out.println("----------get-----------");
        long res=personMap.get("Bob");
        System.out.println("the result of key bob is :"+res);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("---------------getordefault--------------");
        long resp=personMap.getOrDefault("suman",15639l);
        System.out.println(resp);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("------------------hashcode--------------------------");
        int resp1=personMap.hashCode();
        System.out.println(resp1);
        System.out.println("-----------------isempty--------------");
        boolean resp2=personMap.isEmpty();
        if (resp2==true){
            System.out.println("the is empty");
        }else {
            System.out.println("it contains value");
        }
        System.out.println("----------keyset-----------");
        System.out.println(personMap.keySet());
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("-----------merge----------");
        personMap.merge("Druv",6543210987L,(o,n)->o+n);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("-----------putAll--------------");
        personMap.putAll(personMap2);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));
        System.out.println("-------------putifabsent---------------------");
        personMap.putIfAbsent("suman",1563l);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("------------------remove---------------------");
        personMap.remove("Ian");
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("-----------------remove(k,v)------------------");
        personMap2.remove("raman",1254789634l);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("------------------replace(k,ov.nv)----------------");
        personMap.replace("Emma",5432109876L,5432109876L);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));

        System.out.println("--------------------replace(k,v)----------------------");
        personMap.replace("George",4563l);
        personMap.forEach((k,v)-> System.out.println(k+" : keys and values :"+v));


        personMap2.replaceAll((k,v)->v+15236);
        personMap2.forEach((k,v)-> System.out.println(k+"  "+v));


        System.out.println("values");
        Collection<Long> result5=personMap.values();
        System.out.println(result5);


        System.out.println("-------------clear---------------");
        personMap.clear();
        System.out.println(personMap.size());
    }
}
