# Interview Project

## Note

These are instructions for the interview, not for the candidate. Candidate
instructions are comments in the code.

### Candidate Expectations

These are software testers, not software developers. I usually don't expect
perfect code, especially at L1 and L2.

__Level 1 software testers:__

- Understand for loops and if statements.
- Understand accessing and modifying pre-assigned variables.
- Understand Java variable assignment.
- Either does the problem on their own, or communicates well in a pair-programming session.

__Level 2 software testers:__

- Preferably working code that they can explain.
- Able to produce a working answer to an easy question in ~15 minutes with some hints/support, but not "pair programming".

__Level 3 software testers:__

- Working code that they can explain in detail.
- Strong understanding of using and manipulating existing classes.
- Ability to adapt to changes to the question. I'll usually break the question in some way after they solve it with some new requirement and see how they deal with it.

__Level 4 software testers:__

- Staff level candidates should be _either_ super star coders (all of these questions should be very easy for them), _or_ they should be strong communicators/planners who can design test cases and fully own the documentation process.
- I'm actually okay with the right L4 candidate being weaker than our L3 candidates on the coding questions, as long as they solve some other business need.

## Branches

There is a `solution` branch with examples, and a `collaboration` branch with
just the instructions and provided code. Checkout whichever is appropriate in
order to see the test questions.

### Questions

The questions (up through #5) are the same in the Python and Java directories.
I stopped adding the python questions a while ago because we never really use
them.

Level 3 (Sr. Software Test Engineer) candidates should be able to start with a
hard question. Lower levels vary based on their Java experience and how
important Java skills are to make them a good candidate.

| # | Name | Difficulty | Goal | Reasoning |
| --- | --- | --- | --- | ---- |
| 1 | Count Odd Numbers | `Very Easy` | Given an array of integers, count how many odd numbers are in the array. | Very simple `for` and `if` statements, optional method to help. |
| 2 | Check Password Validity | `Very Easy` | Given a string, determine if it is a valid password. A valid password must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit. | Simple string manipulation and conditional checks. |
| 3 | Weather Conditions | `Very Easy` | Given an integer representing the temperature in Fahrenheit, determine which range it falls into. | Just a series of if statements. |
| 4 | Palindrome Check | `Easy` | Given a string, determine if it is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. | Double loop tends to be easiest, but some candidates are thrown off track. |
| 5 | Most Frequent Letter | `Medium` | Given a string, identify the most frequent letter and the number of times it occurs. | Requires knowing Map methods, but is very easy if they know them. |
| 6 | Shopping Cart | `Medium` | Implement a simple shopping cart system where you can add items with their prices, remove items, and calculate the total cost. | Very basic OOP concepts and math operations. |
| 7 | Highest Grade | `Hard` | Given a list of student names and their corresponding grades, determine which student has the highest grade. | Two loop approach is easy, single loop approach requires some creativity. |
| 8 | Library Search System | `Hard` | Implement a simple library search system where you can search for books by title, author, or ISBN. The system should return the details of the book if found, or indicate that the book is not in the library. | Basic understanding of data structures. The wording tends to confuse candidates more than the logic. Also the question is a bit long :(. |
| 9 | Coin Flip Counter | `Hard` | Simulate flipping a coin until it shows 10 heads or 10 tails in a row. | Requires completing a helper class and creating a new instance of the class. OOP plus a while loop. |

```email
Author: Sean Fahey
seanfahey@dexcom.com
```
