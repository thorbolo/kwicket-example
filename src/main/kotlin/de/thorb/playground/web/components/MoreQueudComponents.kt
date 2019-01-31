package de.thorb.playground.web.components

import org.apache.wicket.Component
import org.apache.wicket.MarkupContainer
import org.apache.wicket.behavior.Behavior
import org.apache.wicket.event.IEvent
import org.apache.wicket.markup.html.form.validation.IFormValidator
import org.apache.wicket.model.IModel
import org.kwicket.AjaxHandler
import org.kwicket.component.q
import org.kwicket.wicket.core.ajax.form.KAjaxButton
import org.kwicket.wicket.core.markup.html.basic.KLabel
import org.kwicket.wicket.core.markup.html.form.KForm
import org.kwicket.wicket.core.markup.html.form.KTextArea

fun MarkupContainer.ajaxButton(
        id: String,
        onSubmit: AjaxHandler,
        outputMarkupId: Boolean? = null,
        outputMarkupPlaceholderTag: Boolean? = null,
        behaviors: List<Behavior>? = null
) = q(
        KAjaxButton(
                id = id,
                onSubmit = onSubmit,
                outputMarkupId = outputMarkupId,
                outputMarkupPlaceholderTag = outputMarkupPlaceholderTag,
                behaviors = behaviors
        )
)

fun MarkupContainer.form(
        id: String,
        model: IModel<*>? = null,
        outputMarkupPlaceholderTag: Boolean? = null,
        outputMarkupId: Boolean? = null,
        behaviors: List<Behavior>? = null,
        validators: List<IFormValidator>? = null
) = q(
        KForm(
                id = id,
                model = model,
                outputMarkupPlaceholderTag = outputMarkupPlaceholderTag,
                outputMarkupId = outputMarkupId,
                behaviors = behaviors,
                validators = validators
        )
)