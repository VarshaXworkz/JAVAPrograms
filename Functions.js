console.log("****PRINTING HELLO WORLD USING FUNCTION*****************************")
function print() {
var string = "Hello World";
return string;
}
var result_string = print();
console.log("String:" + result_string);
console.log("**********************************************************************")


console.log("*****SUM OF TWO NUMBERS USING FUNCTION DECLARATION********************")
function sum(x,y) {
var sum = x + y;
return sum;
}
var sum = sum(10,29);
console.log("The sum= " + sum);
console.log("**********************************************************************");


//Function Expression Syntax
console.log("*****SUM OF TWO NUMBERS USING FUNCTION EXPRESSION*********************")
var a= function(x,y) {
    return x+y;
}
var result=a(1,2);
console.log("The result is: " + result);
console.log("***********************************************************************")


//Argument Object of a Function
console.log("****ARGUMENT OF A FUNCTION*********************************************")
function sumAll() {
var result = 0;
for(var i = 0; i < arguments.length; i++) {
result += arguments[i];
}
return result;
}
console.log("The sum of two arguments: " + sumAll(1,2));
console.log("The sum of three arguments:" + sumAll(1,2,3));
console.log("The sum of four arguments:" + sumAll(1,2,3,4));
console.log("************************************************************************")


console.log("******************ANONYMOUS FUNCTION************************************")
console.log("*****************IIFE-Immediatelty invoked Function expression**********")
// //Anonymous Function
// (function() {
//     //Function Expression
//     //cb-call back function
// var sum = function (x,y,cb) {
// var res = x + y;
// cb(res);
// }
// sum(10,20, function(res) {
// console.log(res);
// }
// );
// }) ();
// console.log("***************************************************************************")


// console.log("*****IIFE-Immediatelty invoked Function expression WITH RETURN TYPE********")
// var add_value = (function() {
// return 30;
// }) ();
// console.log("Anonymous function variable value:" + add_value);
// console.log("***************************************************************************")

// console.log("****************************************************************************")


// console.log("*************************ARROW FUCNTION*************************************")
// //WITHOUT ARROW FUCNTION
// var add_result = function(x,y) {
// return x + y;
// }
// //WITH ARROW FUCNTION
// const result = (x,y) =>

// {
// console.log(x+y);
// };
// result(10,10);
// const return_result = (x,y) =>{
//     return x + y
// };
// console.log(return_result(5,5));
// console.log("****************************************************************************")