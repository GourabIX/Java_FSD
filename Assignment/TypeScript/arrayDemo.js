var numArr = [10, 20, 30, 40, 50];
var cityArr = ["Pune", "Kolkata", "Mumbai"];
console.log(numArr);
console.log(cityArr);
for (var i = 0; i < numArr.length; i++) {
    console.log(numArr[i]);
}
for (var i = 0; i < cityArr.length; i++) {
    console.log(cityArr[i]);
}
console.log("Using foreach loop: ");
numArr.forEach(function (tempVar) {
    console.log(tempVar);
});
for (var i in cityArr) {
    console.log(cityArr[i]);
}
for (var _i = 0, cityArr_1 = cityArr; _i < cityArr_1.length; _i++) {
    var i = cityArr_1[_i];
    console.log(i);
}
