/**
 * 
 * Implement a class that simulates a traffic light. The next method advances the color in the usual way, 
 * from green to yellow to red, then again to green. Provide two constructors, as described in the documentation 
 * of the public interface. Also supply a method that yields the number of times that this traffic light has been red.
 * 
 * 
 **/


/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private String color;
   private int reds;

   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      color = "green";
   }

   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      color = initialColor;
   }

   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      if(color == "green"){
         color = "yellow";
      }else if(color == "yellow"){
         color = "red";
      }else if(color == "red"){
         color = "green";
      }
   }

   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      return color;
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      if(color == "red"){
         reds++;
      }
      return reds;
   }
}

/// Test case (it should be in its own file)
public class TrafficLightTester
{
   public static void main(String[] args)
   {
      TrafficLight tl1 = new TrafficLight();
      System.out.println(tl1.getColor());
      System.out.println("Expected: green");
      System.out.println(tl1.getReds());
      System.out.println("Expected: 0");
      tl1.next();
      System.out.println(tl1.getColor());
      System.out.println("Expected: yellow");
      System.out.println(tl1.getReds());
      System.out.println("Expected: 0");
      tl1.next();
      System.out.println(tl1.getColor());
      System.out.println("Expected: red");
      System.out.println(tl1.getReds());
      System.out.println("Expected: 1");
      tl1.next();
      System.out.println(tl1.getColor());
      System.out.println("Expected: green");
      System.out.println(tl1.getReds());
      System.out.println("Expected: 1");

      TrafficLight tl2 = new TrafficLight("red");
      System.out.println(tl2.getColor());
      System.out.println("Expected: red");
      System.out.println(tl2.getReds());
      System.out.println("Expected: 1");
      tl2.next();
      System.out.println(tl2.getColor());
      System.out.println("Expected: green");
      System.out.println(tl2.getReds());
      System.out.println("Expected: 1");
      tl2.next();
      tl2.next();
      System.out.println(tl2.getColor());
      System.out.println("Expected: red");
      System.out.println(tl2.getReds());
      System.out.println("Expected: 2");
   }
}
