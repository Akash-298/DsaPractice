// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

console.log("Welcome to Programiz!");


function p(n){
    if(n == 1){
        console.log(n);
        return ;
    }
    
    p(n-1);
    console.log(n);
    
}


p(7);
