public class APLine
{
 private int first, second, third;

  public APLine(int a, int b, int c){
    first = a;
    second = b;
    third = c;
  }

  public double getSlope(){
    return (double)-first/second;
  }

  public boolean isOnLine(int x, int y){
    if(first * x + second * y + third == 0){
      return true;
    }
    return false;
  }

  
}
