//문제 : my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return (공백(" ")도 하나의 문자로 구분)
//풀이 : Arrays.asList()로 my_string.split("")로 복제하여 받은 Stream을 생성하여 중복제거 후 joining()를 이용해 합쳐서 return 
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        
        return Arrays.asList(my_string.split("")).stream()
                .distinct()
                .collect(Collectors.joining());

    }
}