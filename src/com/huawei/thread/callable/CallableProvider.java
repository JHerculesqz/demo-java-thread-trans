package com.huawei.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableProvider {
	// #region test

	public static void test() throws InterruptedException, ExecutionException {
		// 1.���Լ�����һ��oCallable
		Callable<String> oCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "�������Լ������oCallable�еĻص�,��������һ�����߳�...";
			}
		};

		// 2.��Ҫʵ��wrap�����wrap��֪�����İ��ҵ�oCallable��XXX��
		Callable<String> oCallableWrap = DataTrans.wrap(oCallable);

		// 3.exeute oCallableWrap
		Future<String> oFuture = Executors.newSingleThreadExecutor().submit(oCallableWrap);
		String strRes = oFuture.get();
		System.out.println(strRes);
		System.exit(0);
	}

	// #endregion
}
