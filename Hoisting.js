console.log("******************************VAR HOISTING************************************");
console.log(x);
var x = 1;
console.log(x);
console.log("****************************************************************************")


console.log("************************FUNCTION HOISTING*************************************");
//Function declation can be hoisted
foo();
function foo(){
    console.log("Foo is called")

}
//add(3)-->Function expression cannot be hoisted
var add = function(x) {
console.log (x + x);
};
add(3);
var print = function(x) {
console.log(arguments);
console.log(arguments [4]);
};
print(1,2,3,4,5);
console.log("****************************************************************************")


// console.log("******************************LET HOISTING************************************");
// console.log(x);
// let x = 1;
// console.log(x);
// console.log("****************************************************************************")
