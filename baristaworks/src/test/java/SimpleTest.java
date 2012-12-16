import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.security.crypto.password.StandardPasswordEncoder;


public class SimpleTest {
  
  @Test
  public void testCrypto() {
    StandardPasswordEncoder encoder = new StandardPasswordEncoder();
    String actural = encoder.encode("koala");
    assertEquals("4efe081594ce25ee4efd9f7067f7f678a347bccf2de201f3adf2a3eb544850b465b4e51cdc3fcdde",actural);
  }

}
