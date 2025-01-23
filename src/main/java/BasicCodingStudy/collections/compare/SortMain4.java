package BasicCodingStudy.collections.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",20);
        MyUser myUser3 = new MyUser("c",10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null); // 객체가 이미 내것의 데이터를 가지고 있는게 더 객체 지향적이기 떄문에 이 정렬 사용을 권장한다.
        //Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new Idcomparator());
        //Collections.sort(list,new Idcomparator());
        System.out.println(list);

    }
}
