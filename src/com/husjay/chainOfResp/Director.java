package com.husjay.chainOfResp;

/**
 * 主任
 * @author hsj
 *
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void hanfleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 3) {
			System.out.println("员工：" + request.getEmpName() + 
					"请假：" + request.getLeaveDays() + 
					"原因：" + request.getReason());
			System.out.println("主任" + this.name + "通过");
		} else {
			if(this.nextLeader != null) {
				this.nextLeader.hanfleRequest(request);
			}
		}
	}

}
