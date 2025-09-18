package src;

import java.io.*;
import java.util.*;


/**
 * This is the entry point for the project. Edit the `main` method to implement the following:
 *
 * 1) Get the list of connected Android devices.
 * 
 * 2) For each device do the following:
 *    a) Create an `AndroidConnector` instance.
 *    b) Check if the `APP_VERSION` button is present.
 *    c) If the `APP_VERSION` button is present, print the text value of the element.
 *    d) If the `APP_VERSION` button is NOT present, print the value `null`.
 *
 */
public class Main {
    public static void main(String[] args) {
        String appVersionLocatorType = "ID";
        String appVersionLocatorValue = "app_version_element_id";

        String showUsernameLocatorType = "ID";
        String showUsernameLocatorValue = "show_username_element";

        System.out.println("Hello World!");
        System.out.println(appVersionLocatorType + '\t' + appVersionLocatorValue);
    }
}
