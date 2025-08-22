const name = 'Priya', message = 'Hello';

//Normal concatination
const greetings = message + ' '+name + '!';
console.log(greetings);

//Using template String
const msg = `${message} ${name}! "How are you"`;
console.log(msg);

const john = {
    name:'John',
    email:'john.com',
    age:2
};
//Normal

const strMsg = '<tr>' +
'<td>' + john.name + '/<td>' +
'<td>' + john.email + '/<td>' +
'<td>' + john.age + '/<td>'
'</tr>';
console.log(strMsg);

//Using String template

const messages = `
<tr>
<td> ${john.name} </td>
<td> ${john.email} </td>
<td> ${john.age} </td>
</tr>
`;
console.log(messages);