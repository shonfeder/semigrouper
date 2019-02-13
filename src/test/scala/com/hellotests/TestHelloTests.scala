package com.hellotests

import org.scalatest.junit.JUnitSuite
import junit.framework.Assert._
import org.junit.Test

class TestHelloTests extends JUnitSuite {
  val ht = new HelloTests

  @ Test def helloTestsTest {
    assertEquals(4, ht.add(2,2))
  }
}
