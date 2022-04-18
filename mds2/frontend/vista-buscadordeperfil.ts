import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-buscadordeperfil')
export class VistaBuscadordeperfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
 <vaadin-text-field placeholder="Escribe el perfil que deseas buscar" style="flex-grow: 0; width: 100%;"></vaadin-text-field>
 <vaadin-button style="width: 10%;" src="">
  <img style="width: 40%; height: 100%;" src="https://w7.pngwing.com/pngs/545/756/png-transparent-computer-icons-magnifying-glass-magnifying-glass-glass-logo-desktop-wallpaper.png">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
