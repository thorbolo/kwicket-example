package de.thorb.playground.app

import org.apache.wicket.protocol.http.WicketFilter
import org.apache.wicket.spring.SpringWebApplicationFactory
import org.springframework.boot.web.servlet.ServletContextInitializer
import org.springframework.context.annotation.Configuration
import javax.servlet.ServletContext

@Configuration
class PlaygroundWebInitializer : ServletContextInitializer {
    override fun onStartup(servletContext: ServletContext) {
        val filter = servletContext.addFilter("wicket-filter", WicketFilter(PlaygroundApplication()))
        filter.setInitParameter(WicketFilter.APP_FACT_PARAM, SpringWebApplicationFactory::class.java.name)
        filter.setInitParameter("applicationBean", "wicketApplication")
        filter.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*")
        filter.addMappingForUrlPatterns(null, false, "/")
    }
}

