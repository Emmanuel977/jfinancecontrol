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
import javax.swing.JRadioButton;

public class ClientDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel panelButton = null;
	private JButton buttonOk = null;
	private JButton buttonCancel = null;
	private JPanel panelContent = null;
	private JLabel labelClientName = null;
	private JRadioButton radioLegalPerson = null;
	private JRadioButton radioNatural = null;
	private JTextField fieldClientName = null;
	private JPanel jPanel = null;
	/**
	 * @param owner
	 */
	public ClientDialog(Frame owner) {
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
		this.setTitle("Client");
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
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 1;
			gridBagConstraints11.gridy = 2;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			labelClientName = new JLabel();
			labelClientName.setText("Name");
			panelContent = new JPanel();
			panelContent.setLayout(new GridBagLayout());
			panelContent.add(labelClientName, gridBagConstraints);
			panelContent.add(getFieldClientName(), gridBagConstraints1);
			panelContent.add(getJPanel(), gridBagConstraints11);
		}
		return panelContent;
	}

	/**
	 * This method initializes radioLegalPerson	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRadioLegalPerson() {
		if (radioLegalPerson == null) {
			radioLegalPerson = new JRadioButton();
			radioLegalPerson.setText("Legal Person");
		}
		return radioLegalPerson;
	}

	/**
	 * This method initializes radioNatural	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRadioNatural() {
		if (radioNatural == null) {
			radioNatural = new JRadioButton();
			radioNatural.setText("Natural Person");
		}
		return radioNatural;
	}

	/**
	 * This method initializes fieldClientName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldClientName() {
		if (fieldClientName == null) {
			fieldClientName = new JTextField();
		}
		return fieldClientName;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = -1;
			gridBagConstraints3.gridy = -1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = -1;
			gridBagConstraints2.gridy = -1;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getRadioLegalPerson(), gridBagConstraints2);
			jPanel.add(getRadioNatural(), gridBagConstraints3);
		}
		return jPanel;
	}

}
