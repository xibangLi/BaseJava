package com.bang.list;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by bang on 18-1-11.
 */
public class Iterator {



    public static void main(String[] args) {
        //Map -> AbstractMap ->HashMap
        Map<String,Object> map = new HashMap<>();
        map.put("name","lixibang");

        //Map -> AbstractMap -> HashMap -> LinkedHashMap
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name","jiangmeng");

        //Map -> AbstractMap ->
        Map<String,Object> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("name","li si");



    }

}
