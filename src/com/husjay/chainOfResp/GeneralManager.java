package com.husjay.chainOfResp;

/**
 * 总经理
 * @author hsj
 *
 */
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void hanfleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 30) {
			System.out.println("员工：" + request.getEmpName() + 
					"请假：" + request.getLeaveDays() + 
					"原因：" + request.getReason());
			System.out.println("经理" + this.name + "通过");
		} else {
			System.out.println("莫非" + request.getEmpName() + 
					"想辞职，竟然请假" + request.getLeaveDays() +
					"天");
		}
	}

}
