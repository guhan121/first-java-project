import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.Matchers.*;  
import static org.hamcrest.BaseMatcher.*;
//import static org.hamcrest.core.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;


public class MyHamcrestTest {
	@Test  
	public void testHamcrest(){  
	
	
		//static <T> void assertThat(T actual, org.hamcrest.Matcher<T> matcher) 
		//Asserts that actual satisfies the condition specified by matcher. 
		//If not, an AssertionError is thrown with information about the matcher and failing value. Example:
		assertThat(0, is(1)); // fails:
		// failure message:
		// expected: is <1> 
		// got value: <0>
		assertThat(0, is(not(1))); // passes
		
		//static <T> void assertThat(java.lang.String reason, T actual, org.hamcrest.Matcher<T> matcher) 
		//Asserts that actual satisfies the condition specified by matcher. 
		//If not, an AssertionError is thrown with the reason and information about the matcher and failing value. 
		//Example:
	    assertThat("Help! Integers don't work", 0, is(1)); // fails:
		// failure message:
		// Help! Integers don't work
		// expected: is <1> 
		// got value: <0>
	    assertThat("Zero is one", 0, is(not(1))) ;// passes

	    //�Ƚ�50�Ƿ��50���  
	    assertThat(50, equalTo(50));  
		//������ȵıȽ���
		assertThat(new String[] {"foo", "bar"}, equalTo(new String[] {"foo", "bar"}));
		// 50�Ƿ����30����С��60  
		assertThat("����",50, allOf(greaterThan(30), lessThan(60)));  
		// �ж��ַ����Ƿ���.txt��β  
		assertThat("����", "abc.txt", endsWith(".txt")); 
	} 
	
	@Test  
	public void testHamcrestAnyof(){  
		//anyof��������
		assertThat("myValue", anyOf(startsWith("my"), containsString("Val")));
		assertThat("myValue", anyOf(startsWith("my"), containsString("Val1")));
	}
	@Test  
	public void testHamcrestAllof(){  
		//allofȫ������
		int index = 0;
		assertThat(String.format("testHamcrestAllof:��%d��ʧ��", ++index),"myValue", allOf(startsWith("my"), containsString("Val")));
		assertThat(String.format("testHamcrestAllof:��%d��ʧ��", ++index),"myValue", allOf(startsWith("my"), containsString("Val1")));
	}
						
}