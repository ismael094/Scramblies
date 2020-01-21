import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Scramblies_ {
    @Test
    public void with_same_string_should_return_true() {
        assertThat(Scramblies.scramble("hola","hola")).isEqualTo(true);
    }

    @Test
    public void with_portion_of_str1_in_str2_should_return_true() {
        assertThat(Scramblies.scramble("scriptingjava","javascript")).isEqualTo(true);
    }

    @Test
    public void with_no_portion_of_str1_in_str2_should_return_false() {
        assertThat(Scramblies.scramble("katas","steak")).isEqualTo(false);
    }

}
