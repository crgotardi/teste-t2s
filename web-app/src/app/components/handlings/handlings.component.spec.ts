import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HandlingsComponent } from './handlings.component';

describe('HandlingsComponent', () => {
  let component: HandlingsComponent;
  let fixture: ComponentFixture<HandlingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HandlingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HandlingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
