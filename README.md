# WordleLab
AP CSA Wordle Lab

INSTRUCTIONS:

Create a GitHub Repo to store your code, submit the repository link (be sure you set it as a public repo so I can see it, or add me to your repository). You should include comments explaining your code as you go.

You can explore the game at the following website: https://www.powerlanguage.co.uk/wordle/

Step 1: Declare a final variable that represents the “Wordle of the Day”

Step 2: Create an array of characters named alphabet that represents the possible letters inside the word. This list will be initialized to the entire alphabet. All values should be uppercase to start the game.

Step 3: Prompt the user for the guess. You must tell them the number of the guess each time. This task must be done in a method that returns the guess in the form of a String. This method will accept the guess number as a parameter.

Step 4: Convert the user’s string to an array of characters. Must be done in a method that has a return type of char[] and a String parameter.

Step 5: Check to see if each character in the user’s guess (using the new array) is in the “Wordle of the Day”. Proceed as follows…

If the character is in the Wordle and it is in the same position, you should enter that character into an array called solution that represents the completed word.
If the character is in the Wordle, but NOT in the correct position, you should change the letter in the alphabet array to lowercase.
If the character is NOT in the Wordle, then you should change the letter in the alphabet array to a blank.
Step 6: Show the values of the solution array and alphabet array with the updated information and descriptive prompts. This task must be completed in array that accepts the two array parameters and prints them inside the method. Use the for each loop to print the contents.

Step 7: Repeat steps 3 through 6 until the guess matches the “Wordle of the Day” (aka, the solution array is complete with valid characters) or until they have used all six tries. This repeated process should be done using a do-while loop.

Step 8: You should print either a congratulatory message or a message telling them they are out of tries, as appropriate to the situation.
