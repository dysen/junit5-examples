import org.junit.jupiter.api.*;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Created by alemdianov on 2/10/17.
 */
@RunWith(JUnitPlatform.class)
public class TestJUnit1 {

    @BeforeAll
    static void initAll() {
        System.out.println("Initializing external resources...");

    }

    @BeforeEach
    void initMock() {
        System.out.println("Initializing mock objects...");
    }

    @Test
    @DisplayName("Test # 1")
    void someTest() {
        System.out.println("Running some test...");
        assertTrue(true);
    }

    @Test
    @DisplayName("Test # 2")
    void otherTest() {
        assumeTrue(true);
    }

    @Test
    @DisplayName("Test # 3")
    @Disabled("Not implemented yet")
    void disabledTest() {
        System.exit(1);
    }

    @Test
    @DisplayName("Assertion null")
    void testAssert() {
        assertNull(null, () -> "Some test");
    }

    @Test
    @DisplayName("Assertion many")
    void testAssertArray() {
        assertAll("Do many assertions", () -> {
                    assertNull(null, () -> "Some test");
                    assertNotNull("123", () -> "Some test");
                    assertEquals("123", "123", "some asset ");

                }


        );
    }


    @Test
    @DisplayName("Assumption")
    void testAssump() {
        assumeTrue(true, () -> "Some test");
    }

@Nested
@DisplayName("Nested giga test ")
class GlobalNested {
    @Nested
    @DisplayName("Nested Suite 1")
    class NestedTestSuite {
        @Test
        @DisplayName("Nested test 1")
        void test1() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 2")
        void test2() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 3")
        void test3() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 4")
        void test4() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 5")
        void test5() {
            assertTrue(true, () -> "text goes here");
        }

    }
    @Nested
    @DisplayName("Nested Suite 1")
    class NestedTestSuiteTwo {
        @Test
        @DisplayName("Nested test 1")
        void test1() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 2")
        void test2() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 3")
        void test3() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 4")
        void test4() {
            assertTrue(true, () -> "text goes here");
        }

        @Test
        @DisplayName("Nested test 5")
        void test5() {
            assertTrue(true, () -> "text goes here");
        }

    }
}

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down...");
    }

    @AfterAll
    static void freeExternalResources() {
        System.out.println("Freeing external resources...");
    }

}
