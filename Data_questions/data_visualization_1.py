import pandas as pd
import matplotlib.pyplot as plt


def load_and_clean_data(file_path='Data_questions/data/smartphone_usage_sample_messy.csv'):
    # Same messy dataset and cleaning steps used in data_cleaning_1.py:
    # duplicate rows, missing values, and a few invalid (negative) entries.
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0)

    data = data.drop_duplicates().reset_index(drop=True)

    data = data.dropna().reset_index(drop=True)

    numeric_cols = data.select_dtypes(include='number').columns
    impossible_cols = [col for col in numeric_cols if (data[col] < 0).any()]
    data = data[(data[impossible_cols] >= 0).all(axis=1)].reset_index(drop=True)

    return data


df = load_and_clean_data()

# Question: Using the cleaned data, plot the average Work_Productivity_Score
# for each Occupation so we can see which occupation tends to score highest.
#
# It doesn't matter which charting library or output method you use
# (matplotlib, plotly, seaborn, etc.), and it's fine to save the plot to a
# file (PNG) or open it in a browser/window - whatever is quickest for you.

avg_productivity = df.groupby('Occupation')['Work_Productivity_Score'].mean().sort_values()

fig, ax = plt.subplots(figsize=(8, 5))
avg_productivity.plot(kind='barh', ax=ax)
ax.set_xlabel('Average Work Productivity Score')
ax.set_ylabel('Occupation')
ax.set_title('Average Work Productivity Score by Occupation')
fig.tight_layout()

output_path = 'Data_questions/data/avg_productivity_by_occupation.png'
fig.savefig(output_path)
print(f"Question Answer: chart saved to {output_path}")
print(avg_productivity)
