function runProgram(input) {
    
    let n =Math.floor(input);
    
        let x= call(n);
            console.log(x);
        

}
    function call(n){
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        
        return call(n-1)+call(n-2)+ call(n-3);
    
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