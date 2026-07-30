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

# Question 1: How many exact duplicate rows are in the dataset? Remove them.
print("Question 1 Answer:", end='\t')
print(df.duplicated().sum())

df = df.drop_duplicates().reset_index(drop=True)

# Question 2: Which columns have missing values, and how many missing values
# does each one have?
print("Question 2 Answer:")
print(df.isna().sum())

# Fill the missing numeric values with that column's median so a single
# missing reading doesn't force us to throw the whole row away.
for col in ['Daily_Phone_Hours', 'Sleep_Hours', 'Stress_Level']:
    df[col] = df[col].fillna(df[col].median())

# Question 3: Some rows have an invalid (negative) Daily_Phone_Hours value.
# How many rows are invalid, and what should we do with them?
print("Question 3 Answer:", end='\t')
print((df['Daily_Phone_Hours'] < 0).sum())

# A negative number of hours doesn't make sense, so drop those rows rather
# than guess at a replacement value.
df = df[df['Daily_Phone_Hours'] >= 0].reset_index(drop=True)

# Question 4: Now that the data is cleaned, what is the average Sleep_Hours
# for each Stress_Level?
print("Question 4 Answer:")
print(df.groupby('Stress_Level')['Sleep_Hours'].mean())
