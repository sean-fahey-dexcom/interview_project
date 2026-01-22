import random
import string


def question5():
    """
    Goal: You are given a random string of length 10 containing ONLY the
    letters a, b, c, d, and e. Find which letter appears the most AND
    how many times it appears.

    Steps:
        1. Loop through the string and count how many times each letter appears.
        2. Save the letter that appears to the variable `mostFrequentChar`.
        3. Save the number of times it appears to the variable `maxFrequency`.

    """

    random_str = random_string(10)
    most_frequent_char = 'None'
    max_frequency = 0

    # Your code here ↓↓↓↓



    # ↑↑↑↑ Your code goes above

    print("Question 5 - Most Frequent Character")
    print(f"    String:            {random_str}")
    print(f"    Most Frequent:     {most_frequent_char}")
    print(f"    Max Frequency:     {max_frequency}")


def random_string(length: int) -> str:
    """
    Helper function that generates a random string of the given length
    containing ONLY the letters a, b, c, d, and e.
    """

    letters = ('a', 'b', 'c', 'd', 'e')
    result = ''
    for _ in range(length):
        selected_letter = random.choice(letters)
        result += selected_letter

    return result


if __name__ == "__main__":
    question5()
