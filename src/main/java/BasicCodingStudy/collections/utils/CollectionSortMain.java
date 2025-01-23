package BasicCodingStudy.collections.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max =" + max);
        System.out.println("min = " + min);
        Collections.shuffle(list);
        System.out.println("shuffle List = " + list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);

        //list.sort를 쓰는게 더 낫다.
    }
}
