package map;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class DemoTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.putIfAbsent(32, "3");
        System.out.println(map);
        map.replace(32, "3", "1");
        System.out.println(map);
        map.put(1, "36");
        map.put(0, "35");
        map.put(10, "38");
        map.put(12, "18");
        map.put(-10, "48");
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println(map.ceilingKey(11) + "<- map.ceilingKey(11)");
        System.out.println(map.lowerEntry(10) + "<- map.lowerEntry(10)");
        System.out.println(map.higherEntry(10) + "<- map.higherEntry(10)");
        System.out.println(map.floorEntry(10) + "<- map.floorEntry(10)");
        System.out.println(map.ceilingEntry(10) + "<- map.ceilingEntry(10)");
        System.out.println(map.headMap(10) + "<- map.headMap(10)");
        System.out.println(map.tailMap(10) + "<- map.tailMap(10)");
        System.out.println(map.subMap(0, true, 10, true).entrySet()
                + "<- map.subMap(0, true, 10, true)");
        System.out.println(map.navigableKeySet().descendingSet());
        System.err.println(map.values());

        Comparator<String> cmp = (String str1, String str2) -> {
            return str1.length() - str2.length();
        };
        Map<String, String> testMap = new TreeMap<>(cmp.reversed());

        testMap.put("fr", "ferf3re");
        testMap.put("frggg", "fe2rfre");
        testMap.put("fer", "fer4fre");

        System.out.println(testMap);

        try {
            meth(new ObjectOutputStream(new FileOutputStream(new File("ferf"))));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void meth(ObjectOutputStream oos) throws IOException {
        String testMap = null;
        try {
            throw new CloneNotSupportedException();
//            oos.writeObject(testMap);
        }
        catch (Exception ex) {
            IOException exception = new IOException();
            exception.initCause(ex);
            throw exception;
        }
        finally {
            System.out.println("finally");
        }
    }
}
