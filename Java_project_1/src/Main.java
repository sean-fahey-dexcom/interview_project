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

        List<String> devices = Utils.getConnectedDevices();
        for (int i = 0; i < devices.size(); i++) {
            String deviceDsn = devices.get(i);
            System.out.println("Processing device: " + deviceDsn);
            AndroidConnector connector = new AndroidConnector(deviceDsn);

            boolean isPresent = connector.checkElementPresence(appVersionLocatorType, appVersionLocatorValue);
            if (isPresent) {
                String appVersion = connector.getTextFromAppVersionElement(appVersionLocatorType, appVersionLocatorValue);
                System.out.println("App version for device " + deviceDsn + ": " + appVersion);
            } else {
                System.out.println("App version for device " + deviceDsn + ": null");
            }
            System.out.println();
        }
    }
}
