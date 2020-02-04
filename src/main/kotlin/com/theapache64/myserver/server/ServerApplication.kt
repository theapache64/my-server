package com.theapache64.myserver.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.net.InetAddress
import java.net.URL

@SpringBootApplication
class ServerApplication

fun main(args: Array<String>) {
    runApplication<ServerApplication>(*args)
    println("Host address is ${InetAddress.getLocalHost().hostAddress}")
    println("Host IP is ${InetAddress.getLocalHost().hostName}")
    println("Public IP is ${getPublicIP()}")
}

fun getPublicIP(): String {
    return URL("http://bot.whatismyipaddress.com/").readText()
}
