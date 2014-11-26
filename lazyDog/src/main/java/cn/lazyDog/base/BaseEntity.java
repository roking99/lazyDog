/**
 * @CopyRight LuoJin
 * @data   2014年11月26日
 */
package cn.lazyDog.base;

/**
 * @author LuoJin
 * @data   2014年11月26日
 * hashCode和equals 用来去重
 * 
 * mybatis如何使用baseEntity 和basedao 还需要想下
 */
public abstract class BaseEntity {
	public abstract String toString();
	
	protected boolean equals(String child, String other)
	{
		return objEquals(child, other);
	}

	protected int hashCode(String id)
	{
		return objHashCode(id);
	}
	
	protected boolean equals(Integer child, Integer other)
	{
		return objEquals(child, other);
	}

	protected int hashCode(Integer id)
	{
		return objHashCode(id);
	}
	
	protected boolean objEquals(Object child, Object other)
	{
		if (child == other)
			return true;
		if (child == null || other == null)
			return false;
		return child.equals(other);
	}

	protected int objHashCode(Object id)
	{
		if (id == null)
			return super.hashCode();
		return id.hashCode();
	}

}
