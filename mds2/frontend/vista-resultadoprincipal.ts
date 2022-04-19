import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-resultadoprincipal')
export class VistaResultadoprincipal extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_principal_ajustado">
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_imagen_y_nombre">
   <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_imagen">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_nombre">
    <label style="align-self: center; font-weight:bold; font-size:20px;" id="nombre_cancion">Nombre Cancion</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_informacion">
   <label id="informacion">Informacion de la cancion</label>
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
