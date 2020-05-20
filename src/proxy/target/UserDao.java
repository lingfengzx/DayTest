package proxy.target;

import proxy.ProxyFactroy;

public class UserDao implements IUserDao {
	public String save() {
		System.out.println("执行保存");
		return "保存成功";
				
	}
	public static void main(String[] args) throws Exception {
		IUserDao dao=new UserDao();
		ProxyFactroy proxy=new ProxyFactroy(dao);
		IUserDao proxydao=(IUserDao) proxy.getProxyInstance();
		proxydao.save();
	}
}
