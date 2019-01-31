package de.thorb.playground.web

import org.apache.wicket.markup.head.CssHeaderItem
import org.apache.wicket.markup.head.IHeaderResponse
import org.apache.wicket.markup.head.JavaScriptHeaderItem
import org.apache.wicket.markup.html.WebPage

open class BasePage : WebPage() {

    override fun renderHead(response: IHeaderResponse) {
        super.renderHead(response)
        response.render(CssHeaderItem.forUrl("lib/bootstrap/bootstrap.css"));
        response.render(JavaScriptHeaderItem.forUrl("lib/bootstrap/bootstrap.js"));
    }
}