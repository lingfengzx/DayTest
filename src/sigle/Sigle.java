package sigle;
/**
 * 饿汉式
 * @author zxk
 *
 */
public class Sigle {

	//构造方法私有化
	private Sigle() {};
	//实例
	private static Sigle sigle=new Sigle();
	//暴露
	public static Sigle getInstance() {
		return sigle;
	}
	
}
