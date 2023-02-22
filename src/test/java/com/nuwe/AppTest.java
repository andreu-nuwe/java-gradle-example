package com.nuwe;
import org.junit.Test;

import com.nuwe.App;

import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  public void myPassedTest() {
      assertEquals(7, App.sum2(3, 4));
  }
  
  /*
  @Test
  public void myFailedTest() {
    assertEquals(9, App.sum2(3, 9));
  }
  */
}
