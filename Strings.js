 console.log("**********************************STRINGS****************************************");

var word = 'hello my NAME is hrutiksha';

var substring_word = word.substring(7,16); 
console.log(substring_word);

var substring_word2 = word.substring(7);
console.log(substring_word2);

var after_replace = word.replace('hello', 'hello everyone');
console.log(after_replace);

var fruits = 'Carrot, Capsicum, Beans';
var split_word = fruits.split(',');
console.log(split_word);
console.log(after_replace);

var indexOf_replace = after_replace.indexOf('my')
console.log(indexOf_replace);

var lastIndexOf_replace = after_replace.lastIndexOf('my')
console.log(lastIndexOf_replace);

var upperCase=after_replace.toUpperCase()
console.log(upperCase)

var lowerCase=after_replace.toLowerCase()
console.log(lowerCase)

//var replace_first=after_replace.replace_first('e','eee')
//console.log(replace_first)

//var length_string=after_replace.length()
//console.log(length_string)

var starts_with=after_replace.startsWith('n')
console.log(starts_with)

var ends_with=after_replace.endsWith('o')
console.log(ends_with)

var trim_string=after_replace.trim()
console.log(trim_string)

var char=after_replace.charAt(2)
console.log(char)



console.log("****************************************************************************")





