package edu.javacourse;

import org.joda.time.LocalDateTime;
import ru.carousel.Test;

public class App {
    public static void main( String[] args )
    {
      LocalDateTime dt = new LocalDateTime();
      System.out.println("Сейчас: " + dt);
      System.out.println(Test.getStr());
    }
}
