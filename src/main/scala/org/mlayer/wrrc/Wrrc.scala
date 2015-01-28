package org.mlayer.wrrc

import java.io.File

object Wrrc {

  val WRRC_PATH = "/Users/mdv/Yandex.Disk/Media/Music/wrrc/wrrc"

  def main(args: Array[String]) {
    printDisk()
  }

  def printDisk() = {
    val baseFolder = new File(WRRC_PATH)
    baseFolder.listFiles().map(folder => if (folder.isDirectory) wiki(folder))

    def wiki(folder: File) = {
      val result = "[[disk_%s.song_%s|%s]] \\\\"
      val name = folder.getName
      folder.listFiles().map(f => println(result.format(name, f.getName.substring(0, 2), f.getName)))
    }
  }
}
