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
    public void with_portion_of_str1_in_str2_should_return_true() {
        assertThat(scramble("cedewaraaossoqqyt","codewars")).isEqualTo(true);
    }

    private boolean scramble(String str1, String str2) {
        Long collect = str2.chars()
                .filter(i -> !str1.contains((char) i + ""))
                .mapToObj(i -> (char) i)
                .collect(Collectors.counting());
        return collect == 0;

    }
}
