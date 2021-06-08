package com.ocp.Day34;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {

    private static final int THRESHOULD = 3;// 門檻值
    private long [] numbers;// 數列
    private int from;// 
    private int to;

    public SumTask(long[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if (to - from <= THRESHOULD) {
            long total = 0;
            for (int i = from; i < to; i++) {
                total += numbers[i];
            }
            System.out.printf("from: %d, to: %d total: %d -> %s\n",
                    from,  to,  total, Thread.currentThread().getName());
            return total;
        }else{
            int middle = (from + to) /2;
            System.out.printf("左邊 from: %d, to: %d\n ", from, middle);
            System.out.printf("右邊 middle: %d, to: %d\n ", middle, to);
            SumTask left =new SumTask(numbers, from, middle);
            SumTask right =new SumTask(numbers, middle, to);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }
}

public class ForkJoinSum {

    public static void main(String[] args) {
        long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        ForkJoinPool pool = new ForkJoinPool(4);// 4 表示四核心
        int from = 0, to = numbers.length;
        long result = pool.invoke(new SumTask( numbers, from, to));
        System.out.println(result);
    }
}
