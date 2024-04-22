public class APLine
{
 private int first = 0;
  private int second = 0;
  private int third = 0;

  public APLine(int a, int b, int c){
    first = a;
    second = b;
    third = c;
  }

  public double getSlope(){
    return (double)-first/second;
  }

  public boolean isOnLine(int x, int y){
    if(first * x + second * y + c == 0){
      return true;
    }
    return false;
  }

  
}
