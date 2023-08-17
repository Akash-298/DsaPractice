console.log("Hello, World!");

let str1 = "The tig trown tlack bow tow bow"
let str =str1.toLowerCase();
let arr = str.split(" ")

//console.log(arr
let finalArr=[];
for(let i=0;i<arr.length;i++){
  finalArr.push.apply(finalArr, arr[i].split(""));

}
let obj = {}
finalArr.forEach((item)=>{
  
    if(obj[item]==undefined)  obj[item]=1
    else obj[item]+=1
    
})
let max  = 0
let ans =""
let valuee = 0
  
    Object.entries(obj).forEach((item) =>{
      if(item[1]>max){
        max = item[1]
        valuee= item[1]
        ans = item[0]
      }
      
      
    })

console.log(ans,valuee)
