import { TestBed } from '@angular/core/testing';

import { DictionaryTreeNodeServiceService } from './dictionary-tree-node.service';

describe('DictionaryTreeNodeServiceService', () => {
  let service: DictionaryTreeNodeServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DictionaryTreeNodeServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
