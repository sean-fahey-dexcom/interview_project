"""Question 1:

I've provided a function to read a csv file into pandas. There are known data
quality issues with the file. Do the following:

1. Tell me the average Sleep_Hours for each Stress_Level.
2. Remove any rows that are exact duplicates.
3. Print how many columns have missing values.
4. Delete any rows with missing values.
5. Identify any columns that contain impossible values.
6. Delete any rows that contain impossible values.
7. Tell me the new average Sleep_Hours for each Stress_Level.

"""

import pandas as pd


def load_data(file_path='Data_questions/data/smartphone_usage_sample_messy.csv'):
    # This file is a "messy" sample of the smartphone usage dataset. It has
    # duplicate rows, missing values, and a few invalid entries mixed in on
    # purpose.
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0)
    return data

df = load_data()
print(df.head())
print(df.info())
