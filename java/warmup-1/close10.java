/**
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.
**/
public int close10(int a, int b) {
  int awayFromTenA = 10-a;
  int awayFromTenB = 10-b;
  
  int absA = Math.abs(awayFromTenA);
  int absB = Math.abs(awayFromTenB);
  if(absA == absB){
    return 0;
  }
  if (absA > absB){
    return b;
  }
  else{
    return a;
  }
}
