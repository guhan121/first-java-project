/*
JUnit 4 ��ʼʹ�� Java 5 �е�ע�⣨annotation�������õļ��� annotation ���ܣ�

@BeforeClass��������в��ԣ�ִֻ��һ�Σ��ұ���Ϊstatic void

@Before����ʼ������

@Test�����Է�������������Բ��������쳣�ͳ�ʱʱ��

@After���ͷ���Դ

@AfterClass��������в��ԣ�ִֻ��һ�Σ��ұ���Ϊstatic void

@Ignore�����ԵĲ��Է���


һ����Ԫ��������ִ��˳��Ϊ��

@BeforeClass �C> @Before �C> @Test �C> @After �C> @AfterClass

ÿһ�����Է����ĵ���˳��Ϊ��

@Before �C> @Test �C> @After
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
