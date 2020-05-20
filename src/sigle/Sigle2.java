package sigle;
/**
 * 懒汉式
 * @author zxk
 *
 */
public class Sigle2 {
	//构造方法私有化
	private Sigle2() {};
	//实例
	private static Sigle2 sigle=null;
	//暴露
	public static Sigle2 getInstance() {
		if(sigle==null) {
			synchronized (Sigle2.class) {
				if(sigle==null) 
				{
					sigle=new Sigle2();
				}
			}
		}
		return sigle;
	}
}
