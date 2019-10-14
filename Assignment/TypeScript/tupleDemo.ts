let myVar: [string, number, string];
myVar = ["hello", 25, "typescript sucks"];
console.log(myVar);
console.log(myVar[0]);
console.log(myVar[1]);
console.log(myVar[2]);

for(let ele of myVar)
{
    console.log(ele);
}

console.log("Using foreach loop: ");
myVar.forEach(tempVar=>{
    console.log(tempVar);
});

for (let i in myVar)
{
    console.log(myVar[i]);
}