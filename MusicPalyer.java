class song{
  
int length;
String language;
int index;

public song(int index,int length,
String language){
    this.length=length;
    this.index=index;
    this.language=language;
    
}
  
  
  public int length(){
      return this.length;
  }
  
    public String category(){
      int x= this.index;
      
      if(x==1){
          return "Classical";
      }else if(x==2){
          return "Hip Hop";
      }
       else if(x==3){
          return "R&B";
      }else if(x==4){
          return "Bollywood";
      }else if(x==5){
          return "EDM";
      }else{
          return "Originals";
      }
  }
  
  
  
  
    public String language(){
      return this.language;
  }
}
