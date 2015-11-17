package hipster.controller;

import hipster.view.HipsterFrame;

public class HipsterAppController 
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster();
		setFrame = new HipsterFrame(this);
	}
	
	public void start();
	{
		Sring myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle (myName + "'s Hipster Project!");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}
