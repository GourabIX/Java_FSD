import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rating-test',
  templateUrl: './rating-test.component.html',
  styleUrls: ['./rating-test.component.css']
})
export class RatingTestComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  currentRating: number = 0;
  readonly=false;

}
