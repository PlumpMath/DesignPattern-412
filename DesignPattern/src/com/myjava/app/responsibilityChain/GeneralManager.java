package com.myjava.app.responsibilityChain;

public class GeneralManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String reply = "";
		if(fee >= 1000){
			if("LeeFeng".equals(user)){
				reply = "成功. General经理同意 ["+user+"] 的聚餐费用，金额:"+fee+" 元;";
			}else{
				reply = "不成功. General经理不同意 ["+user+"] 的聚餐费用，金额:"+fee+" 元;";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return reply;
	}

}
