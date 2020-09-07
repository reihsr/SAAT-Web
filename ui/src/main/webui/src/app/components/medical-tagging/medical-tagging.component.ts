import { Component, OnInit, TemplateRef } from '@angular/core';
import { OverlayService } from '../../service/overlay.service';
import { ComponentType } from '@angular/cdk/portal';

@Component({
  selector: 'app-medical-tagging',
  templateUrl: './medical-tagging.component.html',
  styleUrls: ['./medical-tagging.component.css']
})
export class MedicalTaggingComponent implements OnInit {

  content = 'A simple string content modal overlay';

  constructor(private overlayService: OverlayService) { }

  ngOnInit(): void {
  }

  open(content: TemplateRef<any> | ComponentType<any> | string) {
    const ref = this.overlayService.open(content, null);

    ref.afterClosed$.subscribe(res => {
      if (typeof content === 'string') {/*
      } else if (content === this.yesNoComponent) {
        this.yesNoComponentResponse = res.data;
      } else if (content === this.subscribeComponent) {
        this.subscribeData = res.data;
      } else {
        this.yesNoTemplateResponse = res.data;*/
      }
    });
  }

}
