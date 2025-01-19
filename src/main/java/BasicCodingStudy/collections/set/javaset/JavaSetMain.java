package BasicCodingStudy.collections.set.javaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        //run(new HashSet<String>());
        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);
        Iterator<String> iterator = set.iterator();
        // 다음 데이터가 있는지 확인한다
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " "); // 다음 데이터를 반환한다
        }
    }
}
