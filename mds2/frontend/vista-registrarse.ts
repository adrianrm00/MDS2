import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout style="width: 70%; height: 100%; flex-direction: column;" id="container_centrado">
  <vaadin-button id="boton_cancelar">
    Cancelar 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" style="width: 20%; height: 10%; align-self: center;" id="container_imagen">
   <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; height: 100%;" id="container_informacion">
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_nombre">
    <vaadin-text-field label="Nombre:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_nombre"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_apellidos">
    <vaadin-text-field label="Apellidos:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_apellidos"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_nombre_usuario">
    <vaadin-text-field label="Nombre de Usuario: *" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_nombre-usuario"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_correo">
    <vaadin-text-field label="Correo electr�nico: *" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_correo"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_contrasena">
    <vaadin-password-field label="Contrase�a: *" placeholder="Enter password" value="secret1" style="width: 100%; height: 100%;" has-value id="tf_contrasena"></vaadin-password-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center;" id="container_repetir_contrasena">
    <vaadin-password-field label="Repetir contrase�a: *" placeholder="Enter password" value="secret1" style="width: 100%; height: 100%;" has-value id="tf_repetir_contrasena"></vaadin-password-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center; flex-direction: row;" id="container_foto_perfil">
    <label style="align-self: flex-start; margin-top: var(--lumo-space-l); padding-right: var(--lumo-space-m);" id="texto_foto_perfil">Foto de Perfil:</label>
    <vaadin-button style="align-self: flex-start;" id="boton_subir_foto">
      Subir 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 10%; align-self: center; flex-direction: column;" id="container_terminos">
    <label id="texto_condiciones">Label</label>
    <vaadin-checkbox id="checkbox_condicion1">
      I agree 
    </vaadin-checkbox>
    <vaadin-checkbox id="checkbox_condicion2">
      I agree 
    </vaadin-checkbox>
   </vaadin-vertical-layout>
   <vaadin-button style="align-self: center;" id="boton_registrarse">
     Registrarse 
   </vaadin-button>
   <label style="align-self: center;" id="texto_otros_registros">O tambi�n puedes registrarte con:</label>
   <vaadin-vertical-layout theme="spacing" style="flex-direction: row; align-self: center;" id="container_registro_de_terceros">
    <vaadin-button style="margin: var(--lumo-space-s);" id="boton_google">
      Google 
    </vaadin-button>
    <vaadin-button style="margin: var(--lumo-space-s);" id="boton_facebook">
      Facebook 
    </vaadin-button>
    <vaadin-button style="margin: var(--lumo-space-s);" id="boton_apple">
      Apple 
    </vaadin-button>
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
