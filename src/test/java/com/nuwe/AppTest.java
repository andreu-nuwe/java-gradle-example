package com.nuwe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  public void firstTest() {
    String[] strs = {"flower","flow","flight"};
    assertEquals("fl", App.longestCommonPrefix(strs));
  }

  @Test
  public void secondTest() {
    String[] strs = {"dog","racecar","car"};
    assertEquals("", App.longestCommonPrefix(strs));
  }

}
