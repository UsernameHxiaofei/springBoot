package cn.itcast.day01;


import cn.itcast.day01.exception.HeightException;
import cn.itcast.day01.exception.WidthException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cs {
    public static void main(String[] args) {
        mapTest(); //{001=张三, 002=LA, 003=WW, 004=ZL, 005=TQ}

    }

    public static void mapTest () {
        Map<String, String> map = new HashMap<String, String>();

        map.put("001","张三");
        map.put("002","LA");
        map.put("003","WW");
        map.put("004","ZL");
        map.put("005","TQ");


//        System.out.println("map = " + map);

//        Set<String> keys = map.keySet();
//        System.out.println("keys = " + keys);
//        for (String key : keys) {
//            System.out.println("key = " + key);
//            System.out.println(map.get(key));
//
//        }


        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static  Integer  getValue (Integer width, Integer height) {
        try {
            if (null != width) {
                throw new WidthException("width不存在");
            }
            if (null != height) {
                throw new HeightException("height不存在");
            }

            return width * height;
        } catch (WidthException e) {
            e.printStackTrace();
            return  null;
        } catch (HeightException e) {
            e.printStackTrace();
            return  null;
        }


}





}
