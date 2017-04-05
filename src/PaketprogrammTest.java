import org.junit.Test;

import junit.framework.Assert;

public class PaketprogrammTest {

@Test	
public void testStraighForward() {
  double volumen = new Paketprogramm().getVolumen(2, 3, 4);  
  Assert.assertEquals((double)24, volumen);
}

@Test	
public void testNegativeValue() {
  double volumen = new Paketprogramm().getVolumen(-2, 3, 4);  
  Assert.assertEquals((double)-24, volumen);
}

@Test	
public void testNegative() {
  double volumen = new Paketprogramm().getVolumen(-2, -3, 4);  
  Assert.assertEquals((double)24, volumen);
}

@Test	
public void testNegativeV() {
  double volumen = new Paketprogramm().getVolumen(-2, -3, -4);  
  Assert.assertEquals((double)-24, volumen);
}

}