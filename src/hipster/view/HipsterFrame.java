/**
 * @author mrir2917
 */
package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.HipsterAppController;

/**
 * @author mrir2917
 *@version 0.x ov17,2015
 *
 */

public class HipsterFrame
{
	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPanel(basePanel);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisable(true);
	}
	
	public HispsterAppController getBaseController()
	{
		return baseController;
	}
}