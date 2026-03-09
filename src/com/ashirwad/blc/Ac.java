package com.ashirwad.blc;

public class Ac 
{
		private int model;
		private String name;
		
		public Ac(int model,String name)
		{
			this.model=model;
			this.name=name;
		}
	
		public void isAc()
		{
			IO.println("My model number is"+model+"My name is"+name);
		}

		
		public String toString() {
			return "Ac [model=" + model + ", name=" + name + "]";
		}
		
		
}
