object Q3 {
  def main(args: Array[String]): Unit = {

    print("Enter the number:");
    var x = scala.io.StdIn.readInt()
    var y= sum(x);
    print("The sum is:" + y);


  }

  def sum(x:Int):Int ={
    if(x==1)
      {
        return 1;
      }
    else
      {
        return (x+sum(x-1))
      }

  }

}
