package mypackage;

import newpackage.Test;

public class HelloWorld {

  public static void main(String args[]) {
     String str = "My world";
     Test test = new Test();
     System.out.println(str.concat(test.getNewStr()));
  }

}
