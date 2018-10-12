import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstJunit5Tests {

    @Test
    void testName() throws Exception {
        assertEquals(2, 1 + 1);
    }

}
