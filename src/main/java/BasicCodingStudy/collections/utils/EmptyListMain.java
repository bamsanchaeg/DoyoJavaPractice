package BasicCodingStudy.collections.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5 부터 제공되는 기능임
        List<Integer> list4 = List.of();//자바9 부터 제공되는 기능임

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3); //하나하나 돌리면서 리스트를 만들어냄

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> arr1 = List.of(arr);

        /*    순서가 중요하고 중복이 허용되는 경우**: `List` 인터페이스를 사용하자. `ArrayList` 가 일반적인 선택이지만, 추
                                              가/삭제 작업이 앞쪽에서 빈번한 경우에는 `LinkedList` 가 성능상 더 좋은 선택이다.
            **중복을 허용하지 않고 순서가 중요하지 않은 경우**: `HashSet` 을 사용하자. 순서를 유지해야 하면 `LinkedHashSet` 을, 정렬된 순서가 필요하면 `TreeSet` 을 사용하자
            **요소를 키-값 쌍으로 저장하려는 경우**: `Map` 인터페이스를 사용하자.
            순서가 중요하지 않다면 `HashMap` 을, 순서를 유지해야 한다면 `LinkedHashMap` 을, 정렬된 순서가 필요하면 `TreeMap` 을 사용하자
            **요소를 처리하기 전에 보관해야 하는 경우**: `Queue` , `Deque` 인터페이스를 사용하자. 스택, 큐 구조 모두
            `ArrayDeque` 를 사용하는 것이 가장 빠르다. 만약 우선순위에 따라 요소를 처리해야 한다면 `PriorityQueue` 를 고려하자.*/


     /*  'List` 의 경우 대부분 `ArrayList` 를 사용한다. 데이터가 크고 삭제하는게 빈번하면 linkedList를 사용한다.
         `Set` 의 경우 대부분 `HashSet` 을 사용한다. 순서가 중요하면 linked, 데이터의 값이 중요하면 Tree
         `Map` 의 경우 대부분 `HashMap` 을 사용한다.
         `Queue` 의 경우 대부분 `ArrayDeque` 를 사용한다.*/
    }
}
