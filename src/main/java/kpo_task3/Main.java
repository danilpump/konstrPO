package kpo_task3;

public class Main {
    public static void main(String[] args) {
        MapWrapper<String, String> map = new MapWrapper<>();

        map.put("key1","value1");
        try{Thread.sleep(3000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(map.get("key1"));

        map.put("key2","value2");
        try{Thread.sleep(3000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(map.get("key2"));

        map.put("key3","value3");
        try{Thread.sleep(2100);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(map.get("key3"));

        map.put("key4","value4");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println(map.get("key2"));
        System.out.println(map.get("key4"));
    }
}
