// Named Function
function add(a: number, b:number):number
{
    return a + b;
}

let c = add(10, 20);
console.log(c);

// Inferred type
function multiply(a, b)
{
    return a*b;
}
let d = multiply(10, 20);
console.log(d);