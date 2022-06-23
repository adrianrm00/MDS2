package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-scroller template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-scroller")
@JsModule("./vista-scroller.ts")
public class VistaScroller extends LitTemplate {

    @Id("contianer_Scroller")
	private Scroller contianer_Scroller;

	/**
     * Creates a new VistaScroller.
     */
    public VistaScroller() {
        // You can initialise any data required for the connected UI components here.
    }

}
