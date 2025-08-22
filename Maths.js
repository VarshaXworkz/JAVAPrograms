console.log("****MATH OPERATION******************************");

console.log("Min value: " + Math.min(6,78,98,65,43,23,1,10,23,45,67,54,11));

console.log("Max value:" + Math.max(6,78,98,65,43,23,1,10,23,45,67,54,11));

var mean_value = function (value) {
var sum = 0;
for(let i in value) {
sum = sum + value[i];
var length = value.length;
var mean =sum / length;
return mean;
 };

var value = [6,78,98,65,43,23,1,10,23,45,67,54,11];

console.log("Mean value:" + mean_value(value));

console.log("ceil value:" + Math.ceil(mean_value (value)));

console.log("Floor value:" + Math.floor(mean_value (value)));

console.log("Trunc value: " + Math.trunc(-4.3));

console.log("Power value: " + Math.pow(8,3));

console.log("Square Root value: " + Math.sqrt(4));

console.log("absolute value: " + Math.abs(-4.87));

console.log("absolute value:" + Math.abs(4.87));

console.log("************************RANDOM**********************")
console.log("Random value: " + Math.random());

console.log("Random value (0-9): " + Math.floor(Math.random()));

console.log("Random value(0-9):" + Math.floor(Math.random()));

console.log("Random value (0-10):" + Math.floor(Math.random()*10));

console.log("Random value (0-99): " +Math.floor(Math.random()*100));

console.log("Random value (0-100):" + Math.floor(Math.random()* 101));

console.log("******************************ROUND*****************************")
console.log(Math.round(4.9));

console.log(Math.round(4.5));

console.log(Math.round(4.3));

console.log("*************************SIGN*********************************")
console.log(Math.sign(-4));

console.log(Math.sign(0));

console.log(Math.sign(4));

//It gives output as NaN->Not a number
console.log(Math.sign("Nhvgftgtd"));
}

