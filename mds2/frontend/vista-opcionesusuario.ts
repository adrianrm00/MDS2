import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-opcionesusuario')
export class VistaOpcionesusuario extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_principal">
 <vaadin-vertical-layout style="width: 50%; height: 50%; align-self: center; justify-content: center;" id="container_imagen">
  <img style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/512/17/17004.png" id="img">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 300%; height: 110%; flex-direction: row; align-self: center; align-items: center;" id="container_opciones">
  <vaadin-combo-box style="width: 100%; align-self: center;" id="combo_box_opciones"></vaadin-combo-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
