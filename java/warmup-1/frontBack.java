/**
Given a string, return a new string where the first and last chars have been exchanged.
**/
public String frontBack(String str) {
  if(str.length()>=2){
    String firstLetter = str.substring(0,1);
    String lastLetter = str.substring(str.length()-1,str.length());
    String withoutFirstorLast = str.substring(1,str.length()-1);
    return lastLetter+withoutFirstorLast+firstLetter;
  }
  else{
    return str;
  }
}
