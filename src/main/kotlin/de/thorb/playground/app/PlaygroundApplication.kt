package de.thorb.playground.app

import de.thorb.playground.web.StartPage
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.protocol.http.WebApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class PlaygroundApplication : WebApplication() {

    override fun getHomePage(): Class<out WebPage> = StartPage::class.java

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<PlaygroundApplication>(*args)
        }
    }

}

