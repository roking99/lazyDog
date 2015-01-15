package cn.lazyDog.tools;

import java.util.List;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2010-4-8 上午11:46:13 
 * 类说明 
 */
public class Pagination {

	private int currentPage;

	private int pageSize = 10;

	private long pageCount;

	private long totalCount;

	private List<?> result;

	public Pagination()
	{

	}

	public Pagination(int curretPage, int pageSize)
	{
		this.currentPage = curretPage;
		this.pageSize = pageSize;
	}

	public Pagination(int currentPage, int pageSize, long totalCount)
	{
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
	}

	public Pagination(List<?> result)
	{
		this.result = result;
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}

	public long getPageCount()
	{
		return pageCount;
	}

	public void setPageCount(long pageCount)
	{
		this.pageCount = pageCount;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public List<?> getResult()
	{
		return result;
	}

	public void setResult(List<?> result)
	{
		this.result = result;
	}

	public long getTotalCount()
	{
		return totalCount;
	}

	public void setTotalCount(long totalCount)
	{
		this.totalCount = totalCount;
	}

	public static long getPageCount(long totalCount, int pageSize)
	{
		if (totalCount < 0 || pageSize <= 0) return 0;
		if (totalCount % pageSize == 0)
			return totalCount / pageSize;
		else
			return totalCount / pageSize + 1;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("currentPage : " + currentPage);
		sb.append("pageCount : " + pageCount);
		sb.append("pageSize : " + pageSize);
		sb.append("totalCount : " + totalCount);
		return sb.toString();
	}
}
