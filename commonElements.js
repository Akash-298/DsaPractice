// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

// console.log("Welcome to Programiz!");
const i1 = {a1:1,a2:1,a3:1,a4:1,a5:1}
const i2 = {a5:1,a1:1,a3:4,a4:2}
const ans ={}

// console.log(i1.size)

Object.entries(i1).map(entry1 => {
    let key1 = entry1[0];
    let value1 = entry1[1];
    
    Object.entries(i2).map(entry2=>{
         let key2 = entry2[0];
    let value2 = entry2[1];
    
    if(key1==key2  &&  value2 == value1){
        
        ans[key1] = value1;
        
    }
    
    })
    
});


 console.log(ans);


