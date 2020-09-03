import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicalTaggingComponent } from './medical-tagging.component';

describe('MedicalTaggingComponent', () => {
  let component: MedicalTaggingComponent;
  let fixture: ComponentFixture<MedicalTaggingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MedicalTaggingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MedicalTaggingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
