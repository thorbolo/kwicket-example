package de.thorb.playground.web.behavior

import de.thorb.playground.web.event.AjaxEvent
import de.thorb.playground.web.event.EventType
import org.apache.wicket.Component
import java.util.Arrays

class RefreshBehavior(val onEventTypes: List<EventType>) : AjaxBehavior() {

    override fun onEvent(component: Component?, event: AjaxEvent) {
        onEventTypes
                .find { it == event.eventType }
                .apply { event.getTarget().add(component) }

    }
}

fun refreshOnEventTypes(onEvents: List<EventType>) = RefreshBehavior(onEvents)

fun refreshOnEventType(onEvents: EventType) = RefreshBehavior(Arrays.asList(onEvents))