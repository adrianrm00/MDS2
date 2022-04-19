import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-dardebajaunperfil')
export class VistaDardebajaunperfil extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_titulo_ajustado">
   <label style="align-self: center;" id="label_titulo">Dar de baja un perfil</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_contenido">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_fondo_contenido">
   <vaadin-vertical-layout style="width: 80%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center;" theme="spacing" id="container_contenido_ajustado">
    <vaadin-vertical-layout style="align-self: center; width: 60%;" id="container_buscador_perfil"></vaadin-vertical-layout>
    <vaadin-text-field label="Nombre usuario:" placeholder="xxxxxxxxxxxx" style="width: 100%;" id="tf_nombre_usuario"></vaadin-text-field>
    <vaadin-text-field label="Correo electrónico:" placeholder="xxxxxxxxxxxx" style="width: 100%;" id="tf_email"></vaadin-text-field>
    <vaadin-date-picker label="Fecha de creación:" placeholder="XX / XX / XXXX" style="width: 100%;" id="dp_fecha_creacion"></vaadin-date-picker>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%; align-items: center; height: 20%;" id="container_foto_perfil">
     <label style="flex-grow: 1; flex-shrink: 0;" id="label_foto_de_perfil">Foto de perfil:</label>
     <img style="width: 50%; height: 100%; flex-shrink: 0; flex-grow: 0;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-xl);" id="container_botones_finales">
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_dar_de_baja">
       Dar de baja 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
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
