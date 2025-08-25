#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
This file contains the AndroidConnector class, which provides methods for
interacting with a fake Android device. This class works as expected and does
not need to be updated.
"""

from appium.webdriver.common.appiumby import AppiumBy


class AndroidConnector:
    """This class provides methods for interacting with a fake Android device."""
    def __init__(self, device_dsn):
        self.device_dsn = device_dsn

    def click_element(self, locator_type: AppiumBy, locator_value: str) -> None:
        """
        Clicks an Appium element using the provided locator.
        """

        print(f"\tSuccessfully clicked on element with locator_type: {locator_type} and value: {locator_value}")

    def check_element_presence(self, locator_type: AppiumBy, locator_value: str) -> bool:
        """
        Checks the presence of an Appium element.
        """

        print(f"\tFound an element with locator_type: {locator_type} and value: {locator_value}")
        return True

    def get_text_from_app_version_element(self, locator_type: AppiumBy, locator_value: str):
        """
        Gets the text from the app version element.
        """

        print(f"\tExtracting app version text from element with locator_type: {locator_type} and value: {locator_value}")

        if locator_type == AppiumBy.ID and locator_value == "app_version_element_id":
            return f"1.6.41rc{self.device_dsn[-1]}"

        else:
            raise ValueError("Unsupported locator for getting app version text")
