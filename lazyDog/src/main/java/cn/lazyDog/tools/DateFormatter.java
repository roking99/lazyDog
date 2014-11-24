package cn.lazyDog.tools;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateFormatter {
	private static Date date;

	// @Format
	// public String format(Object value) {
	// if (value instanceof Date) {
	// SimpleDateFormat formatter = (SimpleDateFormat) SimpleDateFormat
	// .getInstance();
	// formatter.applyPattern("yyyy-MM-dd");
	// return formatter.format(value);
	// }
	// return value == null ? "" : value.toString();
	// }

	// @Convert
	// public Object convert(String value) {
	// FacesContext context = FacesContext.getCurrentInstance();
	// DateTimeConverter converter = (DateTimeConverter) context
	// .getApplication().createConverter(
	// DateTimeConverter.CONVERTER_ID);
	// converter.setPattern("yyyy-MM-dd");
	// return converter.getAsObject(context, new UIFacelet(), value);
	// }

	public static Date string2Date(String str) {

		if (!StringTools.hasText(str))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date stringToDate(String str) {

		if (!StringTools.hasText(str))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		try {
			String s = "";
			if (str.indexOf("年") != -1) {
				String[] ss = str.split("年");
				s += ss[0] + "-";
				if (ss[1].indexOf("月") != -1) {
					String[] ms = ss[1].split("月");
					s += ms[0];
				}
				date = sdf.parse(s);
			} else {
				date = sdf.parse(str);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date string3Date(String str) {

		if (!StringTools.hasText(str))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date stringToDateYYYYMMDDHHmm(String str) {

		if (!StringTools.hasText(str))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date string2DateYMDHM(String str) {

		if (!StringTools.hasText(str))
			return null;
		if (str.indexOf(':') == -1) {
			str = str + " 00:00";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String date2String(Date date) {

		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
		return dateStr;
	}
	
	public static String date2String2(Date date) {
		
		if(date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyyMMdd").format(date);
		return dateStr;
	}

	public static String date2StringMonth(Date date) {
		String dateStr = date2String(date);
		if (dateStr != null && !"".equals(dateStr)) {
			String[] ss = dateStr.split("-");
			dateStr = ss[0] + "年" + ss[1] + "月";
		}
		return dateStr;
	}

	public static String date2MMString(Date date) {

		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("MM").format(date);
		return dateStr;
	}

	public static String dateYYYYMMString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy-MM").format(date);
		return dateStr;
	}

	public static String dateMMDDString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("MM-DD").format(date);
		return dateStr;
	}

	public static String dateMMddString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("MM-dd").format(date);
		return dateStr;
	}

	public static String dateYMString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyMM").format(date);
		return dateStr;
	}
	
	public static String dateY4MString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyyMM").format(date);
		return dateStr;
	}

	public static String date2YearString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy").format(date);
		return dateStr;
	}

	public static String date2YMDHMSString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.format(date);
		return dateStr;
	}

	public static String date2YMDHMSString2(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss")
				.format(date);
		return dateStr;
	}

	public static String date2YMDString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy年MM月dd日").format(date);
		return dateStr;
	}

	public static String date2YMDHMString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
		return dateStr;
	}

	public static String date2HMString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("HH:mm").format(date);
		return dateStr;
	}

	public static String date2DString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("d").format(date);
		return dateStr;
	}

	public static String dateYMDString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy.MM.dd").format(date);
		return dateStr;
	}

	// 根据开始时间结束时间得到显示的String
	public static String timeToString(Date beginDate, Date endDate) {
		if (beginDate == null && endDate == null)
			return "至今";
		else if (beginDate != null && endDate == null)
			return DateFormatter.date2String(beginDate) + "至今";
		else if (beginDate == null && endDate != null)
			return "至" + DateFormatter.date2String(endDate);
		else
			return DateFormatter.date2String(beginDate) + "至"
					+ DateFormatter.date2String(endDate);
	}

	public static String date3YMDHMSString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.format(date);
		return dateStr;
	}

	public static String stopLenth(Date stopTime, Date recoTime) {
		Calendar cl = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		if (stopTime != null)
			cl.setTime(stopTime);
		if (recoTime != null)
			c2.setTime(recoTime);
		long l = recoTime.getTime() - stopTime.getTime();
		long nptime = l / 1000 / 60 / 60;
		// int nptime =
		// c2.get(Calendar.DAY_OF_YEAR)-cl.get(Calendar.DAY_OF_YEAR);
		if (nptime <= 24)
			return "≤24h";
		else if (24 < nptime && nptime <= 72)
			return "24h-72h";
		else if (72 < nptime && nptime < 168)
			return "72h-168h";
		else
			return "≥168h";
	}

	/**
	 * 返回对应年月的天数
	 * 
	 * @return
	 */
	public static int dayCount(int year, int month) {
		if (1 == month || 3 == month || 5 == month || 7 == month || 8 == month
				|| 10 == month || 12 == month) {
			return 31;
		} else if (4 == month || 6 == month || 9 == month || 11 == month) {
			return 30;
		} else if (2 == month) {
			if (year % 4 == 0) {
				return 29;
			} else {
				return 28;
			}
		}
		return 0;
	}

	/**
	 * 返回对应年月的标识位 0 31天 1 28天 2 29天 3 30天
	 * 
	 * @return
	 */
	public static int dayflag(int year, int month) {
		if (1 == month || 3 == month || 5 == month || 7 == month || 8 == month
				|| 10 == month || 12 == month) {
			return 0;
		} else if (4 == month || 6 == month || 9 == month || 11 == month) {
			return 3;
		} else if (2 == month) {
			if (year % 4 == 0) {
				return 2;
			} else {
				return 1;
			}
		}
		return 0;
	}

	// public static Date endTimeSet(Date endDate) {
	// endDate.setHours(23);
	// endDate.setMinutes(59);
	// endDate.setSeconds(59);
	// return endDate;
	// }
	
	/**
	 * 取得时间字符串。（yyyy-MM-dd HH:mm:ss） Copyright © 2006 All rights reserved. Date: 2006-8-24 author:
	 * zzq (zzq98_2000@hotmail.com)
	 * 
	 * @param time
	 * @return
	 */
	public static String toDateTimeStr(Calendar cal)
	{
		return (cal == null) ? "" : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal
				.getTime());
	}

	/**
	 * 取得日时间字符串。（yyyy-MM-dd）
	 * 
	 * @param time
	 *            时间（毫秒数）
	 * @return 指定时间的日时间字符串。
	 */
	public static String toDayStr(long time)
	{
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(time));
	}

	public static String toDayStr(Calendar time)
	{
		return time == null ? "" : toDayStr(time.getTimeInMillis());
	}
	
	public static String date2YYYYMMString(Date date) {
		if (date == null)
			return "";
		String dateStr = new SimpleDateFormat("yyyy年MM月").format(date);
		return dateStr;
	}
	/**
	 * 
	 * 得到改日期所在月份是该季度的第几个月
	 * 
	 * @param date
	 * @return
	 */
	public static int getMonthInSeason(Calendar c) {

		int season = 0;

		int month = c.get(Calendar.MONTH);
		switch (month) {
		case Calendar.JANUARY:
		case Calendar.APRIL:
		case Calendar.JULY:
		case Calendar.OCTOBER:
			season = 1;
			break;
		case Calendar.FEBRUARY:
		case Calendar.MAY:
		case Calendar.AUGUST:
		case Calendar.NOVEMBER:
			season = 2;
			break;
		case Calendar.MARCH:
		case Calendar.JUNE:
		case Calendar.SEPTEMBER:
		case Calendar.DECEMBER:
			season = 3;
			break;
		default:
			break;
		}
		return season;
	}

	/**
	 * 取得月的剩余天数
	 * 
	 * @param date
	 * @return
	 */
	public static int getRemainDayOfMonth(Calendar c) {

		return c.getActualMaximum(Calendar.DAY_OF_MONTH)
				- c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 取得季度剩余天数
	 * 
	 * @param date
	 * @return
	 */
	public static int getRemainDayOfSeason(Calendar c) {
		int day = 0;

		int season = getMonthInSeason(c);
		if (season == 1) {
			Calendar c1 = c;
			c1.add(Calendar.MONTH, +1);

			Calendar c2 = c;
			c2.add(Calendar.MONTH, +2);

			day = getRemainDayOfMonth(c)
					+ c1.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ c2.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (season == 2) {
			Calendar c1 = c;
			c1.add(Calendar.MONTH, +1);

			day = getRemainDayOfMonth(c)
					+ c1.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (season == 3) {

			day = getRemainDayOfMonth(c);
		}
		return day;
	}

	/**
	 * 取得季度总天数（截止到该月）
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfSeason(Calendar c) {
		int day = 0;

		int season = getMonthInSeason(c);

		if (season == 1) {

			day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (season == 2) {
			Calendar c1 = c;
			c1.add(Calendar.MONTH, +1);

			day = c.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ c1.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (season == 3) {

			Calendar c1 = c;
			c1.add(Calendar.MONTH, +1);

			Calendar c2 = c;
			c2.add(Calendar.MONTH, +2);

			day = c.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ c1.getActualMaximum(Calendar.DAY_OF_MONTH)
					+ c2.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		return day;
	}
	
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
	
	
	
	
}
