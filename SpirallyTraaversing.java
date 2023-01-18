function spirallyTraversingAMatrix(N, a){
    
    
  
    let c =0;
    let max =N*N;
    
    let top =0;
    
    let bot=N-1;
    
    let l = 0;let r=N-1;
    let s =""
    
    while(c<max){
        
        for(let i=l;i<=r  && c<max;i++){
       s=s+a[top][i]+" ";
            c++
        }
        
        top++;
        
        
          for(let i=top;i<=bot  && c<max;i++){
               s=s+a[i][r]+" "
               c++
        }
        
        r--;
        
        
          for(let i=r ; i>=l  && c<max ; i--){
            s=s+a[bot][i]+" "
            c++;
        }
        
        bot--;
        
        
          for(let i=bot;i>=top  && c<max;i--){
            s=s+a[i][l]+" "
            c++
        }
        
        l++;
        
        
        
    }
    
    console.log(s)
  
}
