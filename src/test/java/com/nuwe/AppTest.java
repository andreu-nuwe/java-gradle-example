package com.nuwe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  public void firstTest() {
    String[] strs = {"flower", "flow", "flight"};
    assertEquals("fl", App.longestCommonPrefix(strs));
  }

  @Test
  public void voidTest() {
    String[] strs = {"dog", "racecar", "car"};
    assertEquals("", App.longestCommonPrefix(strs));
  }

  @Test
  public void endTest() {
    String[] strs = {"dog", "donkey", "do"};
    assertEquals("do", App.longestCommonPrefix(strs));
  }

  @Test
  public void fullEqual() {
    String[] strs = {"dog", "dog", "dog"};
    assertEquals("dog", App.longestCommonPrefix(strs));
  }

}
