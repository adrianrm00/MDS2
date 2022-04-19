import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-dardebajaunperfildeartista')
export class VistaDardebajaunperfildeartista extends LitElement {
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
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_dar_de_baja_artista">
   <label style="align-self: center;" id="texto_dar_de_baja-artista">Dar de baja un perfil de artista</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_opciones1">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_opciones2">
   <vaadin-vertical-layout style="width: 80%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center;" theme="spacing" id="container_opciones3">
    <vaadin-vertical-layout style="width: 60%; align-self: center;" id="container_buscador"></vaadin-vertical-layout>
    <vaadin-text-field label="Nombre artista:" placeholder="xxxxxxxxxxxx" style="width: 100%;" id="tf_nombre_artista"></vaadin-text-field>
    <vaadin-text-field label="Nombre completo:" placeholder="xxxxxxxxxxxx xxxxxxxxxxxx xxxxxxxxxxxx" style="width: 100%;" id="tf_nombre"></vaadin-text-field>
    <vaadin-text-field label="Correo electrónico:" placeholder="xxxxxxxxxxxx@xxxxxxxx.xxx" style="width: 100%;" id="tf_correo"></vaadin-text-field>
    <vaadin-date-picker label="Fecha de nacimiento:" placeholder="XX / XX / XXXX" style="width: 100%;" id="tf_fecha_nacimiento"></vaadin-date-picker>
    <vaadin-date-picker label="Fecha de creación:" placeholder="XX / XX / XXXX" style="width: 100%;" id="tf_fecha_creacion"></vaadin-date-picker>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%; align-items: center; height: 20%;" id="container_foto_perfil">
     <label style="flex-grow: 1; flex-shrink: 0;" id="texto_foto_de_perfil">Foto de perfil:</label>
     <img style="width: 50%; height: 100%; flex-shrink: 0; flex-grow: 0;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);" id="container_botones">
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
