import { TestBed } from '@angular/core/testing';

import { AnnotationProjectsService } from './annotation-projects.service';

describe('AnnotationProjectsService', () => {
  let service: AnnotationProjectsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AnnotationProjectsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
