//package com.Java;

	public class Dog extends Pet
	{
	//Attributes of Dog class
	private int dogSpaceNbr;
	private float dogWeight;
	private boolean grooming;

	public Dog(String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue,
	int dogSpaceNbr,float dogWeight, boolean grooming) {
	//Calling super class Pet constructor
	super(petName, petAge, dogSpace, catSpace, daysStay, amountDue);

	/*set values to this class variables*/

	this.dogSpaceNbr=dogSpaceNbr;
	this.dogWeight=dogWeight;
	this.grooming=grooming;

	}

	//* return the dogSpaceNbr

	public int getDogSpaceNbr()
	{
	return dogSpaceNbr;
	}

	//* dogSpaceNbr the dogSpaceNbr to set

	public void setDogSpaceNbr(int dogSpaceNbr)
	{
	this.dogSpaceNbr = dogSpaceNbr;
	}

	// * return the dogWeight

	public float getDogWeight()
	{
	return dogWeight;
	}

	// * dogWeight the dogWeight to set

	public void setDogWeight(float dogWeight)
	{
	this.dogWeight = dogWeight;
	}

	// * return the grooming

	public boolean isGrooming()
	{
	return grooming;
	}

	// grooming the grooming to set

	public void setGrooming(boolean grooming)
	{
	this.grooming = grooming;
	}
	}
