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

public class IncomeIFrame extends JInternalFrame {

	private JPanel jContentPane = null;
	private JPanel panelAccounts = null;
	private JLabel labelAccounts = null;
	private JComboBox comboAccounts = null;
	private JPanel panelButton = null;
	private JButton buttonNewIncome = null;
	private JButton buttonDeleteIncome = null;
	private JButton buttonEditIncome = null;
	private JScrollPane jScrollPane = null;
	private JTable tableIncome = null;

	/**
	 * This is the xxx default constructor
	 */
	public IncomeIFrame() {
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
			panelButton.add(getButtonNewIncome(), new GridBagConstraints());
			panelButton.add(getButtonDeleteIncome(), new GridBagConstraints());
			panelButton.add(getButtonEditIncome(), new GridBagConstraints());
		}
		return panelButton;
	}

	/**
	 * This method initializes buttonNewIncome	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonNewIncome() {
		if (buttonNewIncome == null) {
			buttonNewIncome = new JButton();
			buttonNewIncome.setText("New");
		}
		return buttonNewIncome;
	}

	/**
	 * This method initializes buttonDeleteIncome	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonDeleteIncome() {
		if (buttonDeleteIncome == null) {
			buttonDeleteIncome = new JButton();
			buttonDeleteIncome.setText("Delete");
		}
		return buttonDeleteIncome;
	}

	/**
	 * This method initializes buttonEditIncome	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonEditIncome() {
		if (buttonEditIncome == null) {
			buttonEditIncome = new JButton();
			buttonEditIncome.setText("Edit");
		}
		return buttonEditIncome;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTableIncome());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tableIncome	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableIncome() {
		if (tableIncome == null) {
			tableIncome = new JTable();
		}
		return tableIncome;
	}

}
