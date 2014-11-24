package cn.lazyDog.tools;


public class IdGenerator 
{
	public static final int OBJ_Z = 1;	//ZONE
	public static final int OBJ_P = 2;	//PROJECT COMPANY
	public static final int OBJ_WF = 3; //WIND FARM
	public static final int OBJ_WT = 4;	//WIND TURBINE
	public static final int OBJ_Y = 5;	// sYstem
	public static final int OBJ_D = 6;	//DEVICE
	public static final int OBJ_U = 7;	//UNIT
	public static final int OBJ_S = 8;	//SUBSTATION
	public static final int OBJ_T = 9;	//TRANSFORMER
	public static final int OBJ_E = 10;	//EMPLOYEE
	public static final int OBJ_L = 11;	//LINE
	public static final int OBJ_WTS = 13;	//WIND TURBINE SYSTEM
	public static final int OBJ_ES=12; //设备升压站
	//public static final int OBJ_
	
	public static String generate(String prefix, int current, int length)
	{
		StringBuilder result = new StringBuilder( prefix);
		int padding = length - Integer.toString( current).length();
		for( int i = 0; i < padding; i++) result.append( "0");
		return result.append( current).toString();
	}
	
	public static String generate( String connector, String prefix, String postfix)
	{
		return new StringBuilder( prefix).append( connector).append( postfix).toString();
	}
	
}

