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
    # Your code here



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
    # Your code here



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
