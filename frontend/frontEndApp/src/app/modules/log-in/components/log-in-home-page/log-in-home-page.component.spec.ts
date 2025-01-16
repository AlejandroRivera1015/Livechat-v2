import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogInHomePageComponent } from './log-in-home-page.component';

describe('LogInHomePageComponent', () => {
  let component: LogInHomePageComponent;
  let fixture: ComponentFixture<LogInHomePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LogInHomePageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LogInHomePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
