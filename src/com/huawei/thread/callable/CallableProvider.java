package com.huawei.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableProvider {
	// #region test

	public static void test() throws InterruptedException, ExecutionException {
		// 1.我自己定义一个oCallable
		Callable<String> oCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "我是我自己定义的oCallable中的回调,我在另外一个子线程...";
			}
		};

		// 2.你要实现wrap，这个wrap神不知鬼不觉的把我的oCallable给XXX了
		Callable<String> oCallableWrap = DataTrans.wrap(oCallable);

		// 3.exeute oCallableWrap
		Future<String> oFuture = Executors.newSingleThreadExecutor().submit(oCallableWrap);
		String strRes = oFuture.get();
		System.out.println(strRes);
		System.exit(0);
	}

	// #endregion
}
