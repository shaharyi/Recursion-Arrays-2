import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAll {
   
   int[] a;
   
   @BeforeAll
   static void initAll() {      
   }

   @BeforeEach
   void init() {
      a = new int[] { 5, 8, 1, 5, 9, 2 };
   }
   
   @Test
   public void testMax()
   {
      int m = Main.findMax(a);
      assertEquals(m, 9);     
   }
   
   @Test
   public void testMin()
   {
      int m = Main.findMin(a);
      assertEquals(m, 1);     
   }
}
