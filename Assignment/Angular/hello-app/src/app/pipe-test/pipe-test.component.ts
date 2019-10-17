import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-test',
  templateUrl: './pipe-test.component.html',
  styleUrls: ['./pipe-test.component.css']
})
export class PipeTestComponent implements OnInit {

  name:string="Gourab Sarkar";
  date77 = new Date("2077/06/08");
  date = new Date();

  constructor() { }

  ngOnInit() {
  }

}
