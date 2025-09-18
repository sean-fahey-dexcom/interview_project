package src;

import java.util.Arrays;
import java.util.List;

/**
 * Utility functions for the project. These functions work as expected and do not need to be edited.
 */
public class Utils {
    // Utility function to get the list of connected Android devices
    public static List<String> getConnectedDevices() {
        System.out.println("Getting connected devices...");
        return Arrays.asList("device_1", "device_2");
    }
}
