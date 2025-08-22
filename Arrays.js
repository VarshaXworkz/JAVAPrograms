//Arrays
console.log("*********************************ARRAY***********************")
let array = [];
var days = [
'Monday',
'Tuesday',
'Wednesday',
'Thursday',
'Friday'
];
console.log(days.sort());
console.log(days.push('Sunday', 'Saturday'));
console.log(days);
console.log(days.sort().reverse());

console.log("Week days:"+days.length)
console.log("Week days middle day: ", days[3])
days [5] = 'saturday';
days [6] = 'sunday';
console.log(days);
//Updating the element
days[2] = 'Wed';
console.log(days);
days [10] = 'Month list';
console.log(days);
console.log("********************************************************************")


console.log("*************************2D ARRAY***********************************");
var matrices = [
 [1, 2, 3, 4], 
 [3, 4, 5], 
 [6, 7, 8, 9, 10]
 ];
console.log(matrices);
console.log("The Value Of First Row Second Column is",matrices[1][2])
console.log("********************************************************************")


console.log("*********************KEY VALUE PAIR IN ARRAY************************")
 var maths = {
    name:'Maths',
    topic: [
           'Addition',
           'Subtraction',
           'Multiplication',
           'Division'
    ],
division:{
"sub division": 4
        },
"add division": function (add) {
maths.division["sub division"] += add;
        }
};
console.log(maths.name);
console.log(maths.topic[1]);
console.log(maths.division ["sub division"]);
maths["add division"](4);
console.log(maths.division ["sub division"]);
console.log(maths);
//Add new Key value pair
maths.class=2;
//To Update 3rd index in the Array
maths.topic[3]='div';
console.log(maths)
console.log(maths.topic[3]);
maths.addToTopic = function (newTopic) {
    maths.topic[maths.topic.length] = newTopic;
};
maths.addToTopic('Trignometry');
maths.addToTopic('Graphs');
console.log(maths);
delete maths.topic[2];
console.log(maths.topic[2]);
console.log(maths.topic[3]);

// Adding another key which has an array type of values
maths.difficulty = [
    'Learning Maths is Easy', 
    'Learning Maths is Medium',
     'Learning Maths is Hard'
    ];

console.log(maths);
// This will now show the new `difficulty` key with its array.
console.log("********************************************************************")



console.log("**********************SORTING THE NUMBERS****************************")
//Sorting Numbers
var numbers=[2,60,88,65,32,12,566,200,3500,33,89,100]
console.log(numbers.sort());
console.log("**********************SORTING IN ASCENDING ORDER*************************")
//Sorting Ascending order
numbers.sort(function (x, y) {
return x -y;
});
console.log(numbers);

console.log("**********************SORTING IN DESCENDING ORDER*************************")
//Sorting Descending order
numbers.sort(function (x, y) {
return y-x;
});
console.log(numbers);
console.log("********************************************************************")


console.log("**********************ARRAY WITH OBJECT SORTING*************************")
//Array with object first we have seen object with array
var project = [
{hours: 50, name: 'project1'},
{ hours: 80, name: 'project2' },
{ hours: 20, name: 'project3' },
{ hours: 10, name: 'project4'},
{ hours: 90, name: 'project5' },
{ hours: 40, name: 'project6' }
];
project.sort(function(x,y){
     return x.hours-y.hours;
}
);  
console.log(project) 
console.log("********************************************************************")



console.log("*********************ARRAY DESTRUCTURING*************************************")
const dayss =[
'Mon',
'Tue',
'"Wed',
'Thur',
'Fri'
];
// let index0 =dayys[0];
// let index1 =dayys[1];
const first = dayss[0], second = dayss [1], fifth = dayss[4], sixth = dayss[5];
console.log(first, second, fifth, sixth);