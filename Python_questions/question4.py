import random


def question4():
    """"
    Goal: Given a random string, determine if it is a palindrome. A 
    palindrome is a word that reads the same backward as forward like
    "racecar" or "level".

    Steps:
        1. Loop through the string and compare the first character to the
           last character.
        2. If they are the same, continue to the next character inward and
           compare again.
        3. If all characters match, the string is a palindrome. If any 
           characters do not match, the string is NOT a palindrome.

    """

    word = random_word_picker()
    is_palindrome = True

    # Option 1: simple loop and conditionals
    for i in range(len(word) // 2):
        left_letter = word[i]
        right_letter = word[-(i + 1)]
        if left_letter != right_letter:
            is_palindrome = False
            break

    # Option 2: Loop all the way across the word, not stopping at the middle.
    # Correct, but not efficient.
    for i in range(len(word)):
        left_letter = word[i]
        right_letter = word[-(i + 1)]
        if left_letter != right_letter:
            is_palindrome = False
            break

    # Option 3: Reverse slicing
    reversed_word = word[::-1]
    if word != reversed_word:
        is_palindrome = False

    # Option 4: Using the reversed() function and join()
    word_as_list = list(word)
    reversed_word_as_list = list(reversed(word_as_list))
    if word_as_list != reversed_word_as_list:
        is_palindrome = False

    # Option 5: Direct assignment. By far the best approach. Also very unique to python.
    is_palindrome = word == word[::-1]



    print("Question 4: Palindrome Check")
    print(f"    Word:          {word}")
    print(f"    Is Palindrome: {is_palindrome}")


def random_word_picker() -> str:
    """Helper function that generates a random word index"""
    words = [
            "racecar",      # palindrome
            "level",        # palindrome
            "stats",        # palindrome
            "java",
            "Dexcom",
            "noon",         # palindrome
            "palindrome",
            "radar",        # palindrome
            "civic",        # palindrome
            "testing",
            "kayak",        # palindrome
    ]
    return random.choice(words)


if __name__ == "__main__":
    question4()
