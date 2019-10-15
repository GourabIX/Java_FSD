var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
;
var clr = Color.Green;
console.log(clr);
console.log(Color.Red);
var ColorNew;
(function (ColorNew) {
    ColorNew[ColorNew["Red"] = 5] = "Red";
    ColorNew[ColorNew["Green"] = 9] = "Green";
    ColorNew[ColorNew["Blue"] = 10] = "Blue";
})(ColorNew || (ColorNew = {}));
;
console.log(ColorNew.Red);
console.log(ColorNew.Green);
console.log(ColorNew.Blue);
for (var i in ColorNew) {
    console.log(ColorNew[i]);
}
console.log(ColorNew[7]);
console.log(ColorNew[5]);
