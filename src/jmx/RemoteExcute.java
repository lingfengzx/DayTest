package jmx;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class RemoteExcute {
	
	private String username = null;  
    private String password = null;  
	 //sign 参数类型的说明  
    public Object invokeMBeanMethod(String url,String objectname,String operName,Object[] params,String[] signs) throws Exception{  
        JMXConnector connector = null;  
        try {  
            JMXServiceURL serviceURL = new JMXServiceURL(url);  
            if(username == null || username.length()==0){  
                //不需要权限认证的连接器  
                connector = JMXConnectorFactory.connect(serviceURL);  
            }else{  
                /*Map<String,Object> environment = new HashMap<String,Object>();     
                environment.put(JMXConnector.CREDENTIALS, new String[] {username,password});   
                connector = JMXConnectorFactory.connect(serviceURL,environment);  */
            }  
            //得到MBean服务连接  
            MBeanServerConnection connection =connector.getMBeanServerConnection();  
            //调用JMX功能方法,得到返回值  
            Object pdsId = connection.invoke(new ObjectName(objectname), operName, new String[]{null}, new String[] {"java.lang.String"});  
            String objName = objectname+"["+pdsId+"]";  
            Object res = connection.invoke(new ObjectName(objName), operName, params, signs);  
            return res;  
        } finally{  
            if(connector!=null)  
                connector.close();  
        }  
    }  
      
    public static void main(String[] args)throws Exception {  
        String url      = "service:jmx:rmi:///jndi/rmi://localhost"; 
        String objectname="jmxBean:name=hello";
        String operName = "helloWorld";  
        //String operName = "allIdentityTokens";  
        Object[] params = null;  
        String[] signs  = null;  
          
        RemoteExcute jmxService = new RemoteExcute();  
        Object res = jmxService.invokeMBeanMethod(url,objectname,operName, params, signs);  
        System.out.println(res);  
    }  
}
