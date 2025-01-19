package BasicCodingStudy.collections.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {


    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        //ctr + alt + N
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        //편리한 리스트 생성
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }


}
