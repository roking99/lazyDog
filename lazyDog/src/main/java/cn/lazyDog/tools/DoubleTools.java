package cn.lazyDog.tools;


import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.springframework.util.StringUtils;

public class DoubleTools {
	public static Double doubleToDouble(double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.00#");
			((DecimalFormat) form).setMaximumFractionDigits(2);
		}
		String value = form.format(num);
		return Double.parseDouble(value);
	}
	
	public static Double formatNumberDecimal4(Double num)
	{
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.0000#");
			((DecimalFormat) form).setMaximumFractionDigits(4);
		}
		if(num == null)
			return null;
		//DecimalFormat numFormat = new DecimalFormat("###.####");
		String numStr = form.format(num);
		return Double.parseDouble(numStr);
	}
	
	public static Double doubleToDouble3(Double num) {
		if(num == null)
			return null;
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.000#");
			((DecimalFormat) form).setMaximumFractionDigits(3);
		}
		String value = form.format(num);
		return Double.parseDouble(value);
	}
	
	/**确保不用科学计数法显示数值
	 * @param num
	 * @return
	 */
	public static String NumberFormatDecimal(Double num){
		if(num == null)
			return null;
		NumberFormat nf=NumberFormat.getInstance();
		if (nf instanceof DecimalFormat) {
			((DecimalFormat) nf).applyPattern("#0.00#");
			((DecimalFormat) nf).setMaximumFractionDigits(2);
		}
		nf.setGroupingUsed(false);
		return nf.format(num);
	}
	
	public static String NumberFormatDecimal4(Double num){
		if(num == null)
			return null;
		NumberFormat nf=NumberFormat.getInstance();
		if (nf instanceof DecimalFormat) {
			((DecimalFormat) nf).applyPattern("#0.0000#");
			((DecimalFormat) nf).setMaximumFractionDigits(4);
		}
		nf.setGroupingUsed(false);
		return nf.format(num);
	}
	
	public static Double formatNumberDecimal4(Double num, Double divisor)
	{
		if(num == null)
			return null;
		DecimalFormat numFormat = new DecimalFormat("###.####");
		String numStr = numFormat.format(num/divisor);
		return Double.parseDouble(numStr);
	}
	
	public static Double getTotal(Double num1, Double num2, Double num3, Double divisor)
	{
		Double total = 0d;
		if(num1 != null)
			total += num1;
		if(num2 != null)
			total += num2;
		if(num3 != null)
			total += num3;
		return formatNumberDecimal4(total, divisor);
	}
	
	public static Long getTotal(Long num1, Long num2, Long num3)
	{
		Long total = 0l;
		if(num1 != null)
			total += num1;
		if(num2 != null)
			total += num2;
		if(num3 != null)
			total += num3;
		return total;
	}
	
	public static String  doubleToString(double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.00#");
			((DecimalFormat) form).setMaximumFractionDigits(2);
		}
		String value = form.format(num);
		return value;
	}
	
	public static String  LongToString(double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).setMaximumFractionDigits(0);
			
		}
		String value = form.format(num);
		return value;
	}
	
	//判断是否为整型数字
    public static boolean isNum(String s) {
      for (int index = 0; index < s.length(); index++) {
        if (48 > (int) s.charAt(index) || (int) s.charAt(index) > 57) {
            return false;
        }
      }
        return true;
    }
    
    /**判断是否是整数或小数
	 * @param coordinate
	 * @return
	 */
	public static boolean isDigiter(String coordinate){
		if(coordinate.indexOf(".")==-1){
			if(!DoubleTools.isNum(coordinate)){
				return false;
			} 
		} else {
			String s1=coordinate.substring(0,coordinate.indexOf("."));
			String s2=coordinate.substring(coordinate.indexOf(".")+1, coordinate.length());
			if(!DoubleTools.isNum(s1)) return false;
			if(!DoubleTools.isNum(s2)) return false;
		}
		return true;
	}
	
	/**保留3位小数
	 * @param d
	 * @return
	 */
	public static double convertMath(double d){
		long c=Math.round(d*1000);
		double dd=c;
		return dd/1000;
	}
	
	/**转换%的值
	 * @param str
	 * @return
	 */
	public static double convertRate(String str){
		if(str.indexOf("%")!=-1){
			str=str.substring(0,str.length()-1);
		}
		double d=StringTools.str2Double(str,0.00)/100;
		return d;
	}
	
	public static Double doubleToDoubleOne(double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.0#");
			((DecimalFormat) form).setMaximumFractionDigits(1);
		}
		String value = form.format(num);
		return Double.parseDouble(value);
	}
	
	public static Double formatNumberDecimalMax4(Double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.0000#");
			((DecimalFormat) form).setMaximumFractionDigits(4);
		}
		if (num == null)
			return null;
		String numStr = String.valueOf(num);
		if (numStr.indexOf(".") != -1) {
			String[] strs = numStr.split("\\.");
			if (strs[1].length() > 6) {
				numStr = form.format(num);
				return Double.parseDouble(numStr);
			}
		}
		return num;
	}
	
	public static Double formatNumberDecimalMax3(Double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.000#");
			((DecimalFormat) form).setMaximumFractionDigits(3);
		}
		if (num == null)
			return null;
		String numStr = String.valueOf(num);
		if (numStr.indexOf(".") != -1) {
			String[] strs = numStr.split("\\.");
			if (strs[1].length() > 3) {
				numStr = form.format(num);
				return Double.parseDouble(numStr);
			}
		}
		return num;
	}
	
	public static Double formatNumberDecimalMaxFour(Double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.0000#");
			((DecimalFormat) form).setMaximumFractionDigits(4);
		}
		if (num == null)
			return null;
		String numStr = String.valueOf(num);
		if (numStr.indexOf(".") != -1) {
			String[] strs = numStr.split("\\.");
			if (strs[1].length() > 4) {
				numStr = form.format(num);
				return Double.parseDouble(numStr);
			}
		}
		return num;
	}
	
	public static String  doubleToString3(double num) {
		NumberFormat form = NumberFormat.getInstance();
		if (form instanceof DecimalFormat) {
			((DecimalFormat) form).applyPattern("#0.000#");
			((DecimalFormat) form).setMaximumFractionDigits(3);
		}
		String value = form.format(num);
		return value;
	}
	
	/**
	 * 除法
	 * 
	 * @param dividend
	 *            被除数，为空返回空
	 * @param divisor
	 *            除数，为0则不进行除法
	 * @return
	 */
	public static Double divisionNum(Double dividend, double divisor) {

		if (dividend != null && divisor != 0) {
			return dividend / divisor;
		}
		return dividend;
	}
	
	/**
	 * 判断是否是数字,传入空时返回true
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isNumber(String number) {

		if (number == null || number.trim().length() <= 0)
			return true;
		try {
			Double.parseDouble(number);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isInt(String number) {
		if (!StringUtils.hasText(number))
			return true;
		return number.matches("^\\d+$");
	}
	
	
	
}
