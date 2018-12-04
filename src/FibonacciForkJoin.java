import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class FibonacciForkJoin extends RecursiveTask<Integer> {
    int value;
    int sum;
    public FibonacciForkJoin(int value){
        this.value=value;
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        FibonacciForkJoin fib15 = new FibonacciForkJoin(15);
        Future<Integer> result = forkJoinPool.submit(fib15);

        while ( !result.isDone() ) { Thread.sleep(100); }

        System.out.println( result.get() );
    }

    @Override
    protected Integer compute() {
        if(value<=1) return value;
        FibonacciForkJoin f1 = new FibonacciForkJoin(value-1);
        f1.fork();
        FibonacciForkJoin f2 = new FibonacciForkJoin(value-2);
        f2.fork();
        return f1.join() + f2.join();
    }

}
