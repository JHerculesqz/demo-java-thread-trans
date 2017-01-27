package com.huawei;

import java.util.concurrent.ExecutionException;

import com.huawei.thread.callable.CallableProvider;

public class ThreadTest {
	// #region main

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableProvider.test();
	}

	// #endregion
}
