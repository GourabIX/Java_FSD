import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  constructor(private ele: ElementRef) { }

  changeColor(color:string, foregroundColor:string)
  {
    this.ele.nativeElement.style.backgroundColor = color;
    this.ele.nativeElement.style.color = foregroundColor;
  }

  @HostListener('mouseenter')
  onMouseEnter()
  {
    this.changeColor('magenta', 'white');
  }

  @HostListener('mouseleave')
  onMouseLeave()
  {
    this.changeColor(null, null);
  }

}
