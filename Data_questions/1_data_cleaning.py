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

# Step 1: What is the average Sleep_Hours for each Stress_Level, before we've
# done any cleaning?
print("Question 1 Answer:")
print(df.groupby('Stress_Level')['Sleep_Hours'].mean())

# Step 2: Remove any rows that are exact duplicates.
df = df.drop_duplicates().reset_index(drop=True)

# Step 3: How many columns have missing values?
print("Question 3 Answer:", end='\t')
print((df.isna().sum() > 0).sum())

# Step 4: Delete any rows with missing values.
df = df.dropna().reset_index(drop=True)

# Step 5: Identify any columns that contain impossible values. None of these
# columns should ever be negative, so a negative value is impossible.
numeric_cols = df.select_dtypes(include='number').columns
impossible_cols = [col for col in numeric_cols if (df[col] < 0).any()]
print("Question 5 Answer:", end='\t')
print(impossible_cols)

# Step 6: Delete any rows that contain impossible values.
df = df[(df[impossible_cols] >= 0).all(axis=1)].reset_index(drop=True)

# Step 7: Now that the data is cleaned, what is the new average Sleep_Hours
# for each Stress_Level?
print("Question 7 Answer:")
print(df.groupby('Stress_Level')['Sleep_Hours'].mean())
