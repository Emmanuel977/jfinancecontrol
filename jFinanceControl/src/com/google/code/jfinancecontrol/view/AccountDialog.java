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

public class AccountDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel panelButton = null;
	private JButton buttonOk = null;
	private JButton buttonCancel = null;
	private JPanel panelContent = null;
	private JLabel labelAccountName = null;
	private JTextField fieldAccountName = null;
	private JLabel labelAccountType = null;
	private JComboBox comboAccountType = null;
	private JLabel labelStartValue = null;
	private JTextField fieldStartValue = null;
	public AccountDialog() {
		super();
		initialize();
	}

	/**
	 * @param owner
	 */
	public AccountDialog(Frame owner) {
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
		this.setTitle("Account");
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
			jContentPane.add(getPanelContent(), BorderLayout.CENTER);
			jContentPane.add(getPanelButton(), BorderLayout.SOUTH);
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
			panelButton = new JPanel();
			panelButton.setLayout(new GridBagLayout());
			panelButton.add(getButtonOk(), new GridBagConstraints());
			panelButton.add(getButtonCancel(), new GridBagConstraints());
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
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints4.gridy = 2;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.gridy = 2;
			labelStartValue = new JLabel();
			labelStartValue.setText("Start Value");
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints21.gridy = 1;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.gridy = 1;
			labelAccountType = new JLabel();
			labelAccountType.setText("Account Type");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			labelAccountName = new JLabel();
			labelAccountName.setText("Account Name");
			panelContent = new JPanel();
			panelContent.setLayout(new GridBagLayout());
			panelContent.add(labelAccountName, gridBagConstraints);
			panelContent.add(getFieldAccountName(), gridBagConstraints1);
			panelContent.add(labelAccountType, gridBagConstraints2);
			panelContent.add(getComboAccountType(), gridBagConstraints21);
			panelContent.add(labelStartValue, gridBagConstraints3);
			panelContent.add(getFieldStartValue(), gridBagConstraints4);
		}
		return panelContent;
	}

	/**
	 * This method initializes fieldAccountName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldAccountName() {
		if (fieldAccountName == null) {
			fieldAccountName = new JTextField();
		}
		return fieldAccountName;
	}

	/**
	 * This method initializes comboAccountType	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboAccountType() {
		if (comboAccountType == null) {
			comboAccountType = new JComboBox();
		}
		return comboAccountType;
	}

	/**
	 * This method initializes fieldStartValue	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldStartValue() {
		if (fieldStartValue == null) {
			fieldStartValue = new JTextField();
		}
		return fieldStartValue;
	}

}
