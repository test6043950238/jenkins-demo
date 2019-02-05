package pl.p.lodz.jenkinsdemo;

import org.junit.jupiter.api.*;

class JenkinsDemoTest{

    public JenkinsDemo jd;

    @BeforeEach
    public void setup(){
        jd = new JenkinsDemo();
    }

    @DisplayName("Test Demo with number: 1")
    @Test
    public void testNumberOne() {
        String demoString = jd.demo(1);
        Assertions.assertEquals(demoString, "1");
    }

    @DisplayName("Test Demo with number: 2")
    @Test
    public void testNumberTwo() {
        String demoString = jd.demo(2);
        Assertions.assertEquals(demoString, "It's a two");
    }

    @DisplayName("Test Demo with number: 4")
    @Test
    public void testNumberFour() {
        String demoString = jd.demo(4);
        Assertions.assertEquals(demoString, "It's a four");
    }

    @AfterEach
    public void tearDown() {
        jd = null;
    }
}