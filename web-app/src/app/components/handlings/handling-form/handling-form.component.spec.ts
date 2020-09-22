import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HandlingFormComponent } from './handling-form.component';

describe('HandlingFormComponent', () => {
  let component: HandlingFormComponent;
  let fixture: ComponentFixture<HandlingFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HandlingFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HandlingFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
