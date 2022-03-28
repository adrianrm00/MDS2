import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-button>
   Volver al Inicio 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="width: 20%; height: 20%; align-self: center;">
  <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
 </vaadin-vertical-layout>
 <label style="align-self: center;">Para continuar, inicia sesión.</label>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-direction: row;">
  <vaadin-button style="margin: var(--lumo-space-m);">
    Google 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m);">
    Facebook 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m);">
    Apple 
  </vaadin-button>
 </vaadin-vertical-layout>
 <label style="align-self: center;">-------------------------o-------------------------</label>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 40%;">
  <vaadin-text-field label="Dirección de correo o Nombre de Usuario:" placeholder="Placeholder" style="align-self: center; width: 100%;"></vaadin-text-field>
  <vaadin-password-field label="Contraseña:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; align-self: stretch;">
   <vaadin-button style="margin: var(--lumo-space-m); flex-grow: 1; flex-shrink: 0;">
     Recordar contraseña 
   </vaadin-button>
   <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; flex-grow: 1;">
     Iniciar Sesión 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <label style="align-self: center;">-------------------------o-------------------------</label>
 <label style="align-self: center;">¿No tienes cuenta?</label>
 <vaadin-button style="align-self: center;">
   Registrate 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
