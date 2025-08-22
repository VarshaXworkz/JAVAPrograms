console.log("**********************FUNCTION ARE OBJECT************************************");
console.log("**********************FUNCTION CALL******************************************");
//With the call() method, you can write a method that can be used on different objects
//CALL METHOD WITHOUT ARGUMENT
const person3 = {
fullName: function () {
return this.firstName + "" + this.lastName;
    }
}
const person4 = {
    firstName: "Mathew",
    lastName: "Manu"
}
console.log(person3.fullName.call(person4));

//CALL METHOD WITH ARGUMENT
const person5 = {
fullName: function (city, country) {
return this.firstName + " "+ this.lastName + ","+ city+","+country;
}
}
const person6 = {
firstName: "Mathew",
lastName: "Manu"
}
console.log(person5.fullName.call(person6, "Bangalore", "India"));

console.log(" ***FUNCTION APPLY*****");
//The call() method takes arguments separately.
//The apply() method takes arguments as an array.
//The apply() method accepts arguments in an array
console.log(person5.fullName.apply [person6, ["Karnataka", "India"]]);

console.log("******************FUNCTION BIND******************************************");
//With the bind() method, an object can borrow a method from
const person7 = {
firstName: "John",
lastName: "Doe",
fullName: function () {
return this.firstName + + this.lastName;
}
}
 const member = {
firstName: "Hege",
lastName: "Nilsen",
}
let fullName = person7.fullName.bind(member);
console.log(fullName());

console.log("***********************************FOR EACH*********************************");
var days = [
{day: 'Sunday', hours: 3},
{day: 'Monday', hours: 8},
{day: 'Tuesday', hours: 10},
{day: 'Wednesday', hours: 5 }
]
days.forEach(function (days) {
console.log(days);
});

