package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(callable);
        es.shutdown();
        System.out.println("主线程工作正在进行");
        Thread.sleep(5*1000);
        System.out.println("主线程工作结束");
        String result = future.get();
        System.out.println(result);

    }
}