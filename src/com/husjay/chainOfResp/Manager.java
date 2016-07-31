package com.husjay.chainOfResp;

/**
 * 经理
 * @author hsj
 *
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void hanfleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 10) {
			System.out.println("员工：" + request.getEmpName() + 
					"请假：" + request.getLeaveDays() + 
					"原因：" + request.getReason());
			System.out.println("经理" + this.name + "通过");
		} else {
			if(this.nextLeader != null) {
				this.nextLeader.hanfleRequest(request);
			}
		}
	}

}
