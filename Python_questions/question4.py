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

    # Your code here ↓↓↓↓




    # ↑↑↑↑ Your code goes above

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
