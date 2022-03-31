import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabeceraadministrador';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-modificarartista')
export class VistaModificarartista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
  <vista-cabeceraadministrador style="width: 100%; height: 100%;"></vista-cabeceraadministrador>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);">
   <vaadin-vertical-layout style="align-self: center; width: 10%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;">
    <label style="align-self: center;">Modificar artista</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;">
    <vaadin-vertical-layout style="width: 80%; height: 100%; align-self: center;">
     <vaadin-text-field placeholder="Seleccione el artista que va a modificar" style="align-self: center; margin: var(--lumo-space-m); margin-top: var(--lumo-space-m); width: 60%;"></vaadin-text-field>
     <vaadin-text-field label="Nombre artista:" placeholder="Artista1" style="width: 100%;"></vaadin-text-field>
     <vaadin-text-field label="Nombre completo:" placeholder="NombreCompleto1" style="width: 100%;"></vaadin-text-field>
     <vaadin-text-field label="Correo elect�nico:" placeholder="xxxxxxxxxxxxxxxxxxx@xxxxxxxxx.xxx" style="width: 100%;"></vaadin-text-field>
     <vaadin-password-field label="Contraseña:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-password-field label="Repetir contraseña:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Estilos de música:</label>
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
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-bottom: var(--lumo-space-m);">
      <vaadin-button style="flex-grow: 0; width: 100%;">
        Cancelar 
      </vaadin-button>
      <vaadin-button style="flex-grow: 0; width: 100%;">
       Guardar cambios 
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
