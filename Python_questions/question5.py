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


    # Option 1: simple loop and dictionary
    frequency = {}
    for char in random_str:
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1
    most_frequent_char = max(frequency, key=frequency.get)
    max_frequency = frequency[most_frequent_char]


    # Option 2: dictionary with two loops
    frequency = {}
    for char in random_str:
        if char not in frequency:
            frequency[char] = 0
        else:
            frequency[char] += 1
    
    for key, value in frequency.items():
        if value > max_frequency:
            max_frequency = value
            most_frequent_char = key


    # Option 3: dictionary with 3 loops
    for char in random_str:
        frequency[char] = 0
    
    for char in random_str:
        frequency[char] += 1
    
    for key, value in frequency.items():
        if value > max_frequency:
            max_frequency = value
            most_frequent_char = key


    # Option 4: using collections.Counter
    from collections import Counter
    frequency = Counter(random_str)
    most_frequent_char, max_frequency = frequency.most_common(1)[0]


    # Option 5: using str.count() method without a dictionary
    letters = 'abcde'
    for char in letters:
        count = random_str.count(char)
        if count > max_frequency:
            max_frequency = count
            most_frequent_char = char


    # Option 6: dictionary comprehension and a lambda lookup
    letters = 'abcde'
    frequency = {char: random_str.count(char) for char in letters}
    most_frequent_char = max(frequency, key=lambda x: frequency.get(x, 0))
    max_frequency = frequency[most_frequent_char]



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
