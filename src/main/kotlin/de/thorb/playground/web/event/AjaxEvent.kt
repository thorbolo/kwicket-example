package de.thorb.playground.web.event

import org.apache.wicket.ajax.AjaxRequestTarget
import org.apache.wicket.event.Broadcast
import org.apache.wicket.event.IEvent
import org.apache.wicket.event.IEventSource
import java.io.Serializable

open class AjaxEvent(private var target: AjaxRequestTarget, val eventType : EventType) : IEvent<Any>{
    override fun getPayload(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dontBroadcastDeeper() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSource(): IEventSource {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(): Broadcast {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getTarget(): AjaxRequestTarget {
        return target
    }
}

