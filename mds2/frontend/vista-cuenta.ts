import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cuenta')
export class VistaCuenta extends LitElement {
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
 <vaadin-vertical-layout id="container_cabecera" style="width: 100%; height: 40%;">
  <vaadin-vertical-layout id="container_titulo" style="width: 100%; height: 20%; justify-content: center; align-items: center;">
   <label id="titulo_cuenta" style="font-size:32px; font-weight:bold;">Cuenta</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_cambiar_imagen" style="width: 100%; height: 60%; align-items: center;">
   <vaadin-vertical-layout id="container_img" style="width: 100%; height: 100%;">
    <img id="img" style="width: 15%; height: 100%; align-self: center;" src="https://extension.ual.es/assets/logo-ual.png">
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_boton_cambiar_imagen" style="width: 100%; align-items: center; height: 20%; justify-content: center;">
   <vaadin-button id="boton_cambiar_imagen" style="width: 35%;">
     Cambiar imagen 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_informacion" style="width: 100%; height: 60%;">
  <vaadin-text-field label="Nombre:" placeholder="Placeholder" id="tf_nombre" style="width: 50%; align-self: center;"></vaadin-text-field>
  <vaadin-text-field label="Apellidos:" placeholder="Placeholder" style="width: 50%; align-self: center;" id="tf_apellidos"></vaadin-text-field>
  <vaadin-text-field label="Nombre Usuario:" placeholder="Placeholder" style="width: 50%; align-self: center;" id="tf_nombre_ususrio"></vaadin-text-field>
  <vaadin-text-field label="Correo Electronico:" placeholder="Placeholder" style="width: 50%; align-self: center;" id="tf_correo"></vaadin-text-field>
  <vaadin-vertical-layout id="container_botones" style="width: 100%; height: 100%; align-items: center;">
   <vaadin-vertical-layout id="container_botones_cambiar_datos" style="width: 50%; height: 100%; flex-direction: row; align-items: center; justify-content: center;">
    <vaadin-button id="boton_cambiar_correo" style="margin: var(--lumo-space-l); width: 35%;">
      Cambiar Correo 
    </vaadin-button>
    <vaadin-button id="boton_cambiar_contrasena" style="margin: var(--lumo-space-l); width: 35%;">
      Cambiar Contraseña 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="container_boton_baja" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-button id="boton_darse_de_baja" style="width: 35%;">
      Darse de baja 
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
