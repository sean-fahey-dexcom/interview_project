import random
import string


def question2():
    """"
    Goal: Check if a password is valid. A valid password must:
        1. Contain at least one uppercase letter
        2. Contain at least one number
        3. Be at least 8 characters long

    Steps:
        1. Check each character in the password to see if ANY character is
            uppercase. If true, set `hasUppercase` to true.
        2. Check each character in the password to see if ANY character is
            a number. If true, set `hasNumber` to true.
        3. Check if the password is at least 8 characters long. If true,
            set `isLongEnough` to true.

    """

    has_uppercase = False
    has_number = False
    is_long_enough = False

    password = password_generator(2, 5, 3)

    # Options for has_uppercase and has_number:
    # Option 1: simple loop and conditionals
    for char in password:
        if char.isupper():
            has_uppercase = True
        elif char.isdigit():
            has_number = True

    # Option 2: loop the indices. Some people take this approach when they're less familiar with Python syntax
    for i in range(len(password)):
        if password[i].isupper():
            has_uppercase = True
        elif password[i].isdigit():
            has_number = True

    # Option 3: list comprehension and any()  <- Bonus! Most pythonic, more advanced, but AI might suggest this
    has_uppercase = any(char.isupper() for char in password)
    has_number = any(char.isdigit() for char in password)

    # Option 4: Casting to set and using set operations  <- Bonus! AI will NEVER suggest this approach
    has_uppercase = bool(set(password) & set(string.ascii_uppercase))
    has_number = bool(set(password) & set(string.digits))

    # Option 5: Using regular expressions  <- Bonus! AI might suggest this approach, but it's more advanced
    import re
    has_uppercase = bool(re.search(r'[A-Z]', password))
    has_number = bool(re.search(r'\d', password))

    
    # Options for is_long_enough:
    # Option 1: simple condition
    if len(password) >= 8:
        is_long_enough = True

    # Option 2: in-line if condition
    is_long_enough = True if len(password) >= 8 else False

    # Option 3: direct assignment
    is_long_enough = len(password) >= 8




    if has_uppercase and has_number and is_long_enough:
        is_valid = True
    else:
        is_valid = False

    print("Question 2 - Password Validation")
    print(f"    Password:       {password}")
    print(f"    Has Uppercase:  {has_uppercase}")
    print(f"    Has Number:     {has_number}")
    print(f"    Is Long Enough: {is_long_enough}")
    print(f"    Is Valid:       {is_valid}")


def password_generator(num_upper: int, num_lower: int, num_digits: int) -> str:
    """Helper function that generates a random password"""

    password = []
    for _ in range(num_upper):
        password.append(random.choice(string.ascii_uppercase))
    for _ in range(num_lower):
        password.append(random.choice(string.ascii_lowercase))
    for _ in range(num_digits):
        password.append(random.choice(string.digits))
    random.shuffle(password)
    return ''.join(password)


if __name__ == "__main__":
    question2()
