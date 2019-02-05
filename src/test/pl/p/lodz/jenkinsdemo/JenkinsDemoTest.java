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
        String demoString = jd.test(1);
        Assertions.assertEquals(demoString, "1");
    }

    @AfterEach
    public void tearDown() {
        jd = null;
    }
}