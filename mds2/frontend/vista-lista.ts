import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista')
export class VistaLista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; margin-right: var(--lumo-space-s); margin-left: var(--lumo-space-s);" id="container_eliminar">
  <vaadin-button style="width: 100%;" id="boton_eliminar">
    Eliminar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; margin-right: var(--lumo-space-s); margin-left: var(--lumo-space-s);" id="container_compartir">
  <vaadin-button style="width: 100%;" id="boton_compartir">
    Compartir 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; margin-right: var(--lumo-space-s); margin-left: var(--lumo-space-s);" id="container_reproducir">
  <vaadin-button style="width: 100%;" id="boton_reproducir">
    Reproducir 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
