import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-anadirartista')
export class VistaAnadirartista extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="container_principal_2">
  <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
   <vaadin-vertical-layout style="align-self: center; width: 10%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_label_anadir_artista">
    <label style="align-self: center;" id="label_anadir_artista">Añadir artista</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;" id="container_contenido">
   <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_contenido_con_fondo">
    <vaadin-vertical-layout style="width: 80%; height: 100%; align-self: center;" id="container_contenido_ajustado">
     <vaadin-vertical-layout style="align-self: center; width: 60%;" id="container_buscador_artista"></vaadin-vertical-layout>
     <vaadin-text-field label="Nombre artista:" placeholder="Placeholder" style="width: 100%;" id="tf_nombre_artista"></vaadin-text-field>
     <vaadin-text-field label="Nombre completo:" placeholder="Placeholder" style="width: 100%;" id="tf_nombre_completo"></vaadin-text-field>
     <vaadin-text-field label="Correo electónico:" placeholder="Placeholder" style="width: 100%;" id="tf_email"></vaadin-text-field>
     <vaadin-password-field label="Contraseña:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value id="pf_contrasena"></vaadin-password-field>
     <vaadin-password-field label="Repetir contraseña:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value id="pf_repetir_contrasena"></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_estilos_de_musica">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;" id="label_estilos_de_musica">Estilos de música:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_estilos_de_musica1">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_linea_estilos_de_musica">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;" id="cb_estilos_de_musica"></vaadin-combo-box>
        <vaadin-button id="boton_eliminar_estilos_de_musica">
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-button id="boton_anadir_estilos_de_musica">
        + 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;" id="container_foto_de_perfil">
      <label style="width: 100%;" id="label_foto_de_perfil">Foto de perfil:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="container_img">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;" id="boton_buscar_en_archivos">
        Buscar en archivos 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="container_botones_finales">
      <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_dar_de_alta">
        Dar de alta 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
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
