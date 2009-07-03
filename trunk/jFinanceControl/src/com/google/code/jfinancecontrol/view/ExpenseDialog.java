package com.google.code.jfinancecontrol.view;

import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ExpenseDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel panelButton = null;
	private JButton buttonOk = null;
	private JButton buttonCancel = null;
	private JPanel panelContent = null;
	private JLabel labelAccount = null;
	private JComboBox comboAccount = null;
	private JLabel labelIncomeDescription = null;
	private JTextField fieldIncomeDescription = null;
	private JLabel labelDestiny = null;
	private JComboBox comboDestiny = null;
	private JLabel labelAmount = null;
	private JTextField fieldAmount = null;
	private JLabel labelDate = null;
	private JTextField fieldDate = null;
	private JLabel labelPaid = null;
	private JComboBox comboPaid = null;
	/**
	 * @param owner
	 */
	public ExpenseDialog(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setTitle("Income");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getPanelButton(), BorderLayout.SOUTH);
			jContentPane.add(getPanelContent(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelButton	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelButton() {
		if (panelButton == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.gridx = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = 0;
			panelButton = new JPanel();
			panelButton.setLayout(new GridBagLayout());
			panelButton.add(getButtonOk(), gridBagConstraints1);
			panelButton.add(getButtonCancel(), gridBagConstraints);
		}
		return panelButton;
	}

	/**
	 * This method initializes buttonOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonOk() {
		if (buttonOk == null) {
			buttonOk = new JButton();
			buttonOk.setText("Ok");
		}
		return buttonOk;
	}

	/**
	 * This method initializes buttonCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonCancel() {
		if (buttonCancel == null) {
			buttonCancel = new JButton();
			buttonCancel.setText("Cancel");
		}
		return buttonCancel;
	}

	/**
	 * This method initializes panelContent	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelContent() {
		if (panelContent == null) {
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints13.gridy = 5;
			gridBagConstraints13.weightx = 1.0;
			gridBagConstraints13.gridx = 1;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 0;
			gridBagConstraints12.gridy = 5;
			labelPaid = new JLabel();
			labelPaid.setText("Paid");
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints11.gridy = 4;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.gridx = 1;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 0;
			gridBagConstraints10.gridy = 4;
			labelDate = new JLabel();
			labelDate.setText("Date");
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints9.gridy = 3;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.gridx = 1;
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 0;
			gridBagConstraints8.gridy = 3;
			labelAmount = new JLabel();
			labelAmount.setText("Amount");
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints7.gridy = 2;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.gridx = 1;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.gridy = 2;
			labelDestiny = new JLabel();
			labelDestiny.setText("Paid To");
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints5.gridy = 1;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.gridy = 1;
			labelIncomeDescription = new JLabel();
			labelIncomeDescription.setText("Description");
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.gridy = 0;
			labelAccount = new JLabel();
			labelAccount.setText("Account");
			panelContent = new JPanel();
			panelContent.setLayout(new GridBagLayout());
			panelContent.add(labelAccount, gridBagConstraints2);
			panelContent.add(getComboAccount(), gridBagConstraints3);
			panelContent.add(labelIncomeDescription, gridBagConstraints4);
			panelContent.add(getFieldIncomeDescription(), gridBagConstraints5);
			panelContent.add(labelDestiny, gridBagConstraints6);
			panelContent.add(getComboDestiny(), gridBagConstraints7);
			panelContent.add(labelAmount, gridBagConstraints8);
			panelContent.add(getFieldAmount(), gridBagConstraints9);
			panelContent.add(labelDate, gridBagConstraints10);
			panelContent.add(getFieldDate(), gridBagConstraints11);
			panelContent.add(labelPaid, gridBagConstraints12);
			panelContent.add(getComboPaid(), gridBagConstraints13);
		}
		return panelContent;
	}

	/**
	 * This method initializes comboAccount	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboAccount() {
		if (comboAccount == null) {
			comboAccount = new JComboBox();
		}
		return comboAccount;
	}

	/**
	 * This method initializes fieldIncomeDescription	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldIncomeDescription() {
		if (fieldIncomeDescription == null) {
			fieldIncomeDescription = new JTextField();
		}
		return fieldIncomeDescription;
	}

	/**
	 * This method initializes comboDestiny	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboDestiny() {
		if (comboDestiny == null) {
			comboDestiny = new JComboBox();
		}
		return comboDestiny;
	}

	/**
	 * This method initializes fieldAmount	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldAmount() {
		if (fieldAmount == null) {
			fieldAmount = new JTextField();
		}
		return fieldAmount;
	}

	/**
	 * This method initializes fieldDate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldDate() {
		if (fieldDate == null) {
			fieldDate = new JTextField();
		}
		return fieldDate;
	}

	/**
	 * This method initializes comboPaid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboPaid() {
		if (comboPaid == null) {
			comboPaid = new JComboBox();
		}
		return comboPaid;
	}

}
