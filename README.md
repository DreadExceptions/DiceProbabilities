# DiceProbabilities
A program that calculates dice probabilities, regardless of the number of side or the number of dice.

## Functionality
The purpose of this program is to return the probabilities of certain values given a set of dice. The dice can have any number of sides greater than 1, and the set of dice can be of any size. The dice in the set can also be of any size - there are no restrictions related to the number of sides relative to other dice.
As an example, if a four-sided die (1d4) was submitted as the set of dice, then the program should return 25% for all four possible values - 1, 2, 3, and 4. 

## Testing
The program will be tested against itself. One algorithm, a 'brute force' algorithm, has already been implemented, and though unproven through rigorous mathematics, seems to be effective. All subsequent algorithms should be tested against this algorithm.
Furthermore, each results set will be tested against itself. Certain parameters such as the maximum possible probability and the maximum number of variations are easily calculatable, and these can be compared to the set of results.

## Algorithms
The 'brute force' algorithm simply calculates the number of possible variations of a given value. It does this by iterating through the set of dice, creating an array of possible values as it proceeds. A more rigorous explanation of the algorithm can be found in the "Algorithms" document.

A simpler, quicker algorithm is in the process of being developed. It relies on making a list of counts on each subsequent die, but without creating a large array and without needing excessive iteration.
