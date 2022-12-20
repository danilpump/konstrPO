package kpo_task3;

import java.sql.Timestamp;
import java.util.HashMap;

public class MapWrapper<K, V> extends HashMap<K, V> {
    HashMap<K, V> map = new HashMap<>();
    HashMap<String, Timestamp> tmap = new HashMap<>();
    private Long timeCritical = 2000L;

    @Override
    public V get(Object key) {
        System.out.println("Key request: " + key.toString());
        if ((tmap.get(key).getTime()+timeCritical) - System.currentTimeMillis() < 0) {
            return null;
        } else {
            System.out.println("Time until delete value: " + (tmap.get(key).getTime() -System.currentTimeMillis()+timeCritical));
            return map.get(key);
        }
    }

    @Override
    public V put(K key, V value) {
        tmap.put(key.toString(), new Timestamp(System.currentTimeMillis()));
        return map.put(key, value);
    }
}
