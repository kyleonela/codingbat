/**
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
**/
public int diff21(int n) {
  int y;
  if(n>21){
    int a = n-21;
    int x = Math.abs(a);
    y = a*2;
  }
  else{
    int a = 21-n;
    y = Math.abs(a);
  }
  return y;
}
