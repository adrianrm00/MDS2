import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscadordecanciones')
export class VistaBuscadordecanciones extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; flex-direction: row; align-items: center;" id="container_principal">
 <vaadin-text-field label="" placeholder="Buscar Cancion" style="width: 90%;" id="tf_buscador"></vaadin-text-field>
 <vaadin-button style="width: 10%;" id="boton_buscar">
  <img style="width: 100%; height: 100%;" src="https://w7.pngwing.com/pngs/545/756/png-transparent-computer-icons-magnifying-glass-magnifying-glass-glass-logo-desktop-wallpaper.png" id="img_lupa">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
