object Q4 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    var num= scala.io.StdIn.readInt();
    var tf = even(num);
    if(tf==true) {
        print("Number is even");
    }
    else {
      print("Number is odd");
    }

  }

  def even(x:Int):Boolean={
    if(x==0){
      return true;
    }
    else
      {
        return odd(x);
      }

  }

  def odd(y:Int):Boolean={
    if(y==0) {
      return true;
      }
      else
      {
        return even(y-1)
      }
    }
  }


