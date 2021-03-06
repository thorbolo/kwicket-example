package de.thorb.playground.web

import de.thorb.playground.web.behavior.refreshOnEventType
import de.thorb.playground.web.components.ajaxButton
import de.thorb.playground.web.components.form
import de.thorb.playground.web.event.AjaxEvent
import de.thorb.playground.web.event.EventType
import org.apache.wicket.event.Broadcast
import org.kwicket.model.ldm
import org.kwicket.wicket.core.queued.label
import java.time.LocalDateTime


class StartPage : BasePage() {

    init {

        form("form")

        label(
                id = "test",
                model = { LocalDateTime.now() }.ldm(),
                outputMarkupId = true,
                behavior = refreshOnEventType(EventType.REFRESH_TIME)
        )

        ajaxButton(
                id = "button",
                onSubmit = { target -> send(page, Broadcast.EXACT, AjaxEvent(target, EventType.REFRESH_TIME)) }
        )

    }

}