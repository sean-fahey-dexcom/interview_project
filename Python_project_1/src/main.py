#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
This is the entry point for the project. Edit the `main` function to implement
the following:

1) Get the list of connected Android devices.
2) For each device do the following:
    2a) Find and click the `PROFILE` button.
    2b) Check if the `APP_VERSION` button is present.
    2c) If the `APP_VERSION` button is present, return the text value of the element.
    2d) If the `APP_VERSION` button is not present, return None.
3) Print the app version for each device.

"""

from appium.webdriver.common.appiumby import AppiumBy

from utils import get_connected_devices
from android_connector import AndroidConnector


def main():
    profile_locator_type = AppiumBy.XPATH
    profile_locator_value = "//button[text()='PROFILE']"

    app_version_locator_type = AppiumBy.ID
    app_version_locator_value = "app_version_element_id"

    devices = get_connected_devices()
    for device in devices:
        conn = AndroidConnector(device)
        conn.click_element(profile_locator_type, profile_locator_value)

        if conn.check_element_presence(app_version_locator_type, app_version_locator_value):
            app_version = conn.get_text_from_app_version_element(app_version_locator_type, app_version_locator_value)
            print(f"Device {device} has app version: {app_version}")

        else:
            print(f"Device {device} has app version: None")
        print()


if __name__ == "__main__":
    main()
