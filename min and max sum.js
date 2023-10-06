'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function miniMaxSum(arr) {
    
    
    arr.sort((a,b) => (a-b))
    // console.log(arr)
    
    let minSum = 0;
    let maxSum = 0;
    let sum = 0;
    
    for(let i=0;i<arr.length;i++){
        sum += arr[i];
    }
    
    minSum = arr[0]+ arr[1]+arr[2]+arr[3]
    maxSum = arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3]+arr[arr.length-4]
    
    console.log(minSum+" "+ maxSum);

}

function main() {

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}
