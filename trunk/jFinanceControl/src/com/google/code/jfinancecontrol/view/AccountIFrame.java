package com.google.code.jfinancecontrol.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AccountIFrame extends JInternalFrame {

	private JPanel jContentPane = null;
	private JPanel panelButton = null;
	private JScrollPane jScrollPane = null;
	private JTable tableAccounts = null;
	private JButton buttonNewAccount = null;
	private JButton buttonDeleteAccount = null;
	private JButton buttonEditAccount = null;

	/**
	 * This is the xxx default constructor
	 */
	public AccountIFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setClosable(true);
		this.setMaximizable(true);
		this.setTitle("Accounts");
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
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
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
			panelButton.add(getButtonNewAccount(), new GridBagConstraints());
			panelButton.add(getButtonDeleteAccount(), new GridBagConstraints());
			panelButton.add(getButtonEditAccount(), new GridBagConstraints());
		}
		return panelButton;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTableAccounts());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tableAccounts	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableAccounts() {
		if (tableAccounts == null) {
			tableAccounts = new JTable();
		}
		return tableAccounts;
	}

	/**
	 * This method initializes buttonNewAccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonNewAccount() {
		if (buttonNewAccount == null) {
			buttonNewAccount = new JButton();
			buttonNewAccount.setText("New");
			buttonNewAccount.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JDialog dialog = new AccountDialog();
					dialog.setVisible(true);
				}
			});
		}
		return buttonNewAccount;
	}

	/**
	 * This method initializes buttonDeleteAccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonDeleteAccount() {
		if (buttonDeleteAccount == null) {
			buttonDeleteAccount = new JButton();
			buttonDeleteAccount.setText("Delete");
		}
		return buttonDeleteAccount;
	}

	/**
	 * This method initializes buttonEditAccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonEditAccount() {
		if (buttonEditAccount == null) {
			buttonEditAccount = new JButton();
			buttonEditAccount.setText("Edit");
		}
		return buttonEditAccount;
	}

}
