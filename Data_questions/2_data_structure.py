"""Question 2:

I've provided a function to load the clean version of the smartphone usage
dataset into a pandas DataFrame. Answer the following questions:

1. How many rows are in the dataset?
2. What is the average Daily_Phone_Hours among the participants in the dataset?
3. How many participants in the dataset use their smartphones for more than 8 hours a day?
4. What percentage of participants use their smartphones for more than 8 hours a day?
5. What is the average Sleep_Hours per Caffeine_Intake_Cups category?

"""

import pandas as pd


def load_data(file_path='Data_questions/data/Smartphone_Usage_Productivity_Dataset_50000.csv'):
    # Read just the first 500 rows into a dataframe
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0)
    return data

df = load_data()
print(df.head())
print(df.info())

# Question 1: How many rows are in the dataset?
print("Question 1 Answer:", end='\t')
print(len(df))

# Question 2: What is the average Daily_Phone_Hours among the participants in the dataset?
print("Question 2 Answer:", end='\t')
print(df['Daily_Phone_Hours'].mean())

# Question 3: How many participants in the dataset use their smartphones for more than 8 hours a day?
print("Question 3 Answer:", end='\t')
print((df['Daily_Phone_Hours'] > 8).sum())

# Question 4: What percentage of participants use their smartphones for more than 8 hours a day?
print("Question 4 Answer:", end='\t')
print((df['Daily_Phone_Hours'] > 8).sum() / len(df) * 100)

# Question 5: What is the average Sleep_Hours per Caffeine_Intake_Cups category?
print("Question 5 Answer:")
print(df.groupby('Caffeine_Intake_Cups')['Sleep_Hours'].mean())

