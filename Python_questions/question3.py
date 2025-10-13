import random


def question3():
    """"
    Goal: Given a temperature, determine the weather condition.

    The conditions are:
        2. If the temperature is below 15, the condition is `Cold`
        3. If the temperature is between 16 and 25 (inclusive), the condition is `Good`
        4. If the temperature is above 25, the condition is `Hot`
    
        Fun bonus points:
            5. If the temperature is above 40, the condition is `🥵`
            
    """

    current_temperature = random_temperature(-10, 50)
    condition = "Unknown"

    # Your code here ↓↓↓↓




    # ↑↑↑↑ Your code goes above

    print("Question 3 - Weather Condition")
    print(f"    Temperature: {current_temperature}°C")
    print(f"    Condition:   {condition}")


def random_temperature(min: int, max: int) -> int:
    """Helper function that generates a random temperature"""

    return random.randint(min, max)


if __name__ == "__main__":
    question3()
