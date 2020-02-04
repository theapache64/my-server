package com.theapache64.myserver.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.net.InetAddress

@SpringBootApplication
class ServerApplication

fun main(args: Array<String>) {
    runApplication<ServerApplication>(*args)
    println("IP is ${InetAddress.getLocalHost().hostAddress}")
    println("IP is ${InetAddress.getLocalHost().hostName}")
}
