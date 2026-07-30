import pandas as pd


def load_data(file_path='Data_questions/data/Smartphone_Usage_Productivity_Dataset_50000.csv'):
    # Read just the first 500 rows into a dataframe
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0, nrows=500)
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

# Question 3a: How many participants in the dataset use their smartphones for more than 8 hours a day?
print("Question 3a Answer:", end='\t')
print((df['Daily_Phone_Hours'] > 8).sum())

# Question 3b: What percentage of participants use their smartphones for more than 8 hours a day?
print("Question 3b Answer:", end='\t')
print((df['Daily_Phone_Hours'] > 8).sum() / len(df) * 100)

# Question 4: What is the average Sleep_Hours per Caffeine_Intake_Cups category?
print("Question 4 Answer:")
print(df.groupby('Caffeine_Intake_Cups')['Sleep_Hours'].mean())

