package src;

import java.io.*;
import java.util.*;


/**
 * This is the entry point for the project. Edit the `main` method to implement the following:
 *
 * 1) Get the list of connected Android devices.
 * 
 * 2) For each device do the following:
 *    2a) Find and click the `PROFILE` button.
 *    2b) Check if the `APP_VERSION` button is present.
 *      2b.1) If the `APP_VERSION` button is present, get the text value of the element.
 *      2b.2) If the `APP_VERSION` button is not present, get the value `null`.
 * 
 * 3) Print the app version or null for each device.
 */
public class Main {
    public static void main(String[] args) {
        String profileLocatorType = "XPATH";
        String profileLocatorValue = "//button[text()='PROFILE']";

        String appVersionLocatorType = "ID";
        String appVersionLocatorValue = "app_version_element_id";

        String showUsernameLocatorType = "ID";
        String showUsernameLocatorValue = "show_username_element";

        System.out.println("Hello World!");
        System.out.println(profileLocatorType + '\t' + profileLocatorValue);
    }
}
