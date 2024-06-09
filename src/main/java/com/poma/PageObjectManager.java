package com.poma;

import com.Baseclass.Base;
import com.pom.DeletePage;
import com.pom.LoginPage;
import com.pom.RegisterationPage;
import com.pom.VitalsPage;

public class PageObjectManager extends Base {
	
	public LoginPage lp;
	
	public LoginPage getLp() {
		if(lp == null) {
			lp= new LoginPage (driver);
		}
			return lp;
			
		}
	
	
public RegisterationPage rp;

public RegisterationPage getRp() {
	if(rp == null) {
		rp= new RegisterationPage (driver);
	}
	return rp;
	
}

public VitalsPage vp;

public VitalsPage getVp() {
	if(vp == null) {
		vp= new VitalsPage (driver);
	}
	return vp;
}
	
	public DeletePage dp;
	public DeletePage getDp() {
		if(dp == null) {
			dp= new DeletePage (driver);
		}
		return dp;
	
	
}

}
