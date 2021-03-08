import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { DictionaryTreeNodeComponent } from './dictionary-tree-node.component';

describe('DictionaryTreeNodeComponent', () => {
  let component: DictionaryTreeNodeComponent;
  let fixture: ComponentFixture<DictionaryTreeNodeComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ DictionaryTreeNodeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictionaryTreeNodeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
