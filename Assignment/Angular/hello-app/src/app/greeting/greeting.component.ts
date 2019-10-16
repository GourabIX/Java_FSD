import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  message:string = "Welcome to Zensar (Greeting)";

  message2:string;

  sayGreet(event)
  {
    console.log(event);
    this.message2="good morning! " + event.type + " " + event.target + " " + event.target.value;
  }

  textColor="text-color";
  textBgColor="text-bgcolor";
  
  greetingStyle = [this.textColor, this.textBgColor];

  flag:boolean;
  colorA:string;
  colorB:string;

  toggleColor(event)
  {
    if(this.flag)
    {
      this.flag=false;
      this.colorA='red';
      this.colorB='yellow';
      console.log(this.colorA);
      console.log(this.colorB);
    }
    else
    {
      this.flag=true;
      this.colorA='blue';
      this.colorB='grey';
      console.log(this.colorA);
      console.log(this.colorB);
    }
  }

}
