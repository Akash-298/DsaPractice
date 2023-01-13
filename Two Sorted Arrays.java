function runProgram(input) {
	input=input.split("\n");
	let tc=Number(input[0]);
	let l=1;
    for(let i=0;i<tc;i++){
        let n=Number(input[l]);
        l++;
        let arr1=input[l].trim().split(" ").map(Number);
        // console.log(arr1);
        l++;
        let arr2=input[l].trim().split(" ").map(Number);
        l++;
        // console.log(arr2)
        call(n,arr1,arr2);
    }
    
}
function call(n,arr1,arr2){
    // console.log(arr1,arr2);
    let left=0;
    let right=n-1;
    let count=0;
   while(left<n && right >=0 ){
        if(arr1[left]==arr2[right]){
            count++;
            left++;
            right--;
        }else if(arr1[left]>arr2[right]){
            right--;
        }else if(arr1[left]<arr2[right]){
            left++;
        }
    }
    console.log(count);
}



if (process.env.USERNAME === "") {
	runProgram(``);
} else {
	process.stdin.resume();
	process.stdin.setEncoding("ascii");
	let read = "";
	process.stdin.on("data", function (input) {
		read += input;
	});
	process.stdin.on("end", function () {
		read = read.replace(/\n$/, "");
		read = read.replace(/\n$/, "");
		runProgram(read);
	});
	process.on("SIGINT", function () {
		read = read.replace(/\n$/, "");
		runProgram(read);
		process.exit(0);
	});
}