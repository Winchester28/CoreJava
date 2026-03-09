package com.ashirwad.blc;

public class dog_elc {
	void main() 
	{
	Dog_blc sheru = new Dog_blc();
	sheru.color = "orange";
	sheru.height = 3.5;
	sheru.name = "sheru";
	sheru.breed = "Golden Retriever";
	
	sheru.bark();
	sheru.getDogInformation();
	
	IO.println("---------------------------------------------");
	
	Dog_blc shivani = new Dog_blc();
	shivani.color="Black";
	shivani.height=1.9;
	shivani.name="shivani";
	shivani.breed="shitzu";
	shivani.bark();
	shivani.getDogInformation();
	
	
	}
}
