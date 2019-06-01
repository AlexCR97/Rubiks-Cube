package org.yourorghere;

public class Utils {
    
    public static float wrap(float value, float min, float max) {
        if (value > max)
            return min;
        if (value < min)
            return max;
        return value;
    }
    
}
