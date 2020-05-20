package jmx;

import java.lang.management.ManagementFactory;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
/**
 * 使用jmx协议，通过jconsole可以看到线程运行状态
 * @author zxk
 *
 */
public class HelloAgent
{
    public static void main(String[] args) throws JMException, Exception
    {
         MBeanServer server = ManagementFactory.getPlatformMBeanServer();
         ObjectName helloName = new ObjectName("jmxBean:name=hello");
         //create mbean and register mbean
         server.registerMBean(new Hello(), helloName);
         Thread.sleep(60*60*1000);
    }
}