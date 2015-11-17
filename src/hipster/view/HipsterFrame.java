/**
 * @author mrir2917
 */
package hipster.view;

import javaxswing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.HisteAppController;

/**
 * @author mrir2917
 *@version 0.x ov17,2015
 *
 */

public class HipsterFrame
{
	prive HipsterAppController baseController;
	private Hipsterpanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prombt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisable(true);
	}
	
	public HispsterAppController getBaseController()
	{
		return baseController;
	}
}