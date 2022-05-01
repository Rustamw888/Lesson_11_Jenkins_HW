package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    public void test00() {
        assertTrue(false);
    }

    @Test
    @Disabled("Some reason")
    public void test01() {
        assertTrue(false);
    }

}
