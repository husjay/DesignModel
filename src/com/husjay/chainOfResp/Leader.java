package com.husjay.chainOfResp;

/**
 * 抽象类：领导
 * @author hsj
 *
 */
public abstract class Leader {
	
	protected String name;
	
	protected Leader nextLeader;
	
	public abstract void hanfleRequest(LeaveRequest request);

	public Leader(String name) {
		super();
		this.name = name;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
}
