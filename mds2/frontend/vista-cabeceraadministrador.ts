import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabeceraadministrador')
export class VistaCabeceraadministrador extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 10%; background-color: #EAEDED;" id="container_cabecera">
  <vaadin-horizontal-layout style="width: 20%; height: 100%;" id="container_spotyual">
   <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%;" id="container_img">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="container_p">
    <p style="font-size: 30px; font-weight: bold; width: 100%; height: 50%; flex-grow: 0; flex-shrink: 0; margin-top: 20%;" id="p_spotyual">SpotyUAL</p>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-s" style="width: 80%; height: 100%; justify-content: flex-end;" id="container_administrador">
   <img style="height: 50%; width: 5%; align-self: center;" src="https://e7.pngegg.com/pngimages/858/581/png-clipart-profile-icon-user-computer-icons-system-chinese-wind-title-column-miscellaneous-service.png" id="img_administrador">
   <label style="font-size: 20px; font-weight: bold; align-self: center;" id="label_administrador">Administrador</label>
   <vaadin-button style="align-self: center; margin-right: var(--lumo-space-m);" id="boton_salir">
     Salir 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_contenido"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
