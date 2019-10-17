import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-timepicker-test',
  templateUrl: './timepicker-test.component.html',
  styleUrls: ['./timepicker-test.component.css']
})
export class TimepickerTestComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  time = {
    hour: 0,
    minute: 0
  }

}
