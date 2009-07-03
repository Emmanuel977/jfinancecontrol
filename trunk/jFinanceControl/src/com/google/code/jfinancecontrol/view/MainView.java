package com.google.code.jfinancecontrol.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar menu = null;
	private JToolBar toolBar = null;
	private JButton buttonAccounts = null;
	private JButton buttonIncome = null;
	private JButton buttonExpense = null;
	private JButton buttonHelp = null;
	private JButton buttonReport = null;
	private JMenu menuFile = null;
	private JMenu menuEdit = null;
	private JMenu menuAbout = null;
	private JMenuItem menuItemExit = null;
	private JMenuItem menuItemAbout = null;
	private JDesktopPane jDesktopPane = null;
	/**
	 * This is the default constructor
	 */
	public MainView() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400, 200);
		this.setJMenuBar(getMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("jFinance Control");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(0);
			jContentPane = new JPanel();
			jContentPane.setLayout(borderLayout);
			jContentPane.add(getToolBar(), BorderLayout.NORTH);
			jContentPane.add(getJDesktopPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes menu	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenu() {
		if (menu == null) {
			menu = new JMenuBar();
			menu.add(getMenuFile());
			menu.add(getMenuEdit());
			menu.add(getMenuAbout());
		}
		return menu;
	}

	/**
	 * This method initializes toolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getToolBar() {
		if (toolBar == null) {
			toolBar = new JToolBar();
			toolBar.setLayout(new BoxLayout(getToolBar(), BoxLayout.X_AXIS));
			toolBar.add(getButtonAccounts());
			toolBar.add(getButtonIncome());
			toolBar.add(getButtonExpense());
			toolBar.add(getButtonReport());
			toolBar.add(getButtonHelp());
		}
		return toolBar;
	}

	/**
	 * This method initializes buttonAccounts	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonAccounts() {
		if (buttonAccounts == null) {
			buttonAccounts = new JButton();
			buttonAccounts.setText("Accounts");
			buttonAccounts.setLocation(new Point(16, 2));
			buttonAccounts.setSize(new Dimension(70, 30));
			buttonAccounts.setPreferredSize(new Dimension(70, 30));
			buttonAccounts.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JInternalFrame frame = new AccountIFrame();
					getJDesktopPane().add(frame); // TODO Auto-generated Event stub actionPerformed()
					frame.show();
				}
			});
		}
		return buttonAccounts;
	}

	/**
	 * This method initializes buttonIncome	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonIncome() {
		if (buttonIncome == null) {
			buttonIncome = new JButton();
			buttonIncome.setText("Income");
			buttonIncome.setSize(new Dimension(70, 30));
			buttonIncome.setPreferredSize(new Dimension(70, 30));
			buttonIncome.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JInternalFrame frame = new IncomeIFrame();
					getJDesktopPane().add(frame); // TODO Auto-generated Event stub actionPerformed()
					frame.show();
				}
			});
		}
		return buttonIncome;
	}

	/**
	 * This method initializes buttonExpense	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonExpense() {
		if (buttonExpense == null) {
			buttonExpense = new JButton();
			buttonExpense.setText("Expenses");
			buttonExpense.setSize(new Dimension(70, 30));
			buttonExpense.setPreferredSize(new Dimension(70, 30));
			buttonExpense.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JInternalFrame frame = new ExpenseIFrame();
					getJDesktopPane().add(frame); // TODO Auto-generated Event stub actionPerformed()
					frame.show();
				}
			});
		}
		return buttonExpense;
	}

	/**
	 * This method initializes buttonHelp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonHelp() {
		if (buttonHelp == null) {
			buttonHelp = new JButton();
			buttonHelp.setText("Help");
			buttonHelp.setSize(new Dimension(70, 30));
			buttonHelp.setPreferredSize(new Dimension(70, 30));
		}
		return buttonHelp;
	}

	/**
	 * This method initializes buttonReport	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonReport() {
		if (buttonReport == null) {
			buttonReport = new JButton();
			buttonReport.setText("Reports");
			buttonReport.setSize(new Dimension(70, 30));
			buttonReport.setPreferredSize(new Dimension(70, 30));
		}
		return buttonReport;
	}

	/**
	 * This method initializes menuFile	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu();
			menuFile.setText("File");
			menuFile.add(getMenuItemExit());
		}
		return menuFile;
	}

	/**
	 * This method initializes menuEdit	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuEdit() {
		if (menuEdit == null) {
			menuEdit = new JMenu();
			menuEdit.setText("Edit");
		}
		return menuEdit;
	}

	/**
	 * This method initializes menuAbout	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuAbout() {
		if (menuAbout == null) {
			menuAbout = new JMenu();
			menuAbout.setText("About");
			menuAbout.add(getMenuItemAbout());
		}
		return menuAbout;
	}

	/**
	 * This method initializes menuItemExit	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuItemExit() {
		if (menuItemExit == null) {
			menuItemExit = new JMenuItem();
			menuItemExit.setText("Exit");
		}
		return menuItemExit;
	}

	/**
	 * This method initializes menuItemAbout	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuItemAbout() {
		if (menuItemAbout == null) {
			menuItemAbout = new JMenuItem();
			menuItemAbout.setText("About jFinanceDesktop");
		}
		return menuItemAbout;
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();
		}
		return jDesktopPane;
	}

}
