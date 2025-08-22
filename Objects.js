 console.log("******************************OBJECT************************************");

// Create an Object
const person = {};

// Add Properties
person.firstName = "Kamal";
person.lastName = "Hassan";
person.age = 50;
console.log(person);

// Create an Object using new keyword 
  const person1 = new Object();
// Add Properties
person1.firstName = "Raju";
person1.lastName = "Jaggu";
person1.age = 10;

//Creating Object and adding properties
const person2 = {
name: "Tarun",
lastName: "Sudesh",
age : 80
}
console.log(person2);



console.log("*************************OBJECT CONSTRUCTOR FUNCTION***********************")
// Constructor Function for Person objects
function Persons (first, last, age, eye) {
this.firstName = first;
this.lastName = last;
this.age= age;
this.eye=eye;
this.country = "India" //Default value
}
//Create person object
const myFather = new Persons("Mino", "Mathew", 50);
const myMother = new Persons("Angel", "Doss", 50, "blue");
console.log(myFather);
console.log(myMother);
console.log("****************************************************************************")


console.log("*****************************OBJECT PROTOTYPE*******************************")
//Adding new properties to the object constructor 
Persons.prototype.nationality = "Indian";
console.log(myFather.nationality);

//Adding methods to Object Constructor
Persons.prototype.fullname = function() {
return this.firstName + " " + this.lastName;
};
console.log("Father Full Name Is :"+myFather.fullname);
console.log("Mother Full Name Is :"+myMother.fullname);
console.log(myFather);
console.log("****************************************************************************")


console.log("*********************OBJECT DESTRUCTURING*************************************")
const john = {
name: 'John',
age: 2,
mailId : [
'john.com',
'john.in',
],
address:{
city:'Blr',
pincode:560100
}
};
let fname = john.name;
let jage =john.age;
let pemail= john.mailId[0];
let semail =john.mailId [1];
//Values in the key(inside object)
//storing it in the other variables (outside object)
const {name, age: Myage, mailId:[primary, secondary], address:{city:residence,pincode}}=john;
console.log(name, Myage, primary, secondary, residence, pincode);

