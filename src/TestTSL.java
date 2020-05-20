

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


public class TestTSL {
	Integer inte;
	
	 public Integer getInte() {
		return inte;
	}

	public void setInte(Integer inte) {
		this.inte = inte;
	}

	public static void main(String[] args) throws Exception {
		 
		 TestTSL c=new TestTSL();
		 
		 int a=c.getInte()==null?0:c.getInte();
		 System.out.println(a);
		 /*System.setProperty("https.protocols", "TLSv1,SSLv3,TLSv1.1");
		 SSLContext ctx = SSLContext.getInstance("SSLv3");
		 X509TrustManager tm = new X509TrustManager() {  
	         public void checkClientTrusted(X509Certificate[] xcs,  
	                 String string) throws CertificateException {  
	         }  
	         public void checkServerTrusted(X509Certificate[] xcs,  
	                 String string) throws CertificateException {  
	         }
	         public X509Certificate[] getAcceptedIssuers() {  
	             return null;  
	         }  
	     };
	     label46 :
	     if(ctx.getProtocol().equals("222")) {
	    	 break label46;
	     }
	    
	     ctx.init(null, new TrustManager[]{tm},null );  
	     
         
	     System.out.println("11111" + ctx.getProtocol());  
	     // 获取SSLContext实例相关的SSLEngine  
	     SSLEngine en = ctx.createSSLEngine();  
	     System.out  
	             .println("22222" + Arrays.asList(en.getSupportedProtocols()));  
	     System.out.println("33333 " + Arrays.asList(en.getEnabledProtocols()));  
	     System.out.println("44444 "  
	             + Arrays.asList(en.getSupportedCipherSuites()));  
	     System.out.println("555555 "  
	             + Arrays.asList(en.getEnabledCipherSuites()));*/
	   
	}
}
