var myVar;
myVar = ["hello", 25, "typescript sucks"];
console.log(myVar);
console.log(myVar[0]);
console.log(myVar[1]);
console.log(myVar[2]);
for (var _i = 0, myVar_1 = myVar; _i < myVar_1.length; _i++) {
    var ele = myVar_1[_i];
    console.log(ele);
}
console.log("Using foreach loop: ");
myVar.forEach(function (tempVar) {
    console.log(tempVar);
});
for (var i in myVar) {
    console.log(myVar[i]);
}
