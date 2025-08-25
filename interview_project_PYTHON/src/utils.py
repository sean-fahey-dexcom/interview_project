#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Utility functions for the the project. These functions work as expected and do
not need to be edited.
"""

from datetime import datetime
from pathlib import Path


def get_connected_devices() -> list:
    """
    Retrieves a list of connected Android devices.
    Returns:
        list: A list of connected device IDs.
    """
    print("Getting connected devices...")
    return ["device_1", "device_2"]


def get_current_time() -> str:
    """
    Retrieves the current timestamp.
    Returns:
        str: The current timestamp in "YYYY-MM-DD HH:MM:SS" format.
    """
    time_stamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    return time_stamp


def get_project_root_dir() -> Path:
    """
    Retrieves the root directory of the project.
    Returns:
        Path: The root directory path.
    """
    return Path(__file__).parent.resolve()
