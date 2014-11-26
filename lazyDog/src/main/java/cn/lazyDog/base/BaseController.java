package cn.lazyDog.base;

import java.io.IOException;
/**
 * 
 */
import javax.servlet.http.HttpServletResponse;

public class BaseController{
	/**
	 * 
	 * @author LuoJin
	 * @data   2014年11月26日
	 *
	 * @param message
	 * @param response
	 * @throws IOException
	 */
	protected void writeSuccess2Browers(String message,
			HttpServletResponse response) throws IOException {
		String text = "{\"result\":\"success\",\"message\":\"" + message
				+ "\"}";
		response.setHeader("ContentType", "text/json");
		response.setHeader("Content-Type", "text/html;charset=urf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(text);
		response.getWriter().close();
	}

	protected void writeSuccess2BrowersTest(String message,
			HttpServletResponse response) throws IOException {
		String text = "{\"result\":\"success\",\"message\":" + message
				+ "}";
		response.setHeader("ContentType", "text/json");
		response.setHeader("Content-Type", "text/html;charset=urf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(text);
	}

	protected void writeError2Browers(String message,
			HttpServletResponse response) throws IOException {
		String text = "{\"result\":\"error\",\"message\":\"" + message + "\"}";
		response.setHeader("ContentType", "text/json");
		response.setHeader("Content-Type", "text/html;charset=urf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(text);
		response.getWriter().close();
	}
}
