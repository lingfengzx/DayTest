package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*Callable<String> callable = () -> {
			System.out.println("分线程正在进行");
		    Thread.sleep(10*1000);
		    System.out.println("分线程结束");
		    return "分线程完成";
		};*/
        Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("分线程正在进行");
	            Thread.sleep(10*1000);
	            System.out.println("分线程结束");
	            return "分线程完成";
			}
        };
        
        
        FutureTask<String> futureTask=new FutureTask<>(callable);
        new Thread(futureTask).start();
        
       /* ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(callable);
        es.shutdown();*/
        System.out.println("主线程工作正在进行");
        Thread.sleep(5*1000);
        System.out.println("主线程工作结束");
       // String result = future.get();
        //System.out.println(result);
        System.out.println("futureTask"+futureTask.get());
    }
    
    public void TestRunable() {
    	Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable run ....");
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable).start();
    }
}