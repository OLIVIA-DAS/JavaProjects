package com.deloitte.livingbeings;

import com.deloitte.livingbeings.mammals.Mammals;
import com.deloitte.livingbeings.organs.Eye;

public class humans extends Mammals {
	public HumanEye leftEye, rightEye;
	public humans() {
		leftEye=new HumanEye();
		rightEye=new HumanEye();
		
	}
	
	public class HumanEye extends Eye{
		
	}



}
