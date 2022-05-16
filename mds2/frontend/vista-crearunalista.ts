import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crearunalista')
export class VistaCrearunalista extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding: var(--lumo-space-l); position: sticky;" id="container_cabecera">
  <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_img">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 300%;" id="container_informacion_lista">
   <vaadin-vertical-layout style="width: 40%; flex-grow: 0; flex-shrink: 1;" id="container_nombre_lista">
    <vaadin-text-field label="Nobre de la Lista:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_lista"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_creada_por">
    <label style="width: 100%; font-weight: bold;" id="label_creada_por">Creada por : Nombre del usuario</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_lista_numero">
    <label style="width: 100%;" id="label_lista_numero">Lista: XXX/100</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_boton_editar_lista"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 190%; padding: var(--lumo-space-l);" id="container_contenido">
  <vaadin-vertical-layout style="width: 100%; height: 30%;" id="container_buscador">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="container_label_busca_algo_para_tu_lista">
    <label style="font-weight: bold; width: 100%;" id="label_busca_algo_para_tu_lista">Busca algo para tu lista:</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 40%; height: 100%; flex-direction: row;" id="container_buscador_y_boton">
    <vaadin-text-field placeholder="Placeholder" style="width: 60%;" id="tf_buscador"></vaadin-text-field>
    <vaadin-button style="width: 10%;" id="boton_buscador">
     <img style="width: 100%;" src="https://w7.pngwing.com/pngs/608/913/png-transparent-computer-icons-google-search-symbol-mobile-search-search-for-miscellaneous-logo-mobile-phones.png" id="img_lupa">
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_canciones" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
