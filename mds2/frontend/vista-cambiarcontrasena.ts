import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

@customElement('vista-cambiarcontrasena')
export class VistaCambiarcontrasena extends LitElement {
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
<vaadin-vertical-layout theme="" id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_titulo">
  <label style="font-size:32px; font-weight:bold; align-self: center;" id="titulo_cambio_correo">Cambio de Contraseña</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 200%; align-items: center;" id="container_informacion">
  <vaadin-password-field label="Contraseña actual:" placeholder="Enter password" value="secret1" id="tf_contrasena_actual" style="width: 50%;" has-value></vaadin-password-field>
  <vaadin-password-field label="Nueva contraseña:" placeholder="Enter password" value="secret1" style="width: 50%;" has-value id="tf_nueva_contrasena"></vaadin-password-field>
  <vaadin-password-field label="Repita la nueva contraseña:" placeholder="Enter password" value="secret1" style="width: 50%;" has-value id="tf_repetir_contrasena"></vaadin-password-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center; justify-content: center;" id="container_botones">
  <vaadin-button style="margin: var(--lumo-space-l); width: 20%;" id="boton_guardar">
    Guardar 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-l); width: 20%;" id="boton_cancelar">
    Cancelar 
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
