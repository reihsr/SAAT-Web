import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DictionaryTeeNodeListComponent } from './dictionary-tee-node-list.component';

describe('DictionaryTeeNodeListComponent', () => {
  let component: DictionaryTeeNodeListComponent;
  let fixture: ComponentFixture<DictionaryTeeNodeListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DictionaryTeeNodeListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictionaryTeeNodeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
