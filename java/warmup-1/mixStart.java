/**
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
**/
public boolean mixStart(String str) {
  if (str.contains("ix")){
    return true;
  }
  else{
    return false;
  }
}
