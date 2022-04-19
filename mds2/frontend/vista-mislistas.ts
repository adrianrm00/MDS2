import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-mislistas')
export class VistaMislistas extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding: var(--lumo-space-l); position: sticky;" id="container_informacion_lista">
  <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_imagen">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 300%;" id="container_informacion">
   <vaadin-vertical-layout style="width: 40%; flex-grow: 0; flex-shrink: 1;" id="container_nombre_lista">
    <vaadin-text-field label="Nobre de la Lista:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_nombre_lista"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_creada_por">
    <label style="width: 100%; font-weight: bold;" id="texto_creada_por">Creada por : Nombre del usuario</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_num_listas">
    <label style="width: 100%;" id="texto_num_listas">Lista: XXX/100</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_canciones" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
