import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <h1 style="align-self: center;">¿Estás seguro que deseas cerrar sesión?</h1>
  <vaadin-horizontal-layout theme="" style="align-items: center; justify-content: center; width: 60%; height: 10%; align-self: center;">
   <vaadin-horizontal-layout style="width: 100%;">
    <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;">
     Si
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;">
    <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;">
     No
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
