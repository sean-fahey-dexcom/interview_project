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

    # Your code here ↓↓↓↓




    # ↑↑↑↑ Your code goes above

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
