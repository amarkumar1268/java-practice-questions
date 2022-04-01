package com.example.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterface {

    public static void main(String args[]){

        List<String> list=new ArrayList<String>();
        list.add("amar");
        list.add("kumar");
        list.add("ajay");

        //list.stream().forEach(x -> System.out.println(x));

        list.stream().filter(t -> t.startsWith("a")).forEach(x -> System.out.println());

        Map<String,Integer> map= new HashMap<String,Integer>();
        map.put("am1",1);
        map.put("am2",2);
        map.put("am3",3);

        //map.entrySet().forEach(System.out::println);

        map.forEach((k,v) -> System.out.println("key "+k+" val "+v));

    }

}
