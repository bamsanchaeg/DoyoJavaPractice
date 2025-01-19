package BasicCodingStudy.collections.set;

public class StringHashMain {

    static final int CAPACITY = 10;


    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('C') = " + hashCode("C"));
        int hashCode = hashCode("A");
        System.out.println("hashCode = " + hashCode);

        //hashIndex
        int hashCodeA = hashIndex(hashCode("A"));
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));

    }

    static int hashCode(String str) {
        // 65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return  value %CAPACITY;
    }


}
