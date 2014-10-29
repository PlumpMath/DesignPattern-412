package com.myjava.app.responsibilityChain;

public abstract class Handler {
	/**
	 * 持有下一个Handler对象
	 */
	protected Handler successor = null;
	/**
	 * 取值方法
	 */
	public Handler getSuccessor() {
		return successor;
	}
	/**
	 * 设值方法
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	/**
	 * 处理聚餐费用申请
	 */
	public abstract String handleFeeRequest(String user,double fee);
}

/**
   http://wenku.baidu.com/view/7b27a51b59eef8c75fbfb349.html
 */