import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Scramblies_ {
    @Test
    public void with_same_string_should_return_true() {
        assertThat(scramble("hola","hola")).isEqualTo(true);
    }

    private boolean scramble(String str1, String str2) {
        return false;
    }
}
