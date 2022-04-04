import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-previewartista';

@customElement('vista-verartistas')
export class VistaVerartistas extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 100%; align-self: center; padding-left: var(--lumo-space-xl); padding-top: var(--lumo-space-l);">
   <label style="width: 100%; height: 100%; font-size: 30px; font-weight: bold;">Artistas</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; flex-direction: row; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l);">
   <vaadin-text-field placeholder="Buscador" style="width: 80%;"></vaadin-text-field>
   <vaadin-button style="width: 10%;">
    <img style="width: 100%;" src="https://w7.pngwing.com/pngs/608/913/png-transparent-computer-icons-google-search-symbol-mobile-search-search-for-miscellaneous-logo-mobile-phones.png">
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-l);">
  <vaadin-vertical-layout style="width: 100%; flex-direction: row; height: 40%; padding-top: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; flex-direction: row; height: 40%; padding-top: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; flex-direction: row; height: 40%; padding-top: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; flex-direction: row; height: 40%; padding-top: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; flex-direction: row; height: 40%; padding-top: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="height: 100%; width: 100%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
    <vista-previewartista></vista-previewartista>
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
