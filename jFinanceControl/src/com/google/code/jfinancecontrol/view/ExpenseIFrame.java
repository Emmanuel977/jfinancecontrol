package com.google.code.jfinancecontrol.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExpenseIFrame extends JInternalFrame {

	private JPanel jContentPane = null;
	private JPanel panelAccounts = null;
	private JLabel labelAccounts = null;
	private JComboBox comboAccounts = null;
	private JPanel panelButton = null;
	private JButton buttonNewExpense = null;
	private JButton buttonDeleteExpense = null;
	private JButton buttonEditExpense = null;
	private JScrollPane jScrollPane = null;
	private JTable tableExpense = null;

	/**
	 * This is the xxx default constructor
	 */
	public ExpenseIFrame() {
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
		this.setMaximizable(true);
		this.setClosable(true);
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
			jContentPane.add(getPanelAccounts(), BorderLayout.NORTH);
			jContentPane.add(getPanelButton(), BorderLayout.SOUTH);
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelAccounts	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelAccounts() {
		if (panelAccounts == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridx = 1;
			labelAccounts = new JLabel();
			labelAccounts.setText("Account");
			panelAccounts = new JPanel();
			panelAccounts.setLayout(new GridBagLayout());
			panelAccounts.add(labelAccounts, new GridBagConstraints());
			panelAccounts.add(getComboAccounts(), gridBagConstraints);
		}
		return panelAccounts;
	}

	/**
	 * This method initializes comboAccounts	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboAccounts() {
		if (comboAccounts == null) {
			comboAccounts = new JComboBox();
		}
		return comboAccounts;
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
			panelButton.add(getButtonNewExpense(), new GridBagConstraints());
			panelButton.add(getButtonDeleteExpense(), new GridBagConstraints());
			panelButton.add(getButtonEditExpense(), new GridBagConstraints());
		}
		return panelButton;
	}

	/**
	 * This method initializes buttonNewExpense	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonNewExpense() {
		if (buttonNewExpense == null) {
			buttonNewExpense = new JButton();
			buttonNewExpense.setText("New");
		}
		return buttonNewExpense;
	}

	/**
	 * This method initializes buttonDeleteExpense	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonDeleteExpense() {
		if (buttonDeleteExpense == null) {
			buttonDeleteExpense = new JButton();
			buttonDeleteExpense.setText("Delete");
		}
		return buttonDeleteExpense;
	}

	/**
	 * This method initializes buttonEditExpense	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonEditExpense() {
		if (buttonEditExpense == null) {
			buttonEditExpense = new JButton();
			buttonEditExpense.setText("Edit");
		}
		return buttonEditExpense;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTableExpense());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tableExpense	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableExpense() {
		if (tableExpense == null) {
			tableExpense = new JTable();
		}
		return tableExpense;
	}

}
