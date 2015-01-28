package org.mlayer.wrrc

import org.scalatest.FunSuite

class WrrcTest extends FunSuite {
  test("printDisk works") {
    assert(Wrrc.printDisk() === "hello")
  }
}
