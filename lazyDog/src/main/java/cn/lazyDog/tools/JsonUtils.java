package cn.lazyDog.tools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JsonUtils {
	
	private Map<String, Object> map=new LinkedHashMap<String, Object>();
	
	public void add(String key,String value)
	{
		addElement(key, value);
	}
	public void add(String key,int num)
	{
		addElement(key,new Integer(num));
	}
	public void add(String key,double num)
	{
		addElement(key,new Double(num));
	}
	public void add(String key,boolean b)
	{
		addElement(key, new Boolean(b));
	}
	public void add(String key,JsonUtils json)
	{
		addElement(key, json);
	}
	
	//新增
	public void addSpecial(String key,JsonUtils json)
	{
		addElementSpecial(key, json);
	}
	//新增
	public void addValueIsOne(String key,String value)
	{
		List<String> list=new ArrayList<String>();
		list.add(value);
		map.put(key, list);
		
	}
	/**
     * 添加一个 JSON 属性，值为一个字符串，重复添加时产生数组
     * add("name", "value");

     * 添加一个字符串，产生的 JSON 如：{"name":"value"}
     * add("name", "value1");

     * add("name", "value2");

     * 添加两个同属性的字符串，产生的 JSON 如：{"name":["value1", "value2"]}
     *
     *
@param key       JSON 属性名
      * @param str       字符串格式的属性值
      */

	/**
     * 添加一个 JSON 属性，值为一个 JSON，重复添加时产生 JSON 数组

     * Json json1 = new Json();

     * json1.add("name1", "value1");

     * json1.add("name2", "value2");

     * Json json = new Json();

     * json.add("message", json1);

     * 添加一个 JSON，产生的 JSON 如：{"message":{"name1":"value1", "name2":"value2"}}

     * Json json1 = new Json();

     * json1.add("name1", "value1");

     * json1.add("name2", "value2");

     * Json json2 = new Json();

     * json2.add("name1", "value3");

     * json2.add("name2", "value4");

     * Json json = new Json();

     * json.add("message", json1);

     * json.add("message", json2);

     * 添加两个同属性的 JSON，产生的 JSON 如：{"message":[{"name1":"value1", "name2":"value2"}, {"name1":"value3", "name2":"value4"}]}

@param key       JSON 属性名
      * @param json      JSON 格式的属性值
      */

	public String toString()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("{");
		int k=0;
		for(Iterator<String> i=map.keySet().iterator();i.hasNext();)
		{
			String key=(String)(i.next());
			Object obj=map.get(key);
			if(k>0)
			{
				builder.append(",");
			}
			this.appendKey(builder, key);
			if(obj instanceof String)
			{
				this.appendString(builder, (String)obj);
			}else if(obj instanceof List)
			{
				this.appendList(builder, (List<?>)obj);
			}else if(obj instanceof JsonUtils)
			{
				this.appendJson(builder, (JsonUtils)obj);
			}else if(obj instanceof Set)
			{
				this.appendSet(builder, (Set<?>)obj);
			}
			else
			{
				this.appendOther(builder, obj);
			}
			k++;
		}
		builder.append("}");
		return builder.toString();
		
	}
	
	@SuppressWarnings("unchecked")
	private void addElement(String key,Object obj)
	{
		if(!map.containsKey(key))
		{
			if(obj instanceof JsonUtils)
			{
				List<Object> list=new ArrayList<Object>();
				list.add(obj);
				map.put(key, list);
			}else
			{
				map.put(key, obj);
			}
			return;
		}
		Object o=map.remove(key);
		if(o instanceof List)
		{
			((List<Object>) o).add(obj);
			map.put(key, o);
			return;
		}
		List<Object> list=new ArrayList<Object>();
		list.add(o);
		list.add(obj);
		map.put(key, list);
		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addElementSpecial(String key,Object obj)
	{
		if(!map.containsKey(key))
		{
			if(obj instanceof JsonUtils)
			{
				Set<Object> set=new TreeSet<Object>();
				set.add(obj);
				map.put(key, set);
			}else
			{
				map.put(key, obj);
			}
			return;
		}
		Object o=map.remove(key);
		if(o instanceof Set)
		{
			((Set) o).add(obj);
			map.put(key, o);
			return;
		}
		Set<Object> set=new TreeSet<Object>();
		set.add(o);
		set.add(obj);
		map.put(key, set);
		
	}
	private void appendKey(StringBuilder builder,String key)
	{
		builder.append("\"").append(key).append("\":");
	}
	private void appendString(StringBuilder builder,String str)
	{
		builder.append("\"").append(str).append("\"");
	}
	private void appendOther(StringBuilder builder,Object obj)
	{
		builder.append(obj);
	}
	private void appendList(StringBuilder builder,List<?> list)
	{
		
		builder.append("[");
		for(int j=0,m=list.size();j<m;j++)
		{
			if(j>0)
			{
				builder.append(",");
			}
			Object obj=list.get(j);
			if(obj instanceof String)
			{
				this.appendString(builder, (String)obj);
			}else if(obj instanceof JsonUtils)
			{
				this.appendJson(builder, (JsonUtils)obj);
			}else
			{
				this.appendOther(builder, obj);
			}
		}
		builder.append("]");
		
	}
	
	private void appendSet(StringBuilder builder,Set<?> list)
	{
		//新修改,zingChart特殊需要
		if(list!=null&&list.size()==1)
		{
			int j=0;
			for(Iterator<?> iter=list.iterator();iter.hasNext();)
			{
				if(j>0)
				{
					builder.append(",");
				}
				Object obj=iter.next();
				if(obj instanceof String)
				{
					this.appendString(builder, (String)obj);
				}else if(obj instanceof JsonUtils)
				{
					this.appendJson(builder, (JsonUtils)obj);
				}else
				{
					this.appendOther(builder, obj);
				}
				j++;
		 }
		}
		//新修改
		else
		{
		builder.append("[");
		int j=0;
		for(Iterator<?> iter=list.iterator();iter.hasNext();)
		{
			if(j>0)
			{
				builder.append(",");
			}
			Object obj=iter.next();
			if(obj instanceof String)
			{
				this.appendString(builder, (String)obj);
			}else if(obj instanceof JsonUtils)
			{
				this.appendJson(builder, (JsonUtils)obj);
			}else
			{
				this.appendOther(builder, obj);
			}
			j++;
		}
		builder.append("]");
		}
	}
	private void appendJson(StringBuilder builder,JsonUtils json)
	{
		builder.append(json.toString());
	}

}
