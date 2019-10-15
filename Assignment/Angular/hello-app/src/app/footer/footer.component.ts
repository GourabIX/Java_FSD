import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  template: `<h5>&copy; Gourab Sarkar 2019 </h5>`,
  styles: ['h5 { font-weight: 700; font-color: blue; }', 'p { font-color: blue; }']
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
