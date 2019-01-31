package de.thorb.playground.web.behavior

import de.thorb.playground.web.event.AjaxEvent
import org.apache.wicket.Component
import org.apache.wicket.behavior.Behavior
import org.apache.wicket.event.IEvent

abstract class AjaxBehavior : Behavior() {
    final override fun onEvent(component: Component?, event: IEvent<*>?) {
        if (event is AjaxEvent) {
            onEvent(component, event)
        }
    }

    abstract fun onEvent(component: Component?, event: AjaxEvent)
}