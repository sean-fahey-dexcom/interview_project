"""Question 3:

Using the cleaned smartphone usage dataset, create a chart that shows the
average Work_Productivity_Score for each Occupation. Prefered methods are
matplotlib or plotly, but any tool will work.

"""

import matplotlib.pyplot as plt
import pandas as pd
import plotly.express as px


def load_data(file_path='Data_questions/data/Smartphone_Usage_Productivity_Dataset_50000.csv'):
    data = pd.read_csv(file_path, sep=',', encoding='utf-8', header=0)
    return data

df = load_data()
