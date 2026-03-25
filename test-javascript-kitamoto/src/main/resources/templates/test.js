'use strict'
// 問題1
console.log('北本美幸');

// 問題2
let firstName = 'Miyuki';
let lastName = 'Kitamoto';
console.log(firstName + ' ' + lastName);

// 問題3
let calc = () => {
    let result = 200 * 3 + 250 * 4;
    let tax = result * 0.1;
    console.log('小計');
    console.log(result);
    console.log('消費税');
    console.log(tax);
    console.log('合計金額');
    console.log(result + tax);
}
calc();

// 問題4
let testScore = 48;
if (0 <= testScore && testScore <= 79) {
    console.log('追試です');
} else if (80 <= testScore && testScore <= 100) {
    console.log('合格です');
} else {
    console.log('存在しない点数です');
}

// 問題5
let sum = 0;
for (let i = 1; i <= 100; i++) {
    sum += i;
}
console.log(sum);

// 問題6
let add = (x, y) => {
    return x + y;
}

let sub = (x, y) => {
    return x - y;
}

let multi = (x, y) => {
    return x * y;
}

let div = (x, y) => {
    return x / y;
}

console.log('5 + 3 = ' + add(5,3));
console.log('5 - 3 = ' + sub(5,3));
console.log('5 * 3 = ' + multi(5,3));
console.log('5 / 3 = ' + div(5,3));
