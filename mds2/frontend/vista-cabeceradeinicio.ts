import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabeceradeinicio')
export class VistaCabeceradeinicio extends LitElement {
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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 10%; flex-direction: row; background-color: #EAEDED;" id="container_cabecera">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-shrink: 1; flex-grow: 0;" id="container_spotyual">
   <vaadin-vertical-layout theme="spacing" id="container_img" style="flex-shrink: 1; height: 100%; width: 10%;">
    <img style="flex-grow: 0; flex-shrink: 1; height: 100%; width: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 1; align-self: center; justify-content: center; height: 100%;" id="container_p">
    <p style="font-size: 30px; font-weight: bold; flex-grow: 0; flex-shrink: 1; align-self: center; width: 100%; height: 100%;" id="p_spotyual">SpotyUAL</p>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-s" style="height: 100%; width: 50%; flex-grow: 0; flex-shrink: 0; flex-direction: row; align-self: center;" id="container_botones">
   <vaadin-button style="align-self: center; width: 100%; height: 50%;" id="boton_asistencia">
     Asistencia 
   </vaadin-button>
   <vaadin-button style="align-self: center; width: 100%; height: 50%;" id="boton_registrarse_cabecera">
     Registrarse 
   </vaadin-button>
   <vaadin-button style="align-self: center; width: 100%; height: 50%;" id="boton_iniciar_sesion">
     Iniciar Sesi??n 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 30%; align-items: center; justify-content: center; background-color: #99A3A4;" id="container_mensaje_principal">
  <vaadin-vertical-layout id="container_mensaje_principal_ajustado">
   <h1 style="align-self: center;" id="h1">Escuchar lo es todo</h1>
   <h3 style="align-self: center;" id="h3">Millones de canciones y p??dcasts. No hace falta tarjeta de cr??dito.</h3>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_boton_registrarse">
   <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1; flex-grow: 0;" id="boton_registrarse">
     Registrarse 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 50%;" id="container_canciones_prueba">
  <vaadin-vertical-layout style="height: 30%; width: 100%;" id="container_titulo_canciones_prueba">
   <h3 style="flex-grow: 0; flex-shrink: 0; align-self: center; margin-top: 2.5%;" id="h3_canciones_prueba">Aqu?? tienes unas canciones de prueba</h3>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 70%; flex-direction: row;" id="container_canciones">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="cancion_prueba_1"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="cancion_prueba_2"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="cancion_prueba_3"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="cancion_prueba_4"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="cancion_prueba_5"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 10%;" id="container_footer"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
