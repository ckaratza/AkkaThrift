package com.impact.akkathrift

import concurrent.duration._

trait AkkaThriftConfig {
  val waitDelay = 30.seconds
  val readBufferSize:Int= 2097152 // 2 mb
}