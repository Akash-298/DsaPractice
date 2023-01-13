function station1to2(N, A, S, D){
    let s1=0 ; 
    let s2=0 ;
    for(let i=0;i<N;i++){
        if(S==A[i]){
            s1=i+1;
        }
        if(D==A[i]){
            s2=i+1;
        }
    }
    console.log(Math.abs(s1-s2)*5*7);
 }
 