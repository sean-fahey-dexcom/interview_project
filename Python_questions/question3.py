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

    # Option 1: simple if-elif-else statements
    if current_temperature < 15:
        condition = "Cold"
    elif 16 <= current_temperature <= 25:
        condition = "Good"
    elif 26 <= current_temperature <= 40:
        condition = "Hot"
    else:  # current_temperature > 40
        condition = "🥵"
    

    # Option 2: nested if-else statements. Not as pretty, but still works.
    if current_temperature < 15:
        condition = "Cold"
    else:
        if 16 <= current_temperature <= 25:
            condition = "Good"
        else:
            if 26 <= current_temperature <= 40:
                condition = "Hot"
            else:  # current_temperature > 40
                condition = "🥵"
    

    # Option 3: in-line if-else statements. More advanced.
    condition = (
        "Cold" if current_temperature < 15 else
        "Good" if 16 <= current_temperature <= 25 else
        "Hot" if 26 <= current_temperature <= 40 else
        "🥵"
    )

    # Option 4: Using a dictionary and a loop. Way more advanced, but not as efficient.
    conditions = {
        "Cold": lambda temp: temp < 15,
        "Good": lambda temp: 16 <= temp <= 25,
        "Hot": lambda temp: 26 <= temp <= 40,
        "🥵": lambda temp: temp > 40,
    }
    for condition, lambda_function in conditions.items():
        if lambda_function(current_temperature):
            condition = condition
            break




    print("Question 3 - Weather Condition")
    print(f"    Temperature: {current_temperature}°C")
    print(f"    Condition:   {condition}")


def random_temperature(min: int, max: int) -> int:
    """Helper function that generates a random temperature"""

    return random.randint(min, max)


if __name__ == "__main__":
    question3()
