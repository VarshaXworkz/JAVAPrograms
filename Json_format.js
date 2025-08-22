console.log("****JSON FORMAT*****");
//JSON -->Javascript Object Notation
const strProducts =`[
{"name":"Hammer",
"price": 120,
"rating": {
"min": 2,
"max": 5
}
},
{
"name": "Screwdriver",
"price":150
}
]
`
//JSON.parse()---->Used to parse JSON String written in JSON format
//and return a javascript object
var Products= JSON.parse(strProducts);
console.log(Products);
var newProduct = {
    "name": "Axe",
"price":200
};
Products.push(newProduct);
console.log(Products);

//JSON.stringify()--->Convert javascript object into JSON String
//When transferring data to web server, data has to be a string
var stringProducts = JSON.stringify(Products);
console.log(stringProducts);
