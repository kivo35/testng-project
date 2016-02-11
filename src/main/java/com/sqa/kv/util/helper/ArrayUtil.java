/**
 * 
 */
package com.sqa.kv.util.helper;

/**
 * @author Kirill
 * 
 */
public class ArrayUtil
{
	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 * 
	 * @return Boolean value based on user input
	 */
	public static String getString(String question, String... words)
	{
		while (true)
		{
			// Declare local variables
			boolean present = false;
			// Get the character using alternative method to get a char
			String input = RequestInput.getString(question);
			// iterate through supplied chars and see if it's present
			for (int i = 0; i < words.length; i++)
			{
				if (words[i].equals(input))
				{
					present = true;
				}
			}
			// if present variable is set to true and it's a valid option
			if (present == true)
			{
				// return the character
				return input;
			}
			else
			{
				// Give an error message
				System.out.println("You have not entered a valid character.");
				continue;
			}
		}
	}
}
