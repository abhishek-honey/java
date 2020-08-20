package com.feature.description;

public class Feature {
	public static void main(String[] args) {
		var tree = """
				
				<java.util.concurrent>
				.
				├── AbstractExecutorService.java
				├── ArrayBlockingQueue.java
				├── BlockingDeque.java
				├── BlockingQueue.java
				├── BrokenBarrierException.java
				├── Callable.java
				├── CancellationException.java
				├── CompletableFuture.java
				├── CompletionException.java
				├── CompletionService.java
				├── CompletionStage.java
				├── ConcurrentHashMap.java
				├── ConcurrentLinkedDeque.java
				├── ConcurrentLinkedQueue.java
				├── ConcurrentMap.java
				├── ConcurrentNavigableMap.java
				├── ConcurrentSkipListMap.java
				├── ConcurrentSkipListSet.java
				├── CopyOnWriteArrayList.java
				├── CopyOnWriteArraySet.java
				├── CountDownLatch.java
				├── CountedCompleter.java
				├── CyclicBarrier.java
				├── DelayQueue.java
				├── Delayed.java
				├── Exchanger.java
				├── ExecutionException.java
				├── Executor.java
				├── ExecutorCompletionService.java
				├── ExecutorService.java
				├── Executors.java
				├── ForkJoinPool.java
				├── ForkJoinTask.java
				├── ForkJoinWorkerThread.java
				├── Future.java
				├── FutureTask.java
				├── LinkedBlockingDeque.java
				├── LinkedBlockingQueue.java
				├── LinkedTransferQueue.java
				├── Phaser.java
				├── PriorityBlockingQueue.java
				├── RecursiveAction.java
				├── RecursiveTask.java
				├── RejectedExecutionException.java
				├── RejectedExecutionHandler.java
				├── RunnableFuture.java
				├── RunnableScheduledFuture.java
				├── ScheduledExecutorService.java
				├── ScheduledFuture.java
				├── ScheduledThreadPoolExecutor.java
				├── Semaphore.java
				├── SynchronousQueue.java
				├── ThreadFactory.java
				├── ThreadLocalRandom.java
				├── ThreadPoolExecutor.java
				├── TimeUnit.java
				├── TimeoutException.java
				├── TransferQueue.java
				├── atomic
				│   ├── AtomicBoolean.java
				│   ├── AtomicInteger.java
				│   ├── AtomicIntegerArray.java
				│   ├── AtomicIntegerFieldUpdater.java
				│   ├── AtomicLong.java
				│   ├── AtomicLongArray.java
				│   ├── AtomicLongFieldUpdater.java
				│   ├── AtomicMarkableReference.java
				│   ├── AtomicReference.java
				│   ├── AtomicReferenceArray.java
				│   ├── AtomicReferenceFieldUpdater.java
				│   ├── AtomicStampedReference.java
				│   ├── DoubleAccumulator.java
				│   ├── DoubleAdder.java
				│   ├── LongAccumulator.java
				│   ├── LongAdder.java
				│   ├── Striped64.java
				│   └── package-info.java
				├── locks
				│   ├── AbstractOwnableSynchronizer.java
				│   ├── AbstractQueuedLongSynchronizer.java
				│   ├── AbstractQueuedSynchronizer.java
				│   ├── Condition.java
				│   ├── Lock.java
				│   ├── LockSupport.java
				│   ├── ReadWriteLock.java
				│   ├── ReentrantLock.java
				│   ├── ReentrantReadWriteLock.java
				│   ├── StampedLock.java
				│   └── package-info.java
				└── package-info.java

				2 directories, 88 files
								""";

		System.out.println(tree);
	}

}
