import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Scramblies_ {
    @Test
    public void with_same_string_should_return_true() {
        assertThat(scramble("hola","hola")).isEqualTo(true);
    }

    @Test
    public void with_portion_of_str2_in_str1_should_return_true() {
        assertThat(scramble("cedewaraaossoqqyt","codewars")).isEqualTo(true);
    }

    private boolean scramble(String str1, String str2) {
        if (str1.equals(str2))
            return true;
        Stream<Character> characterStream = str2.chars()
                .filter(i -> !str1.contains((char) i + ""))
                .mapToObj(i -> (char) i);
        int size = characterStream.collect(Collectors.toList()).size();
        return size == 0;

    }
}
