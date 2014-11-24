package cn.lazyDog.tools;

public class SqlLikeTools {

	/**
	 * [添加左%]
	 * 
	 * @param oldStr
	 * @return
	 */
	public static String getLeftLikeStr(String oldStr) {
		return StringTools.hasText(oldStr) ? ("%" + oldStr) : null;
	}

	/**
	 * [添加右%]
	 * 
	 * @param oldStr
	 * @return
	 */
	public static String getRightLikeStr(String oldStr) {
		return StringTools.hasText(oldStr) ? (oldStr + "%") : null;
	}

	/**
	 * [添加左右%]
	 * 
	 * @param oldStr
	 * @return
	 */
	public static String getAllLikeStr(String oldStr) {
		return StringTools.hasText(oldStr) ? ("%" + oldStr + "%") : null;
	}

	/**
	 * 删除查询设置%
	 * 
	 * @param oldStr
	 * @return
	 */
	public static String throwAllLiskStr(String oldStr) {
		return StringTools.trim(oldStr, '%');
	}

	/**
	 * 替换字符串中"空格"为%, 并且前后加%
	 * 
	 * @param oldStr
	 * @return
	 */
	public static String getAllLikeStrWithSpace(String oldStr) {

		if (StringTools.hasText(oldStr)) {
			oldStr = oldStr.replace(" ", "%");
			return getAllLikeStr(oldStr);
		} else
			return null;
	}
}
