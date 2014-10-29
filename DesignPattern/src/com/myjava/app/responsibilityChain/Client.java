package com.myjava.app.responsibilityChain;

public class Client {
	public static void main(String[] args){
		Handler p = new ProjectManager();
		Handler d = new DeptManager();
		Handler g = new GeneralManager();
		
		p.setSuccessor(d);
		d.setSuccessor(g);
		
		//开测
		String reply_001 = p.handleFeeRequest("LeeFeng", 300);
		System.out.println(reply_001);
		
		String reply_002 = p.handleFeeRequest("LeeFen", 300);
		System.out.println(reply_002);
		
		String reply_003 = p.handleFeeRequest("LeeFeng", 700);
		System.out.println(reply_003);
		String reply_004 = p.handleFeeRequest("LeeFen", 700);
		System.out.println(reply_004);
		
		String reply_005 = p.handleFeeRequest("LeeFeng", 2000);
		System.out.println(reply_005);
		String reply_006 = p.handleFeeRequest("LeeFen", 2000);
		System.out.println(reply_006);
		
		
	}
}
