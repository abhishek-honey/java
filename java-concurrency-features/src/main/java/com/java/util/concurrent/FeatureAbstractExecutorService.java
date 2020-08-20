package com.java.util.concurrent;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public class FeatureAbstractExecutorService extends AbstractExecutorService {

	public static void main(String[] args) {
//		Class AbstractExecutorService
//		java.lang.Object
//		java.util.concurrent.AbstractExecutorService
//		All Implemented Interfaces:
//		Executor, ExecutorService
//		Direct Known Subclasses:
//		ForkJoinPool, ThreadPoolExecutor
//		public abstract class AbstractExecutorService
//		extends Object
//		implements ExecutorService
//		Provides default implementations of ExecutorService execution methods. This class implements the submit, invokeAny and invokeAll methods using a RunnableFuture returned by newTaskFor, which defaults to the FutureTask class provided in this package. For example, the implementation of submit(Runnable) creates an associated RunnableFuture that is executed and returned. Subclasses may override the newTaskFor methods to return RunnableFuture implementations other than FutureTask.
//		Extension example. Here is a sketch of a class that customizes ThreadPoolExecutor to use a CustomTask class instead of the default FutureTask:
//
//		 
//		 public class CustomThreadPoolExecutor extends ThreadPoolExecutor {
//
//		   static class CustomTask<V> implements RunnableFuture<V> {...}
//
//		   protected <V> RunnableFuture<V> newTaskFor(Callable<V> c) {
//		       return new CustomTask<V>(c);
//		   }
//		   protected <V> RunnableFuture<V> newTaskFor(Runnable r, V v) {
//		       return new CustomTask<V>(r, v);
//		   }
//		   // ... add constructors, etc.
//		 }
//		Since:
//		1.5
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Runnable> shutdownNow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isShutdown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTerminated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub

	}
}
