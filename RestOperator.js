//Declaring an argument
console.log("REST OPERATOR IN FUNCTION ARGUMENTS");
foo(1,2,3,4,5,6);
function foo(x, y, ... others) {
console.log(x);
console.log(y);
console.log(others);
};

let sortedNumbers = sort(55,22,11,66,33);
console.log(sortedNumbers)

function sort(...numbers){
    return numbers.sort();
}

console.log("REST OPERATOR IN ARRAY DESTRUCTURING");

const days = [
'Mon',
'Tue',
'Wed',
'Thur'
];
const [first, second,...others] = days;
console.log(first, second, others);

//Rest operator in object destructuring
console.log("REST OPERATOR IN OBJECT DESTRUCTURING");
const john = {
name:'john',
age: 32,
mailIds:[
'john.com',
'john.in'],
address: {
 city: 'blr',
pincode: 560100
}
};
const{name: johnname, address: {city: residence, pincode},...other}=john
console.log(johnname, residence, pincode, other);

