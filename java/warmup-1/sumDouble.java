/**
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.
**/
public int sumDouble(int a, int b) {
  int x;
  if (a == b){
    x = (a+b)*2;
  }
  else{
    x = a+b;
  }
  return x;
}
