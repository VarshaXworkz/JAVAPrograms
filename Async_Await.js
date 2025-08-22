 //A Promise is an Object that links Producing code and Consuming code

/*"async and await make promises easier to writ"

async makes a function return a Promise

await makes a function wait for a Promise */
// Promises are of 3 types
// pending,fulfilled,rejected
 const fetchAndAddTodos =async () => {
try {
const response =await fetch('https://jsonplaceholder.typicode.com/posts/10')
const result = await response.json();
console.log(result);
} catch (error) {
    console.log(error)
}
};
fetchAndAddTodos();
