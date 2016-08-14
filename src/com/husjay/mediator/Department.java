package com.husjay.mediator;

/**
 * 同事类接口
 * @author hsj
 *
 */
public interface Department {
	
	//做本部门的工作
	void selfAction();
	
	//向总经理发出申请
	void outAction();

}
