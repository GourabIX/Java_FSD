enum Color {Red, Green, Blue};
let clr: Color = Color.Green;
console.log(clr);
console.log(Color.Red);

enum ColorNew {Red = 5, Green = 9, Blue};
console.log(ColorNew.Red);
console.log(ColorNew.Green);
console.log(ColorNew.Blue);

for(let i in ColorNew)
{
    console.log(ColorNew[i]);
}

console.log(ColorNew[7]);