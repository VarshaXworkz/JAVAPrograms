console.log("Hello World.........")
var a = 10;
var a = 20;
let b = 30;
b=40.67;
//---------> let b = 40; let cannot be redeclared
b = 40; //possible
const c = 50;
const d=60;//-----> const c = 6theta*j const cannot be redecalred
//------> c = 60 const cannot be redeclared,reassigned
//const d; // Const cannot be left undefined

//Datatype
console.log("*****DATATYPE***")

var x = null;
console.log("The value of x: " + x);
console.log("Datatype of x = null: " + typeof(x));


var y = 1;
console.log("The value of y: " + y);
console.log("Datatype of y = 1: " + typeof(y));

var xx="Priya"
console.log("The value of xx: " + xx);
console.log("Datatype of xx = Priya:" + typeof(xx));


var z= 2.33;
console.log("The value of z: " + z);
console.log("Datatype of z=2.33: " + typeof(z));

var yy = true;
console.log("The value of yy: +yy");
console.log("Datatype of yy = true: " + typeof(yy));

var zz;
console.log("The value of zz: " + zz);
console.log("Datatype of zz: " + typeof(zz));

console.log("*******")

//Scope of Variables

console.log("*****SCOPE OF VARIABLES****")

var global = 1;

function f(){
         function g() {
console.log("Global_g: "+ global);
         }
g();
console.log("Global_f:" + global);
}
f();

console.log("********************************************************")

var number1= 40;

var number2= 58;

var sum =number1 + number2;
console.log("The sum of " + number1 + "and" + number2 + "is:" + sum);

var difference = number2- number1
console.log("The difference of number2 + and" + number1 + "is: " + difference)

var multiply =number1 *number2;
console.log("The multiplication of + number1 + and" + number2 + "is:"+multiply)

var exponent = number1 ** number2;
console.log("The exponent of +number1 +and "+number2 +"is:" +exponent)

console.log("*************************************");

//Relational Operator
console.log("******RELATIONAL OPERATOR*............*");
var x = 5;
var x1 = 5;
console.log("x== x1 check value are equal" + (x = x1)); //true--->Compare 
console.log("x === x1 check vale and datatype" + (x === x1)); 

var y = 5;
var y1= "5";
console.log("y == y1 check value are equal" + y == y1); //true---->since 5 = 
console.log("y === y1 check vale and datatype" + y === y1);
//false--->'number 5' & 'Str
console.log("**************************")

//Logical Operator
console.log("*******LOGICAL OPERATOR******")
var saturday =false;
var sunday =true;
var weekend = saturday || sunday;
console.log("Today is Weekend? "+ weekend);
var freeTime = false;
console.log("Can I go to park: " + (sunday && freeTime));
console.log("**************************************")

//Branching

console.log("** **BRANCHING******")
var phone_price = 30000;
var acc_balance = 25000;
if(acc_balance >= phone_price) {
console.log("I can buy the phone");
} else{
console.log("I can't buy the phone");
}
 var creditCard_limit = 3000;
if((acc_balance+creditCard_limit) >= phone_price) {
console.log("I can buy the phone");
} else {
console.log("Extra money needed to buy the phone:" )
}
console.log("***************************************************")

//Looping
console.log("******LOOPING**************************************")
for(var i = 5; i >= 1; i--) {
var s = '';
for(var j = 1; j <= i; j++) {
s += '*';
}
console.log(s);
}
console.log("***************************************************")