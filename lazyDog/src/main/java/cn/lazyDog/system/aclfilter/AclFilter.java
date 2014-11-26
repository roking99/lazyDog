/**
 * @CopyRight LuoJin
 * @data   2014年11月26日
 */
package cn.lazyDog.system.aclfilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author LuoJin
 * @data   2014年11月26日
 *
 */
public class AclFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//TODO: 在这里完成 用户 角色 资源的 加载
	}

}
