import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-contactanos')
export class VistaContactanos extends LitElement {
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
 <vaadin-vertical-layout id="container_informacion" style="width: 100%; height: 30%;">
  <vaadin-vertical-layout id="container_titulo" style="width: 100%; height: 50%; justify-content: center;">
   <label id="titulo" style="font-size: 32px; font-weight:bold; align-self: center;">Contacta con nosotros</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_datos_contacto" style="width: 100%; height: 50%; justify-content: center; align-items: center;">
   <label id="texto_correo">Correo Electronico: Corredeprueba@gmail.com</label>
   <label id="texto_telefono">Telefono: 950453773</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="Container_motivos" style="width: 100%; height: 50%; align-items: center;">
  <vaadin-vertical-layout id="Container_motivos_centrado" style="width: 50%; height: 100%;">
   <label id="titulo_motivos" style="font-weight:bold; align-self: center;">¿Quieres ser artista?</label>
   <vaadin-text-area placeholder="Dinos el porque" id="tfa_motivos" style="width: 100%; height: 100%;"></vaadin-text-area>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="width: 50%; height: 20%; flex-direction: row; justify-content: center; align-items: center; align-self: center;">
  <vaadin-button id="boton_enviar" style="margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); width: 30%;">
    Enviar 
  </vaadin-button>
  <vaadin-button id="boton_cancelar" style="margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); width: 30%;">
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
