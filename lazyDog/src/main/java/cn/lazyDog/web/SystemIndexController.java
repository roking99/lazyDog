package cn.lazyDog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author LuoJin
 * @data   2014年11月26日
 *
 */
@Controller
@RequestMapping("/systemIndex")
public class SystemIndexController {
	@RequestMapping(value="toIndex.do",method = RequestMethod.GET)
	public String toIndex(){
		return "index";
	}
}
