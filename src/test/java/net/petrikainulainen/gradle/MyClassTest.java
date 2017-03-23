import java.util.logging.Logger;

import org.junit.Test;

public class MyClassTest {
   
   private static final Logger log = Logger.getLogger(MyClassTest.class.getName());

   @Test
   public void testFormatArray() {
      MyClass myClass = new MyClass();
      
      String[] stringArray = { 
            "1", "2", "3", "Four", "5"
      };
      String formatted = myClass.formatArray(stringArray);
      log.info(formatted);
   }

}
