import { Overlay, OverlayConfig } from '@angular/cdk/overlay';
import { ComponentPortal, PortalInjector } from '@angular/cdk/portal';
import { Injectable, Injector, TemplateRef, Type } from '@angular/core';
import { TaggingOverlayRef } from '../template-ref/tagging-overlay-ref';
import { OverlayComponent } from '../components/overlay/overlay.component';

@Injectable({
  providedIn: 'root'
})
export class OverlayService {

  constructor(private overlay: Overlay, private injector: Injector) { }

  open<R = any, T = any>(
    content: string | TemplateRef<any> | Type<any>,
    data: T
  ): TaggingOverlayRef<R> {
    const configs = new OverlayConfig({
      hasBackdrop: true,
      panelClass: ['modal', 'is-active'],
      backdropClass: 'modal-background'
    });

    const overlayRef = this.overlay.create(configs);

    const taggingOverlayRef = new TaggingOverlayRef<R, T>(overlayRef, content, data);

    const injector = this.createInjector(taggingOverlayRef, this.injector);
    overlayRef.attach(new ComponentPortal(OverlayComponent, null, injector));

    return taggingOverlayRef;
  }

  createInjector(ref: TaggingOverlayRef, inj: Injector) {
    const injectorTokens = new WeakMap([[TaggingOverlayRef, ref]]);
    return new PortalInjector(inj, injectorTokens);
  }
}
