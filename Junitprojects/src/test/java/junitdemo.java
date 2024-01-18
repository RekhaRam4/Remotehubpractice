import org.junit.*;

public class junitdemo {
    @BeforeClass
    public static void beftestsuite()
    {
        System.out.println("this test is executed before test suite");
    }
    @Before
    public void beforetest()
    {
        System.out.println("method is executed each and every test");
    }
    @Test
    public void test1()
    {
        System.out.println("first test executed");
    }
    @Test
    public void test2()
    {
        System.out.println(("second test executed"));
    }
    @After
    public void aftertest()
    {
        System.out.println(("test is executed after all test"));
    }
    @AfterClass
    public static void aftestsuite()
    {
        System.out.println("method is executed after all test cases");
    }

}
