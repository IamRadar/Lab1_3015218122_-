package test;

import org.junit.Test;

import junit.framework.Assert;
import test_case.test_case;

public class test {
  @Test
  public void testtriangle(){
	  test_case at=new test_case();
	  Assert.assertEquals("equilateral",at.triangle(3, 3, 3));
	  Assert.assertEquals("isoscele",at.triangle(3, 3, 2));
	  Assert.assertEquals("not a triangle", at.triangle(1, 3, 4));
  }
}
