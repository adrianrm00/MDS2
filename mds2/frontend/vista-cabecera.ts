import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera')
export class VistaCabecera extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: column;" id="container_principal">
 <vaadin-vertical-layout id="container_cabecera" style="flex-direction: row; width: 100%; height: 15%; background-color: red; position: sticky;">
  <vaadin-vertical-layout style="width: 15%; height: 100%; flex-direction: row; background-color: coral; align-self: center; align-items: center;" id="container_spotyual">
   <vaadin-vertical-layout style="height: 100%; width: 20%;" id="container_img">
    <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 80%; align-self: center;" id="container_label">
    <label style="width: 100%; font-size:32px; font-weight:bold;" id="label_spotyual">SpotyUAL</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 55%; height: 100%; align-self: center; justify-content: center;" id="container_buscador_biblioteca">
   <vaadin-vertical-layout id="container_buscador_biblioteca_centrado" style="width: 100%; align-self: center;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 30%; justify-content: center; height: 100%; align-self: center;" id="container_opciones_usuario">
   <vaadin-vertical-layout id="container_opc_usuario_centrado" style="width: 100%; align-self: center; height: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_contenido_total" style="width: 100%; height: 75%; flex-direction: row;">
  <vaadin-vertical-layout id="container_menu_lateral" style="width: 15%; height: 100%; ;background-color: blue;">
   <vaadin-vertical-layout id="container_menu_lateral_centrado" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_contenido" style="width: 85%; height: 100%;">
   <vaadin-vertical-layout id="container_contenido_centrado" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_reproductor" style="width: 100%; height: 10%; background-color:green;">
  <vaadin-vertical-layout id="container_reproductor_centrado" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
