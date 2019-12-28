
import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
//    private int num;
//    private String result;
//
//
//    public FizzBuzzTest(int num, String result) {
//        this.num = num;
//        this.result = result;
//    }
//
//    @Parameterized.Parameters
//    public static Collection prepareData(){
//        return Arrays.asList(new Object[][] {
//                { 2, "fizz" }
//        });
//    }
//
//
//    @Test
//    public void test() throws Exception{
//        assertThat(new FizzBuzz().of(num)).isEqualTo(result);
//    }


 @Test
 public void fizz_buzz_test_error() {
  FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(88)).isEqualTo("88");
 }

 @Test
 public void fizz_buzz_test_right() {
  FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(88)).isEqualTo("88");
 }
}
