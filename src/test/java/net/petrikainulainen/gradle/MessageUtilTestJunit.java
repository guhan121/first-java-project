import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
public class TestJunit {

   String message = "Hello World";  
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
   
   @Ignore
   @Test
   public void testPrintMessage1() {
      message = "New Word";
      assertEquals(message,messageUtil.printMessage());
   }
}