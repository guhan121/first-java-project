import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.Matchers.*;  
import static org.junit.Assert.*;  
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
public class BiscuitTest extends TestCase { 
	public void testEquals() { 
		String theBiscuit = new String("Ginger"); 
		String myBiscuit = new String("Ginger"); 
		assertThat(theBiscuit, equalTo(myBiscuit)); 
	} 
}
