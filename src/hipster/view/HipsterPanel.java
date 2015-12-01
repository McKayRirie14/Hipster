/**
 * @author mrir2917
 */
package hipster.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import hipster.controller.HipsterAppController;
import hipster.model.Book;


/**
 * @author mrir2917
 * @version 0.3 Nov 14, 2015
 * 
 */
public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baselayout = new SpringLayout);
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPricelabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new Jbutton("Change books");
		phraseComboBox  new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrase();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground();
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setpListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue ));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
	changeBookButton.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent click)
			{
				Book[] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("Book price: " + tempBooks[startClick].getPrice());
					startClick++;
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book price: ");
					bookPriceLabel.setText("Book price ");
				}
			}
		});
	}
}
