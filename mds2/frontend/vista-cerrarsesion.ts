import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cerrarsesion')
export class VistaCerrarsesion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal">
 <h1 style="align-self: center;" id="h1">¿Estás seguro que deseas cerrar sesión?</h1>
 <vaadin-horizontal-layout theme="" style="align-items: center; justify-content: center; width: 60%; height: 10%; align-self: center;" id="container_botones_finales">
  <vaadin-horizontal-layout style="width: 100%;" id="container_boton_no">
   <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;" id="boton_no">
    No
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%;" id="container_boton_si">
   <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;" id="boton_si">
    Si
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
