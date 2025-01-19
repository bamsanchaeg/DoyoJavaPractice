package BasicCodingStudy.collections.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> interaction = new HashSet<>(set1);
        interaction.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.retainAll(set2);

        System.out.println("합집합 : " + union);
        System.out.println("교집합 : " + interaction);
        System.out.println("차집합 : " + difference);
    }
}
