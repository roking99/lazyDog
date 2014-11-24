package cn.lazyDog.tools;


import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

public abstract class StringTools extends StringUtils {
	protected static Log logger = LogFactory.getLog(StringTools.class);

	/**
	 * 字符编码变换，ISO8859-1-->UTF-8
	 * 
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String iso2UTF8(String str)
			throws UnsupportedEncodingException {
		if (hasText(str))
			return new String(str.getBytes("ISO8859-1"), "UTF-8");
		return "";
	}

	public static String gbk2ISO(String str)
			throws UnsupportedEncodingException {
		if (hasText(str))
			return new String(str.getBytes("GBK"), "ISO8859-1");
		return "";
	}

	/**
	 * 将字符串转换为int
	 * 
	 * @param str
	 *            字符串
	 * @param defaultValue
	 *            转换失败返回的默认值
	 * @return 转换成功返回指定值，失败返回默认值
	 */
	public static int str2Int(String str, int defaultValue) {
		try {
			return (hasText(str)) ? Integer.parseInt(str.trim()) : defaultValue;
		} catch (Exception e) {
			return defaultValue;
		}
	}

	/**
	 * 将字符串转换为long
	 * 
	 * @param str
	 *            字符串
	 * @param defaultValue
	 *            转换失败返回的默认值
	 * @return 转换成功返回指定值，失败返回默认值
	 */
	public static long str2Long(String str, long defaultValue) {
		try {
			return (hasText(str)) ? Long.parseLong(str.trim()) : defaultValue;
		} catch (Exception e) {
			return defaultValue;
		}
	}

	/**
	 * 将字符串转换为float
	 * 
	 * @param str
	 *            字符串
	 * @param defaultValue
	 *            转换失败返回的默认值
	 * @return 转换成功返回指定值，失败返回默认值
	 */
	public static float str2Float(String str, float defaultValue) {
		try {
			return (hasText(str)) ? Float.parseFloat(str.trim()) : defaultValue;
		} catch (Exception e) {
			return defaultValue;
		}
	}

	/**
	 * 将字符串转换为double
	 * 
	 * @param str
	 *            字符串
	 * @param defaultValue
	 *            转换失败返回的默认值
	 * @return 转换成功返回指定值，失败返回默认值
	 */
	public static double str2Double(String str, double defaultValue) {
		try {
			return (hasText(str)) ? Double.parseDouble(str.trim())
					: defaultValue;
		} catch (Exception e) {
			return defaultValue;
		}
	}

	public static boolean contains(String[] strs, String search) {
		if (strs == null || strs.length <= 0)
			return false;
		for (String str : strs) {
			if (str.equals(search))
				return true;
		}
		return false;
	}

	public static String float2Str(Float f) {
		return (f == null) ? "" : f.toString();
	}

	public static String integer2Str(Integer i) {
		return (i == null) ? "" : i.toString();
	}

	public static String getFileNameByPath(String filePath) {
		if (!StringTools.hasText(filePath))
			return filePath;
		return filePath.substring(filePath.lastIndexOf("/") + 1,
				filePath.length());
	}

	/**
	 * 去除前后的指定字符
	 * 
	 * @param str
	 * @param c
	 * @return
	 */
	public static String trim(String str, char c) {
		String trimLeading = trimLeadingCharacter(str, c);
		return trimTrailingCharacter(trimLeading, c);
	}

	public static String formatString(String str, int size, char c) {
		if (str.length() >= size)
			return str;
		String result;
		char[] imp = new char[size - str.length()];
		for (int i = 0; i < imp.length; i++)
			imp[i] = c;
		result = new String(imp);
		result += str;
		return result;
	}

	public static String formatNumberString(String source, int size, char x) {
		if (source.length() >= size) {
			return source;
		} else {
			return formatString(String.valueOf(x) + source, size, x);
		}
	}

	/**
	 * 将字符串转换为double
	 * 
	 * @param str
	 *            字符串
	 * 
	 * @param multiplier
	 *            乘数
	 * @return 转换成功返回指定值乘以multiplier，失败返回空
	 */
	public static Double string2Double(String str, double multiplier) {
		try {
			return (hasText(str)) ? Double.parseDouble(str.trim()) * multiplier
					: null;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 将字符串转换为double
	 * 
	 * @param str
	 *            字符串
	 * @return 转换成功返回指定值，失败返回空
	 */
	public static Double str2Double(String str) {
		try {

			return (hasText(str)) ? Double.parseDouble(str.trim()) : null;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 将逻辑表达式的字符串转换为表达式并计算值，当传入空字符串或者空valueMap时，返回null
	 * 
	 * @param str
	 * @param valueMap
	 * @return
	 */
	public static Object getValueOfString(String str,
			Map<String, Object> valueMap) {
		if (!StringTools.hasText(str) || valueMap == null) {
			return null;
		}
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		for (String key : valueMap.keySet()) {
			if (str.indexOf(key) >= 0) {
				engine.put(key, valueMap.get(key));
			}
		}
		Object result = null;
		try {
			Compilable compilable = (Compilable)engine;
			CompiledScript comScript = compilable.compile(str);
			result = comScript.eval();
			//result = engine.eval(str);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static boolean isChinese(String strName) {
		char[] ch = strName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
			if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
					|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
					|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
					|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
					|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
					|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
				return true;
			}
		}
		return false;
	}

	// public static String addLike(String source)
	// {
	// return StringTools.hasText(source)?Finals.LIKE+source+Finals.LIKE:source;
	// }
}
