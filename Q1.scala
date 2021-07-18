object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    var num = scala.io.StdIn.readInt();
    if(prime(num))
      {
        print("Prime");

      }
      else{
         print("Not prime");

    }
  }
  def prime(x:Int,i:Int=2):Boolean={
    if(x<=2)
      {
        if(x==2)
          {
            return true;
          }
        else {

          return false;
        }
      }
      if(x%2==0)
        {
          return false;
        }
      if(i*i>x)
        {
          return true;
        }
        return prime(x,i+1);

  }
}
