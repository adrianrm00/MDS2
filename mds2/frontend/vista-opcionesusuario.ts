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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout style="width: 30%; height: 100%;">
  <img style="width: 100%; height: 100%;" src="http://assets.stickpng.com/images/585e4beacb11b227491c3399.png">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center; align-self: center;">
  <vaadin-combo-box style="width: 100%; align-self: center;"></vaadin-combo-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
