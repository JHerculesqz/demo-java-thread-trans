package com.huawei.thread.callable;

import java.util.concurrent.Callable;

public class CallableWrap<T> implements Callable<T> {
	// #region Fields

	private String sxl;
	private Callable<T> callable;

	// #endregion

	// #region Construction

	public CallableWrap(String strSXL, Callable<T> oCallable) {
		this.sxl = strSXL;
		this.callable = oCallable;
	}

	// #endregion

	// #region call

	public T call() throws Exception {
		System.out.println("我是神不知鬼不觉的" + this.sxl);
		return this.callable.call();
	}

	// #endregion
}
