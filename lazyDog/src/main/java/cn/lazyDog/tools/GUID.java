package cn.lazyDog.tools;

import java.util.Calendar;
import java.util.UUID;

public class GUID 
{
	private static final int LEN_FILENAME = 40;
	
	/**
	 * Generate a random GUID and remove the char "-".
	 * For example, the original UUID is:
	 * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
	 * The result is: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	 * 
	 * @return Returns a string represents a universal identifier.
	 * */
	public static String generate()
	{
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	/**
	 * The pattern of the file name is as bellow:
	 * YYYY + MM + DD + GUID (The prefix is the date of today.)
	 * For example, the following file name is correct:
	 * 20090209xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	 * 
	 * @return Returns a string that represents the file name that contains the path information.
	 * */
	public static String generateFileName()
	{
		Calendar now = Calendar.getInstance();
		String d = Integer.toString( now.get( Calendar.DATE));
		String m = Integer.toString( now.get( Calendar.MONTH) + 1);
		StringBuilder result = new StringBuilder( Integer.toString( now.get(Calendar.YEAR)));
		result.append( m.length() == 2 ? m : new StringBuilder( "0").append( m).toString());
		result.append( d.length() == 2 ? d : new StringBuilder( "0").append( d).toString());
		return result.append( generate()).toString();
	}
	
	public static String generateFileName( String ext)
	{
		return new StringBuffer( generateFileName()).append( ext).toString();
	}
		
	/**
	 * Parse the path information from a given file name. For example,
	 * file 20090209xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx should be located in
	 * 2009/02/09/20090209xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	 * 
	 * @return Please see the above example.
	 * */
	public static String getPath( String fileName)
	{
		if( fileName == null || fileName.length() < LEN_FILENAME) return "";
		String date = fileName.substring( 0, 8); //Date: e.g. 20090209
		StringBuilder result = new StringBuilder( date.substring( 0, 4));	// 2009
		result.append( "/").append( date.substring( 4, 6)).append( "/");	// 02
		return result.append( date.substring( 6, 8)).append("/").toString();// 09
	}
	
	public static String getFullPath( String fileName, String prefix)
	{
		return new StringBuilder( getPath( fileName, prefix)).append( fileName).toString();
	}
	
	/**
	 * Generate an absolute path of the file using the parameter prefix.
	 * @param prefix: The fixed part of the absolute path. (e.g. /usr/local).
	 * @see public static String getPath( String fileName) 
	 * */
	public static String getPath( String fileName, String prefix)
	{
		StringBuilder result = new StringBuilder( prefix);
		if( !prefix.endsWith( "/")) result.append( "/");
		return result.append( getPath( fileName)).toString();
	}
}