package BasicCodingStudy.collections.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        //코드 작성
        String[] words = text.split(" ");
        for (String word : words) {
/*            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
*/
            //단어가 없다면 0을 기본으로 반환한다.
            //getOrDefault()` 메서드를 사용하면 키가 없는 경우 대신 사용할 기본 값을 지정할 수 있다.
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }

}
