package cn.lazyDog.tools;


import javax.servlet.http.HttpServletRequest;

public class DownLoadUtils {
	
	public static String getURLByRequestAndFileName(HttpServletRequest req,String fileName)
	{
		StringBuffer url = new StringBuffer ();
        String scheme = req.getScheme ();
        int port = req.getServerPort ();
        String urlPath = req.getRequestURI();
        url.append (scheme);        // http, https
        url.append ("://");
        url.append (req.getServerName ());
        if ((scheme.equals ("http") && port != 80)
            || (scheme.equals ("https") && port != 443)) {
            url.append (':');
            url.append (req.getServerPort ());
        }
        int index=urlPath.indexOf("/",1);
        url.append(urlPath.substring(0, index));
        url.append("/");
        url.append(fileName);
        return url.toString();
	}

}
