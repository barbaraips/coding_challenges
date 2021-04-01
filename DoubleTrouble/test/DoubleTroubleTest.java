import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class DoubleTroubleTest {

    @Test
    void testDoubleTrouble() {

        List<String> people = new ArrayList<>();
        people.add("Sheldon");
        people.add("Leonard");
        people.add("Penny");
        people.add("Rajesh");
        people.add("Howard");

        //Expected state of the queue by the 6th run:
        //Sheldon, Leonard, Leonard, Penny, Penny, Rajesh, Rajesh, Howard, Howard, Sheldon, Sheldon
        Assertions.assertEquals("Sheldon", DoubleTrouble.doubleTrouble(people, 6));

    }
}