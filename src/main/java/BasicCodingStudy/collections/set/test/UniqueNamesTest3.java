package BasicCodingStudy.collections.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {


    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        //ctr + alt + N
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }


}
