import random as rm


def question_1():
    """
    Goal: Count how many ODD numbers are in a randomly generated array
    of integers.

    Steps:
      1. Generate an array of random integers
      2. Loop through the array and count how many ODD numbers are present
      3. Save this to the variable odd_count
    """
    
    odd_count = 0

    # Step 1
    random_array = generate_random_array()
    print("Random array:", random_array)

    # Step 2 & 3
    # Option 1: simple loop and modulus operator
    for num in random_array:
        if num % 2 != 0:
            odd_count += 1
    
    # Option 2: loop the indices. Some people take this approach when they're less familiar with Python syntax
    for i in range(len(random_array)):
        if random_array[i] % 2 != 0:
            odd_count += 1

    # Option 2: list comprehension and sum  <- Bonus! Most pythonic, more advanced, but AI might suggest this
    odd_count = sum(1 for num in random_array if num % 2 != 0)

    # Option 3: list comprehension and len  <- Bonus! AI will NEVER suggest this approach
    odd_count = len([num for num in random_array if num % 2 != 0])

    # Option 4: filter and len  <- Bonus! AI will NEVER suggest this approach
    def is_odd(x):
        return x % 2 != 0
    odd_count = len(list(filter(is_odd, random_array)))


    return odd_count


def question_2():
    """
    Goal: Generate a random string of length 10 containing only the
    letters a, b, c, d, and e. Find which letter appears the most AND
    how many times it appears.
    
    Steps:
      1. Generate a random string of length 10 containing only the
         letters a, b, c, d, and e.
      2. Loop through the string and count how many times each letter
         appears.
      3. Save the letter that appears to the variable mostFrequentChar.
      4. Save the number of times it appears to the variable maxFrequency.
    """
    most_frequent_char = ''
    max_frequency = 0

    # Step 1:
    random_string = generate_random_string()
    print("Random string:", random_string)

    # Step 2, 3, & 4:

    # Option 1: simple loop and dictionary
    frequency = {}
    for char in random_string:
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1
    
    most_frequent_char = max(frequency, key=frequency.get)
    max_frequency = frequency[most_frequent_char]

    # Option 2: loop the indices
    frequency = {}
    for i in range(len(random_string)):
        char = random_string[i]
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1

    most_frequent_char = max(frequency, key=frequency.get)
    max_frequency = frequency[most_frequent_char]

    # Option 3: count method and dictionary comprehension <- Bonus! AI won't suggest this approach.
    letters = 'abcde'
    frequency = {char: random_string.count(char) for char in letters}
    most_frequent_char = max(frequency, key=lambda x: frequency.get(x, 0))
    max_frequency = frequency[most_frequent_char]


    # Option 4: count method without a dictionary <- Bonus! AI won't suggest this approach.
    letters = 'abcde'
    for char in letters:
        count = random_string.count(char)
        if count > max_frequency:
            max_frequency = count
            most_frequent_char = char


    # Option 5: collections.Counter <- Bonus! This person is an expert at Python
    from collections import Counter
    frequency = Counter(random_string)
    most_frequent_char, max_frequency = frequency.most_common(1)[0]

    return most_frequent_char, max_frequency


# Helper functions - do not modify
def generate_random_array(size=10, lower_bound=1, upper_bound=100):
    return [rm.randint(lower_bound, upper_bound) for _ in range(size)]


def generate_random_string(length=10):
    letters = 'abcde'
    return ''.join(rm.choice(letters) for _ in range(length))



if __name__ == "__main__":
    print("Question 1:", question_1())
    print("Question 2:", question_2())
