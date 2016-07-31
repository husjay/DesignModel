package com.husjay.facade;

/**
 * 门面对象
 * @author hsj
 *
 */
public class RegisterFacade {
	
	public void register() {
		工商局 a = new 工商局();
		a.checkName();
		
		质检局 b = new 质检局();
		b.orgCodeCertificate();
		
		税务局 c = new 税务局();
		c.taxCertificate();
		
		银行 d = new 银行();
		d.openAccount();
	}

}
