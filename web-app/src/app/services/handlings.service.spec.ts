import { TestBed } from '@angular/core/testing';

import { HandlingsService } from './handlings.service';

describe('HandlingsService', () => {
  let service: HandlingsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HandlingsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
