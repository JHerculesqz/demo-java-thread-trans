package com.huawei.thread.callable;

import java.util.concurrent.Callable;

public class DataTrans {
	// #region wrap

	public static <T> Callable<T> wrap(Callable<T> oCallable) {
		Callable<T> oCallableWrap = new CallableWrap<T>("������", oCallable);
		return oCallableWrap;
	}

	// #endregion
}
