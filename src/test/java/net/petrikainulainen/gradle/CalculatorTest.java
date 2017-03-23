/*
JUnit 4 开始使用 Java 5 中的注解（annotation），常用的几个 annotation 介绍：

@BeforeClass：针对所有测试，只执行一次，且必须为static void

@Before：初始化方法

@Test：测试方法，在这里可以测试期望异常和超时时间

@After：释放资源

@AfterClass：针对所有测试，只执行一次，且必须为static void

@Ignore：忽略的测试方法


一个单元测试用例执行顺序为：

@BeforeClass –> @Before –> @Test –> @After –> @AfterClass

每一个测试方法的调用顺序为：

@Before –> @Test –> @After
*/
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
public class CalculatorTest {  
  
    private static Calculator calculator = new Calculator();  
  
    @BeforeClass  
    public static void beforeClass1(){  
        System.out.println("@beforeClass1");  
    }  
    @BeforeClass  
    public static void beforeClass2(){  
        System.out.println("@beforeClass2");  
    }  
      
    @Before  
    public void before1() throws Exception {  
        System.out.println("@before1");  
    }  
      
    @Before  
    public void before2() throws Exception {  
        System.out.println("@before2");  
    }  
  
    @Test  
    public void testAdd() {  
        System.out.println(1);  
    }  
  
    @Test  
    public void testSubstract() {  
        System.out.println(2);  
    }  
  
    @Ignore("Multiply() Not yet implemented")  
    @Test  
    public void testMultiply() {  
        System.out.println(3);  
        fail("Not yet implemented");  
    }  
  
    @Test  
    public void testDivide() {  
        System.out.println(4);  
    }  
  
    @Test(timeout = 1000)  
    public void testSquareRoot() {  
        System.out.println(5);  
    }  
  
    @Test  
    //@Test(expected = ArithmeticException.class)  
    public void divideByZero() {  
        System.out.println(6);  
    }  
      
    @After  
    public void after1(){  
        System.out.println("@after1");  
    }  
    @After  
    public void after2(){  
        System.out.println("@after2");  
    }  
    @AfterClass  
    public static void afterClass1(){  
        System.out.println("@afterClass1");  
    }  
    @AfterClass  
    public static void afterClass2(){  
        System.out.println("@afterClass2");  
    }  
}  
