package io.pankona

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

data class LaunchRequest(val launch: Array<launchURL>)
data class launchURL(val launchUrl: String, val appType: String)

fun main(args: Array<String>) {
    val json = "{\"launch\":[{\"launchUrl\":\"http://fraunhoferfokus.github.io/node-hbbtv/www/cs-app.html?app2appURL=ws://192.168.0.106:8080/remote/\",\"appType\":\"html\"}]}"
    val mapper = jacksonObjectMapper()

    val request = mapper.readValue<LaunchRequest>(json)

    println(request)
    println(request.launch[0])
    println(request.launch[0].launchUrl)
}
