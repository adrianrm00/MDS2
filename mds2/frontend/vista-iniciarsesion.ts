import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-iniciarsesion')
export class VistaIniciarsesion extends LitElement {
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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout style="width: 60%; height: 100%;" id="container_centrado">
  <vaadin-button id="boton_volver_inicio">
    Volver al Inicio 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="width: 20%; height: 20%; align-self: center;" id="container_imagen">
   <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
  </vaadin-vertical-layout>
  <label style="align-self: center;" id="texto_iniciar_sesion">Para continuar, inicia sesión.</label>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-direction: row;" id="container_de_terceros">
   <vaadin-button style="margin: var(--lumo-space-m);" id="boton_google">
     Google 
   </vaadin-button>
   <vaadin-button style="margin: var(--lumo-space-m);" id="boton_facebook">
     Facebook 
   </vaadin-button>
   <vaadin-button style="margin: var(--lumo-space-m);" id="boton_apple">
     Apple 
   </vaadin-button>
  </vaadin-vertical-layout>
  <label style="align-self: center;" id="texto_separador1">-------------------------o-------------------------</label>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 40%;" id="container_iniciar_sesion">
   <vaadin-text-field label="Direccion de correo o Nombre de Usuario:" placeholder="Placeholder" style="align-self: center; width: 100%;" id="tf_correo_o_usuario"></vaadin-text-field>
   <vaadin-password-field label="Contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value id="tf_contrasena"></vaadin-password-field>
   <vaadin-vertical-layout style="flex-direction: row; align-self: stretch; justify-content: center;" id="container_botones">
    <vaadin-button style="margin: var(--lumo-space-m); flex-grow: 1; flex-shrink: 0;" id="boton_recordar_contrasena">
      Recordar contrase�a 
    </vaadin-button>
    <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; flex-grow: 1;" id="boton_iniciar_sesion">
      Iniciar Sesi�n 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <label style="align-self: center;" id="texto_separador2">-------------------------o-------------------------</label>
  <label style="align-self: center;" id="texto_no_tienes_cuenta">�No tienes cuenta?</label>
  <vaadin-button style="align-self: center;" id="boton_registrarse">
    Registrate 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
