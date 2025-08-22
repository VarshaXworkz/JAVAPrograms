//ARRAY SPREAD

//Spread operator convert array into numbers seperated by commas
const array = [1,2,3];
console.log(array);
console.log(...array);

//Concatinating two arrays
let arr1 =[1,2,3];
let arr2 = [4,5,6];
let arr3 = [...arr1,...arr2];
console.log(arr3)

//Copying An Array
const originalArray=[1,2,3];
const NormalCopiedArray=[originalArray];
console.log(NormalCopiedArray);
const spreadcopiedArray = [...originalArray];
console.log(spreadcopiedArray);

//Passing multiple arguments to a function
const numbers = [1,2,3,4,5];
sum(numbers);
console.log(...numbers)
function sum(a,b,c,d,e){
    console.log(a+b+c+d+e);
}