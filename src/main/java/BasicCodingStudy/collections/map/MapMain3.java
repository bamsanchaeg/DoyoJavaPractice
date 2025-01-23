package BasicCodingStudy.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1 (이 키가 없는 경우에만 데이터를 넣을거야)
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);

    }
}
