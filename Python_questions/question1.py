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


    # Option 1: simple loop and modulus operator
    for num in numbers:
        if is_odd(num):
            odd_count += 1

    # Option 2: loop the indices. Some people take this approach when they're less familiar with Python syntax
    for i in range(len(numbers)):
        if is_odd(numbers[i]):
            odd_count += 1

    # Option 2: list comprehension and sum  <- Bonus! Most pythonic, more advanced, but AI might suggest this
    odd_count = sum(1 for num in numbers if is_odd(num))

    # Option 3: list comprehension and len  <- Bonus! AI will NEVER suggest this approach
    odd_count = len([num for num in numbers if is_odd(num)])

    # Option 4: filter and len  <- Bonus! AI will NEVER suggest this approach
    odd_count = len(list(filter(is_odd, numbers)))



    print("Question 1 - Odd Count")
    print(f"    Numbers:   {numbers}")
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
