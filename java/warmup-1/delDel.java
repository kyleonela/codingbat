/**
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.
**/
public String delDel(String str) {
  //(0,1)=first letter
  //(1,4)=if it has del
  if (str.length()>3){
    String containsDel = str.substring(1,4);
    if(containsDel.equals("del")){
      return str.substring(0,1)+str.substring(4,str.length());
    }
    else{
      return str;
    }
  }
  return str;
}
