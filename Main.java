import java.util.*;
import java.util.concurrent.*;
  
class Main {
    public static void main(String args[])
    {
        int x = 0;
        Date d1;				// create an instance of Date		
        int m,y,d,h,mi,s;

        // Create a TimeUnit object
        TimeUnit time = TimeUnit.SECONDS;
  
        try {
      while(x == 0){
      d1 = new Date();
      m = d1.getMonth();		// get month (0-11 for Jan to Dec) need to +1 to compensate
    	y = d1.getYear();		// get # of year from 1900
    	d = d1.getDate();		// get date, it’s correct
    	h = d1.getHours();		// get hour, it’s correct (Greenwich Mean Time)
    	mi = d1.getMinutes();		// get minute, it’s correct
    	s = d1.getSeconds();		// get second, it’s correct
      if ((h - 4) >= 0){
        h -= 16;
      } else if ((h - 4) < 0){
        d -= 1;
        h = (12 + (h-4));
      }
      System.out.println((y+1900) + " " + (m+1) + " " + d);
    	System.out.println(h + ":" + mi + ":" + s + "EST");
      time.sleep(1);
      System.out.print("\033[H\033[2J");   
      //System.out.flush();
    }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted "
                               + "while Sleeping");
        }
    }
}