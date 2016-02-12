/**
 * 
 */
package com.sqa.kv.util.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a helper class to add to your framework which gives information on any
 * class you create. The method signatures are below. Try to implement one at a
 * time. Create a test case for each method.
 * 
 * @author Kirill
 * 
 */
public class Info
{
	public static void displayInfo(Object obj)
	{
		System.out.println("This object is named: " + obj.getClass().getName());
		System.out.println("\tThe object is of type: " + obj.getClass().getSimpleName());
		System.out.println("\tThe number of modifiers are: " + obj.getClass().getModifiers());
		System.out.println("\tThe fields are: " + Arrays.deepToString(obj.getClass().getFields()));
		System.out.println("\tThe methods are: " + Arrays.deepToString(obj.getClass().getDeclaredMethods()));
		System.out.println("\tValue of object: " + obj.toString());
	}

	public static void displayInfo(Object obj1, Object obj2, Object... objN)
	{

	}

	public static void displayInfo(Object[] obj)
	{

	}

	public static String get2DInfo(Object[][] objects)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Display 2D Matrix\n");
		int row = objects.length;
		for (int i = 0; i < row; i++)
		{
			int col = objects[i].length;
			for (int j = 0; j < col; j++)
			{
				sb.append("\t" + objects[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// public static String get2DInfo(Object[][] objects)
	// {
	// // TODO show the objects in 2D dimension
	// return null;
	// }

	public static String[] getFieldNames(Object obj)
	{
		String[] names;
		ArrayList<String> fieldNames = new ArrayList<String>();
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields)
		{
			fieldNames.add(field.getName());
		}
		names = new String[fieldNames.size()];
		fieldNames.toArray(names);
		return names;
	}

	public static String getInfo(Object obj)
	{
		return null;
	}

	public static String[] getMethodNames(Object obj)
	{
		String[] names;
		ArrayList<String> methodNames = new ArrayList<String>();
		Method[] methods = obj.getClass().getMethods();
		for (Method method : methods)
		{
			methodNames.add(method.getName());
		}
		names = new String[methodNames.size()];
		methodNames.toArray(names);
		return names;
	}
}
