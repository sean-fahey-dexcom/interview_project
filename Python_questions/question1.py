import random


def question1():
    """"
    Goal: Count how many ODD numbers are in a randomly generated array
    of integers.

    Steps:
        1. Loop through the array and check each number one at a time.
        2. If the number is odd, add 1 to the odd_count variable.

    """

    numbers = number_generator(10, 1, 100)
    odd_count = 0

    # Your code here ↓↓↓↓




    # ↑↑↑↑ Your code goes above

    print("Question 1 - Odd Count")
    print(f"    Numbers:   {', '.join(numbers)}")
    print(f"    Odd Count: {odd_count}")


def is_odd(number):
    """Helper function that checks if a number is odd"""
    result = number % 2 != 0
    return result


def number_generator(size, min_val, max_val):
    """Helper function that generates a list of random integers"""
    numbers = []
    for i in range(size):
        numbers.append(random.randint(min_val, max_val))
    return numbers


if __name__ == "__main__":
    question1()
