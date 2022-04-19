import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-anadirevento')
export class VistaAnadirevento extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_titulo">
  <label style="font-size: 32px; font-weight: bold;" id="label_anadir_evento">Añadir Evento</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 600%; align-items: center; justify-content: center;" id="container_contenido">
  <vaadin-vertical-layout style="width: 50%;" id="container_contenido_ajustado">
   <vaadin-text-field label="Nombre del Concierto:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_nombre_concierto"></vaadin-text-field>
   <vaadin-text-field label="Ciudad:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_ciudad"></vaadin-text-field>
   <vaadin-text-field label="Fecha:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_fecha"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_botones_finales">
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_cancelar">
   <vaadin-button id="boton_cancelar">
    Cancelar
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_anadir">
   <vaadin-button id="boton_anadir">
    Añadir
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
