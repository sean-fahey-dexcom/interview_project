"""Question 3:

Using the cleaned smartphone usage dataset, create a chart that shows the
average Work_Productivity_Score for each Occupation. Prefered methods are
matplotlib or plotly, but any tool will work.

"""

import matplotlib.pyplot as plt
import pandas as pd
import plotly.express as px


def load_data(file_path='Data_questions/data/Smartphone_Usage_Productivity_Dataset_50000.csv'):
    # Read just the first 500 rows into a dataframe
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0)
    return data

df = load_data()

avg_productivity = df.groupby('Occupation')['Work_Productivity_Score'].mean().sort_values()

fig, ax = plt.subplots(figsize=(8, 5))
avg_productivity.plot(kind='bar', ax=ax)
ax.set_ylabel('Average Work Productivity Score')
ax.set_xlabel('Occupation')
ax.set_title('Average Work Productivity Score by Occupation')
fig.tight_layout()

output_path = 'Data_questions/data/avg_productivity_by_occupation.png'
fig.savefig(output_path)
print(f"Question Answer: chart saved to {output_path}")
print(avg_productivity)
