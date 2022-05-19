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
 <vaadin-vertical-layout id="container_cabecera" style="flex-direction: row; width: 100%; height: 15%; background-color: red;">
  <vaadin-vertical-layout style="width: 15%; height: 100%; flex-direction: row; background-color: coral;" id="container_spotyual">
   <vaadin-vertical-layout style="height: 100%; width: 20%;" id="container_img">
    <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 80%; align-self: center;" id="container_label">
    <label style="width: 100%; font-size:32px; font-weight:bold;" id="label_spotyual">SpotyUAL</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 65%; height: 100%; flex-direction: row; align-self: center;" id="container_buscador_biblioteca"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 20%; justify-content: center; height: 100%; align-self: center;" id="container_opciones_usuario"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_contenido_total" style="width: 100%; height: 75%; flex-direction: row;">
  <vaadin-vertical-layout id="container_menu_lateral" style="width: 15%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_contenido" style="width: 80%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_reproductor" style="width: 100%; height: 10%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
