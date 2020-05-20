package reflect;

import java.lang.reflect.Method;

import javax.xml.namespace.QName;

import com.alibaba.fastjson.JSON;

public class Children extends Parent{
	private int age;
	private String name;
	private int sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Children [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
	
	public Children(int age, String name, int sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public static void main(String[] args) throws Exception{
		System.out.println(JSON.toJSONString(null));
		System.out.println("1=int".split("=")[1]);
		Parent parent=(Parent) Class.forName("reflect.Children").newInstance();
		Method method=parent.getClass().getMethod("setAge",Integer.TYPE);
		Object obj=Integer.valueOf("1");
		Object object=method.invoke(parent,obj);
		System.out.println("{\"msg\":\""+JSON.toJSONString(object)+"\"}");
		Method method2=object.getClass().getMethod("charAt",Integer.TYPE);
		Object object2=method2.invoke(object,1);
		System.out.println(JSON.toJSONString(object2));
	}
	public Children() {
		super();
	}
	
	
}
