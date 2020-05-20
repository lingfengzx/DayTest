package littlequest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class QuestTest {

	public static void main(String[] args) {
		
		/*4位密码 前两位相同 ，后两位相同，开平方为整数
		 * for(int start=11;start<=99;start+=11) {
			
			for(int end=00;end<=99;end+=11) {
				
				double value=start*100+end;
				double sqrt=Math.sqrt(value)%1;
				if(sqrt==0) {
					System.out.println(value);
				}
				
			}
			
		}*/
		/*
		 * 找出素数
		 * 素数 不能被1和本身外的数整除
		 * 到开平方
		 * 
		 */
		/*int n=1000;
		for(int i=1;i<=n;i++) {
			boolean flag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}*/
		
		/**
		 * 去除重复字符串
		 */
		String string="askdfkdfksdfsjwerefsdfwneme";
		char[] characters=string.toCharArray();
		String aString="";
		HashMap<Character, Character> map=new HashMap<Character, Character>();
		for (char c : characters) {
			if(map.containsKey(c)) {
				
			}else {
				map.put(c, c);
				aString+=c;
			}
			
		}
		
		System.out.println(aString);
		
	}
}
