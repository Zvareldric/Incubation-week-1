console.log("Hello from Eksternal JS");

var a = 1;
let b = "Hello";

console.table({a,b});

a=30;
b="js";
console.table({a,b});

const c = false;
c = true;

console.log(c);

let number = 1;
let stringVar = "Hello  js";
let booleanVar = false;
let arrayVar = [2,"string",false];
let objectVar = {
    attribute1: "attr1",
    attribute: 20,
    nestead:{
        nestead1: false,
    },
}
console.table(objectVar)

function add(a,b){
    console.log(a+b);
}

//spread operator
function addAll(...nums){
    const result = nums.reduce((acc, current) => acc + current);
    console.log(resule);
}
add(2,3);
addAll(2,3,4,5,6,6)

//arrorw function
const add = (a,b) => {
    console.log(a+b);
};

//looping
for(let i = 0; i <10; i++){
    console.log("for loop", i)
}

let i = 0;
while (i<10) {
    console.log("while loop",i);
    i++;
}

const arr = [1,2,3,4,5]

arr.forEach((element, index) => {
    console.log("element", element, "Indnex", index);
});

let headingElement = document.querySelector("#title");
headingElement.innerHTML = "Hallo Dunia";
headingElement.style.backgroundColor = "red";
console.log(headingElement);

const pEl = document.querySelectorAll("p");
pEl.innerHTML = "Hallo Dunia";
pEl.style.backgroundColor = "red";
 pEl.forEach((el, index) => {
    el.innerHTML = "Hallo JS " + index;
    el.style.backgroundColor
 });

 