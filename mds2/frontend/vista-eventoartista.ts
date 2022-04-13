import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-eventoartista')
export class VistaEventoartista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
  <label style="width: 100%;">Nombre del concierto </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
  <label style="width: 100%;">Ciudad</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
  <label style="width: 100%;">Fecha del evento</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;">
   <vaadin-button>
    Editar
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-button>
    Borrar
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
