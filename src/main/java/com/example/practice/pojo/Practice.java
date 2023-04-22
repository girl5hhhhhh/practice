package com.example.practice.pojo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: 线程池
 * @author: chunyan.li
 * @time: 2023/3/3 11:11
 */
public class Practice {
    /**
     * 创建线程池
     * */
    private static final ThreadPoolExecutor EXECUTOR1 = new ThreadPoolExecutor(7, 7,
            0L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>(10));

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("cpu核心数为："+ Runtime.getRuntime().availableProcessors());
        int num = Runtime.getRuntime().availableProcessors();

        /*// 创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(num);
        while(true) {
            threadPool.execute(new Runnable() { // 提交多个线程任务，并执行
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running ..");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }*/

        /*FutureTask futureTask1 = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+"---------1------");
                return Thread.currentThread().getName()+"---------2------";
            }
        });
        new Thread(futureTask1).start();
        String str = (String) futureTask1.get();
        System.out.println(str);*/

        /*int num2 = 3;
        ArrayList<String> arrayList = Lists.newArrayList("a", "b", "c", "d", "e", "f", "g");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(num, num, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        //executor.allowCoreThreadTimeOut(true);
        List<String> resultList = new ArrayList<>();
        List<List<String>> partition = Lists.partition(arrayList, arrayList.size() / num2 + 1);
        for (int i = 0; i < partition.size(); i++) {
            Future future = executor.submit(new Callable(){
                @Override
                public List call() {
                    System.out.println(String.format("当前线程:%s",Thread.currentThread().getName()));
                    return Arrays.asList("1");
                }
            });
            resultList.addAll((List)future.get());
        }*/
        //executor.shutdown();

        /*partition.forEach(item -> {
            Future future = executor.submit(new Callable() {
                @Override
                public List call() {
                    System.out.println(String.format("当前线程:%s,执行任务值:%s", Thread.currentThread().getName(), item));
                    return Arrays.asList("1");
                }
            });
            try {
                resultList.addAll((List)future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });*/

        /*AtomicInteger atomicInteger = new AtomicInteger();
        if(atomicInteger.incrementAndGet() > 1000){
            return;
        }*/

    }
}
