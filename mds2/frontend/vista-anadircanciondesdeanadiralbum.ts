import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabeceraadministrador';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-anadircanciondesdeanadiralbum')
export class VistaAnadircanciondesdeanadiralbum extends LitElement {
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
    <label style="align-self: center;">Añadir álbum</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;">
   <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;">
    <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing">
     <vaadin-text-field label="Nombre álbum:" placeholder="Placeholder" style="width: 100%;"></vaadin-text-field>
     <vaadin-date-picker label="Fecha de lanzamiento:" placeholder="Pick a date" style="width: 100%;"></vaadin-date-picker>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Artista asociado: </label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
      <vaadin-button>
       +
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-password-field label="Contrase?a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-password-field label="Repetir contrase?a:" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
     <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
      <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;">Añadir canción:</label>
      <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
        <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
        <vaadin-button>
          X 
        </vaadin-button>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="width: 100%; background-color: #d9ddde; height: 50%;">
      <vaadin-vertical-layout style="width: 30%; flex-grow: 0; height: 10%; background-color: #d9ddde; align-self: center;">
       <label style="align-self: center; margin-top: var(--lumo-space-m);">Añadir canción al álbum</label>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;">
       <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 90%; align-self: center;">
        <vaadin-vertical-layout style="width: 90%; height: 100%; align-self: center; background-color: #d9ddde; margin-bottom: var(--lumo-space-xl);" theme="spacing-s">
         <vaadin-text-field label="Título:" placeholder="Placeholder" style="width: 100%;"></vaadin-text-field>
         <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
          <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Intérprete:</label>
          <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
          </vaadin-vertical-layout>
          <vaadin-button>
           +
          </vaadin-button>
         </vaadin-vertical-layout>
         <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
          <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Compositor:</label>
          <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
          </vaadin-vertical-layout>
          <vaadin-button>
           +
          </vaadin-button>
         </vaadin-vertical-layout>
         <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
          <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Productor:</label>
          <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
           <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
            <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
            <vaadin-button>
              X 
            </vaadin-button>
           </vaadin-horizontal-layout>
          </vaadin-vertical-layout>
          <vaadin-button>
           +
          </vaadin-button>
         </vaadin-vertical-layout>
         <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
          <label style="flex-grow: 1; flex-shrink: 0; margin-right: var(--lumo-space-xs);">Estilos de música:</label>
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
         <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
          <label style="flex-grow: 1; flex-shrink: 0;">Fichero multimedia:</label>
          <vaadin-text-field placeholder="mpa, ogg, mp3..." style="width: 100%; flex-grow: 0; flex-shrink: 1;"></vaadin-text-field>
          <vaadin-button style="flex-shrink: 0; flex-grow: 0;">
           Buscar archivos
          </vaadin-button>
         </vaadin-horizontal-layout>
         <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-m);">
          <vaadin-button style="flex-grow: 0; width: 100%;">
            Cancelar 
          </vaadin-button>
          <vaadin-button style="flex-grow: 0; width: 100%;">
            Confirmar 
          </vaadin-button>
         </vaadin-horizontal-layout>
        </vaadin-vertical-layout>
       </vaadin-vertical-layout>
      </vaadin-vertical-layout>
     </vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; align-items: center;">
      <label style="width: 100%;">Foto del álbum:</label>
      <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
       <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
      </vaadin-vertical-layout>
      <vaadin-button style="width: 100%;">
        Buscar en archivos 
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
