package BasicCodingStudy.collections.set.member;

import BasicCodingStudy.collections.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set =  new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        //참조값 그대로 출력
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        System.out.println("Aa.hashCode() = " + "Aa".hashCode());
        System.out.println("BB.hashCode() = " + "BB".hashCode());
    }
}
