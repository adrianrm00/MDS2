import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: column;">
 <vaadin-button>
   Button 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="width: 20%; height: 10%; align-self: center;">
  <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-text-field label="Nombre:" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-text-field label="Apellidos:" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-text-field label="Nombre de Usuario: *" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-text-field label="Correo electrónico: *" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-password-field label="Contraseña: *" placeholder="Enter password" value="secret1" style="width: 100%; height: 100%;" has-value></vaadin-password-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;">
   <vaadin-password-field label="Repetir contraseña: *" placeholder="Enter password" value="secret1" style="width: 100%; height: 100%;" has-value></vaadin-password-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center; flex-direction: row;">
   <label style="align-self: flex-start; margin-top: var(--lumo-space-l); padding-right: var(--lumo-space-m);">Foto de Perfil:</label>
   <vaadin-button style="align-self: flex-start;">
    Subir
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center; flex-direction: column;">
   <label>Label</label>
   <vaadin-checkbox>
     I agree 
   </vaadin-checkbox>
   <vaadin-checkbox>
     I agree 
   </vaadin-checkbox>
  </vaadin-vertical-layout>
  <vaadin-button style="align-self: center;">
   Registrarse
  </vaadin-button>
  <label style="align-self: center;">O también puedes registrarte con:</label>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; align-self: center;">
   <vaadin-button style="margin: var(--lumo-space-s);">
    Google
   </vaadin-button>
   <vaadin-button style="margin: var(--lumo-space-s);">
    Facebook
   </vaadin-button>
   <vaadin-button style="margin: var(--lumo-space-s);">
    Apple
   </vaadin-button>
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
