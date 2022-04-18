import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-anadiralbum')
export class VistaAnadiralbum extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal_1">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="container_principal_2">
  <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
   <vaadin-vertical-layout style="align-self: center; width: 10%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_anadir_album">
    <label style="align-self: center;" id="label_anadir_album">Añadir álbum</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;" id="container_contenido">
   <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_contenido_fondo">
    <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing" id="container_contenido_fondo_ajustado">
     <vaadin-vertical-layout style="width: 100%;" id="buscador_album"></vaadin-vertical-layout>
     <vaadin-text-field label="Nombre álbum:" placeholder="Placeholder" style="width: 100%;" id="tf_nombre_album"></vaadin-text-field>
     <vaadin-date-picker label="Fecha de lanzamiento:" placeholder="Pick a date" style="width: 100%;" id="dp_fecha_lanzamiento"></vaadin-date-picker>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_artista_asociado">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;" id="label_artista_asociado">Artista asociado: </label>
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_tf_artista_asociado">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_artista_asociado"></vaadin-text-field>
       <vaadin-button id="boton_eliminar_artista_asociado">
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_anadir_artista_asociado"></vaadin-vertical-layout>
     </vaadin-vertical-layout>
     <vaadin-password-field label="Contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value id="pf_escribir_contrasena"></vaadin-password-field>
     <vaadin-password-field label="Repetir contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value id="pf_repetir_contrasena"></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_anadir_cancion">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;" id="label_anadir_cancion">Añadir canción:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_tf_anadir_canciones">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_tf_anadir_cancion">
        <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_anadir_cancion"></vaadin-text-field>
        <vaadin-button id="boton_eliminar_cancion">
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout id="container_boton_anadir_cancion"></vaadin-vertical-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%;" id="container_anadir_cancion_a_album"></vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;" id="container_foto_album">
      <label style="width: 100%;" id="label_foto_album">Foto del álbum:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="container_img_album">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="img_album">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;" id="boton_buscar_en_archivos">
        Buscar en archivos 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="container_botones_finales">
      <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_confirmar">
        Confirmar 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-password-field label="Contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-password-field label="Repetir contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Estilos de m�sica:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-button>
        + 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;">
      <label style="width: 100%;">Foto de perfil:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;">
        Buscar en archivos 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;">
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Dar de alta 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`+
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-password-field label="Contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-password-field label="Repetir contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Estilos de m�sica:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-button>
        + 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;">
      <label style="width: 100%;">Foto de perfil:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;">
        Buscar en archivos 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;">
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Dar de alta 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`+
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-password-field label="Contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-password-field label="Repetir contrase�a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Estilos de m�sica:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-button>
        + 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;">
      <label style="width: 100%;">Foto de perfil:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;">
        Buscar en archivos 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;">
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;">
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
