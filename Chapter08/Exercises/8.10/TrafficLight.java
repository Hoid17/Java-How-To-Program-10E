// Create an enum class for a traffic light
// @Author: Adam Janecka
package pkg8_10;

public enum TrafficLight {
    
    RED(80),
    YELLOW(10),
    GREEN(65);
    
    
    private final int duration;
    
    TrafficLight(int duration)
    {
        this.duration = duration;
    } // end constructor
    
    public int getDuration()
    {
        return duration;
    } // end method getDuration
    
} // end class TrafficLight
