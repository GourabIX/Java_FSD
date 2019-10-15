let numArr: number[] = [10, 20, 30, 40, 50];
let cityArr: Array<string> = ["Pune", "Kolkata", "Mumbai"];

console.log(numArr);
console.log(cityArr);

for (let i = 0; i < numArr.length; i++)
{
    console.log(numArr[i]);
}

for (let i = 0; i < cityArr.length; i++)
{
    console.log(cityArr[i]);
}

console.log("Using foreach loop: ");
numArr.forEach(tempVar=>{                       // foreach is a function; not a loop. => is called arrow function.
    console.log(tempVar);
});

for (let i in cityArr)
{
    console.log(cityArr[i]);
}

for (let i of cityArr)
{
    console.log(i);
}