package com.deloitte.ex1;


	public class Division extends Arithmetic {

		public Division(int num1, int num2, int num3) {
			super(num1, num2, num3);
		
		}

		@Override
		void calculate(){
			num3=num1/num2;
			
		}

	}

