import Exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

    @Test
    void joinerTest(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Joiner<Integer> joiner = new Joiner<>("-");
        Assertions.assertEquals("1-2-3-4-5", joiner.join(integerList));
    }


}
