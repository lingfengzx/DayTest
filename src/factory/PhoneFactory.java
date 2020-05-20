package factory;

/**
 * 简单工厂模式
 * @author zxk
 *
 */
public class PhoneFactory {
	public static Phone getPhone(String name) {
		Phone phone=null;
		try {
			phone=(Phone) Class.forName(name).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phone;
	}
	public static void main(String[] args) {
		Phone phone=getPhone("factory.APPhone");
		phone.create();
	}
}
