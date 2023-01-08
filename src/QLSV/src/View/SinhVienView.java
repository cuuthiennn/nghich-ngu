package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Moldel.QLSVModel;
import Moldel.SinhVien;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controller.SinhVienListener;

import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import javax.swing.JList;

public class SinhVienView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_IdStudent_Search;
	public JTextField textField_Id_Student;
	public JTextField textField__Name_Student;
	public ButtonGroup buttonGroup;
	public JTextField textField_Math_Score;
	public JTextField textField_Birthday;
	public JTextField textField_Physics_Score;
	public JTextField textField_Chemistry_Score;
	public JComboBox comboBox_Search;
	public JComboBox comboBox_Home_Town;
	public JTable table;
	public MouseEvent e;
	public JRadioButton jradio_Female;
	public JRadioButton jradio_Male;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinhVienView frame = new SinhVienView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SinhVienView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ActionListener ac = new SinhVienListener(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 550, 22);
		contentPane.add(menuBar);
		
		JMenu menu_File = new JMenu("File");
		menuBar.add(menu_File);
		
		JMenuItem menuItem_Open = new JMenuItem("Open");
		menuItem_Open.setHorizontalAlignment(SwingConstants.CENTER);
		menu_File.add(menuItem_Open);
		
		JSeparator separator = new JSeparator();
		menu_File.add(separator);
		
		JMenuItem menuItem_Save = new JMenuItem("Save");
		menuItem_Save.setHorizontalAlignment(SwingConstants.CENTER);
		menu_File.add(menuItem_Save);
		
		JSeparator separator_1 = new JSeparator();
		menu_File.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setHorizontalAlignment(SwingConstants.CENTER);
		menu_File.add(mntmExit);
		
		JMenu menu_About = new JMenu("About");
		menuBar.add(menu_About);
		
		JMenuItem menu_Item_AboutMe = new JMenuItem("About Me");
		menu_About.add(menu_Item_AboutMe);
		
		JLabel jLabel_HomeTown_Search = new JLabel("Home Town :");
		jLabel_HomeTown_Search.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_HomeTown_Search.setBounds(10, 31, 92, 17);
		contentPane.add(jLabel_HomeTown_Search);
		
		comboBox_Search = new JComboBox();
		comboBox_Search.addItem("");
		comboBox_Search.setBounds(112, 31, 85, 21);
		contentPane.add(comboBox_Search);
		
		JLabel jLabel_IdStudent_Search = new JLabel("Id Student :");
		jLabel_IdStudent_Search.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_IdStudent_Search.setBounds(236, 29, 85, 21);
		contentPane.add(jLabel_IdStudent_Search);
		
		textField_IdStudent_Search = new JTextField();
		textField_IdStudent_Search.setBounds(326, 32, 85, 20);
		contentPane.add(textField_IdStudent_Search);
		textField_IdStudent_Search.setColumns(10);
		
		JButton btnNewButton = new JButton("Searching");
		btnNewButton.addActionListener(ac);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(434, 31, 106, 25);
		contentPane.add(btnNewButton);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 73, 530, 17);
		contentPane.add(separator_2);
		
		JLabel jLabel_Title_ListStudens = new JLabel("List Students");
		jLabel_Title_ListStudens.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_Title_ListStudens.setBounds(10, 77, 92, 13);
		contentPane.add(jLabel_Title_ListStudens);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 221, 530, 17);
		contentPane.add(separator_2_1);
		
		JLabel jLabel_HomeTown = new JLabel("Home Town :");
		jLabel_HomeTown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_HomeTown.setBounds(51, 293, 92, 17);
		contentPane.add(jLabel_HomeTown);
		
		comboBox_Home_Town = new JComboBox();
		comboBox_Home_Town.addItem("");
		ArrayList<String> tinh = this.model.getDSTinh();
		for(String s : tinh) {
			comboBox_Home_Town.addItem(s);
			comboBox_Search.addItem(s);
		}
		comboBox_Home_Town.setBounds(177, 293, 85, 21);
		contentPane.add(comboBox_Home_Town);
		
		JLabel jLabel_IdStudent = new JLabel("Id Student :");
		jLabel_IdStudent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_IdStudent.setBounds(51, 233, 85, 21);
		contentPane.add(jLabel_IdStudent);
		
		textField_Id_Student = new JTextField();
		textField_Id_Student.setColumns(10);
		textField_Id_Student.setBounds(177, 232, 85, 20);
		contentPane.add(textField_Id_Student);
		
		textField__Name_Student = new JTextField();
		textField__Name_Student.setColumns(10);
		textField__Name_Student.setBounds(177, 263, 85, 20);
		contentPane.add(textField__Name_Student);
		
		JLabel jLabel_NameStudent = new JLabel("Name Student :");
		jLabel_NameStudent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_NameStudent.setBounds(51, 264, 116, 21);
		contentPane.add(jLabel_NameStudent);
		
		JLabel lblNewLabel = new JLabel("Sex :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(322, 235, 40, 17);
		contentPane.add(lblNewLabel);
		
		buttonGroup = new ButtonGroup();
		jradio_Male = new JRadioButton("Male");
		jradio_Male.setActionCommand("Male");
		buttonGroup.add(jradio_Male);
		jradio_Male.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jradio_Male.setBounds(369, 235, 55, 21);
		contentPane.add(jradio_Male);
		
		jradio_Female = new JRadioButton("Female");
		jradio_Female.setActionCommand("Female");
		buttonGroup.add(jradio_Female);
		jradio_Female.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jradio_Female.setBounds(434, 235, 69, 21);
		contentPane.add(jradio_Female);
		
		JLabel jLabel_Math = new JLabel("Math :");
		jLabel_Math.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_Math.setBounds(322, 266, 45, 13);
		contentPane.add(jLabel_Math);
		
		JLabel jLabel_Physics = new JLabel("Physics :");
		jLabel_Physics.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_Physics.setBounds(322, 297, 60, 13);
		contentPane.add(jLabel_Physics);
		
		JLabel jLabel_Chemistry = new JLabel("Chemistry :");
		jLabel_Chemistry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_Chemistry.setBounds(322, 325, 85, 13);
		contentPane.add(jLabel_Chemistry);
		
		textField_Math_Score = new JTextField();
		textField_Math_Score.setBounds(417, 263, 57, 19);
		contentPane.add(textField_Math_Score);
		textField_Math_Score.setColumns(10);
		
		JLabel jLabel_NameStudent_1 = new JLabel("Birthday :");
		jLabel_NameStudent_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel_NameStudent_1.setBounds(51, 321, 85, 21);
		contentPane.add(jLabel_NameStudent_1);
		
		textField_Birthday = new JTextField("(y-m-d)");
		textField_Birthday.setColumns(10);
		textField_Birthday.setBounds(177, 320, 85, 20);
		contentPane.add(textField_Birthday);
		
		textField_Physics_Score = new JTextField();
		textField_Physics_Score.setColumns(10);
		textField_Physics_Score.setBounds(417, 294, 57, 19);
		contentPane.add(textField_Physics_Score);
		
		textField_Chemistry_Score = new JTextField();
		textField_Chemistry_Score.setColumns(10);
		textField_Chemistry_Score.setBounds(417, 324, 57, 19);
		contentPane.add(textField_Chemistry_Score);
		
		JButton jButton_Save = new JButton("Save");
		jButton_Save.addActionListener(ac);
		jButton_Save.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jButton_Save.setBounds(40, 359, 85, 31);
		contentPane.add(jButton_Save);
		
		JButton jButton_Update = new JButton("Update");
		jButton_Update.addActionListener(ac);
		jButton_Update.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jButton_Update.setBounds(236, 359, 85, 31);
		contentPane.add(jButton_Update);
		
		JButton jButton_Delete = new JButton("Delete");
		jButton_Delete.addActionListener(ac);
		jButton_Delete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jButton_Delete.setBounds(418, 359, 85, 31);
		contentPane.add(jButton_Delete);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(10, 349, 530, 17);
		contentPane.add(separator_2_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(10, 101, 530, 110);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Id", "Name", "Home Town", "Birthday", "Sex", "Math", "Physics", "Chemistry"
			}
		)
			{
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			}	
				);
		
		JButton button_All_List = new JButton("All List");
		button_All_List.addActionListener(ac);
		button_All_List.setFont(new Font("Tahoma", Font.PLAIN, 5));
		button_All_List.setBounds(485, 83, 55, 13);
		contentPane.add(button_All_List);
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(67);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setPreferredWidth(57);
		table.getColumnModel().getColumn(7).setPreferredWidth(57);
		table.getColumnModel().getColumn(8).setPreferredWidth(57);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
	            
	            // i = the index of the selected row
	            int i = table.getSelectedRow();
	            
	            textField_Id_Student.setText(model.getListStudent().get(i).getIdStudent());
	            textField__Name_Student.setText(model.getListStudent().get(i).getNameStudent());
	            comboBox_Home_Town.setSelectedItem(model.getListStudent().get(i).getHomeTown());
	            textField_Birthday.setText(model.getListStudent().get(i).getBirthday()+"");
	            textField_Math_Score.setText(model.getListStudent().get(i).getSubjectScore_Math()+"");
	            textField_Physics_Score.setText(model.getListStudent().get(i).getSubjectScore_Physics()+"");
	            textField_Chemistry_Score.setText(model.getListStudent().get(i).getSubjectScore_Chemistry()+"");
	            if(model.getListStudent().get(i).getSex().equals("Male")) {
	            	jradio_Male.setSelected(true);
	            }else {
	            	jradio_Female.setSelected(true);
	            }
	            
	        }
		});
		
		this.setVisible(true);
	}
	
	public void InsertDataInTable(SinhVien sv) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			model_table.addRow(new Object[] {
					model_table.getRowCount(),
					sv.getIdStudent(),
					sv.getNameStudent(),
					sv.getHomeTown(),
					sv.getBirthday(),
					sv.getSex(),
					sv.getSubjectScore_Math(),
					sv.getSubjectScore_Physics(),
					sv.getSubjectScore_Chemistry()
			});
	}
	
	public void emtyBox() {
		this.buttonGroup.clearSelection();
		this.textField__Name_Student.setText("");
		this.textField_Birthday.setText("(y-m-d)");
		this.textField_Chemistry_Score.setText("");
		this.textField_Id_Student.setText("");
		this.textField_IdStudent_Search.setText("");
		this.textField_Math_Score.setText("");
		this.textField_Physics_Score.setText("");
		this.comboBox_Home_Town.setSelectedIndex(-1);
		this.comboBox_Search.setSelectedIndex(-1);
	}
	
	public void UpdateDataInTable(SinhVien sv) {
		DefaultTableModel model_Table = (DefaultTableModel) table.getModel();
		int countRow = model_Table.getRowCount();
		for(int i = 0; i < countRow; i++) {
			if(sv.getIdStudent().equals(model_Table.getValueAt(i, 1))) {
				model_Table.setValueAt(sv.getNameStudent(), i, 2);
				model_Table.setValueAt(sv.getHomeTown(), i, 3);
				model_Table.setValueAt(sv.getBirthday(), i, 4);
				model_Table.setValueAt(sv.getSex(), i, 5);
				model_Table.setValueAt(sv.getSubjectScore_Math(), i, 6);
				model_Table.setValueAt(sv.getSubjectScore_Physics(), i, 7);
				model_Table.setValueAt(sv.getSubjectScore_Chemistry(), i, 8);
			}
		}
	}
	
	public void RemoveDataInTable(SinhVien sv) {
		DefaultTableModel model_Table = (DefaultTableModel) table.getModel();
		int countRow = model_Table.getRowCount();
		for(int i = 0; i < countRow; i++) {
			if(sv.getIdStudent().equals(model_Table.getValueAt(i, 1))) {
				model_Table.removeRow(i);
				break;
			}
		}
	}
	
	public void GetValueWhenSearchingIdStudent(String idStudent) {
		SinhVien sv = this.model.CheckExist(idStudent);
		if(sv == null) {
			JOptionPane.showMessageDialog(this, "Student is not exist!");
		}else {
			DefaultTableModel model_table = new DefaultTableModel(
																	new Object[][] {
																	},
																	new String[] {
																		"STT", "Id", "Name", "Home Town", "Birthday", "Sex", "Math", "Physics", "Chemistry"
																	}
																	);
			model_table.addRow(new Object[] {
					model_table.getRowCount(),
					sv.getIdStudent(),
					sv.getNameStudent(),
					sv.getHomeTown(),
					sv.getBirthday(),
					sv.getSex(),
					sv.getSubjectScore_Math(),
					sv.getSubjectScore_Physics(),
					sv.getSubjectScore_Chemistry()
			});
			table.setModel(model_table);
			table.getColumnModel().getColumn(0).setPreferredWidth(31);
			table.getColumnModel().getColumn(1).setPreferredWidth(67);
			table.getColumnModel().getColumn(4).setPreferredWidth(80);
			table.getColumnModel().getColumn(5).setPreferredWidth(30);
			table.getColumnModel().getColumn(6).setPreferredWidth(57);
			table.getColumnModel().getColumn(7).setPreferredWidth(57);
			table.getColumnModel().getColumn(8).setPreferredWidth(57);
		}
	}
	
	public void allList() {
		DefaultTableModel model_table = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"STT", "Id", "Name", "Home Town", "Birthday", "Sex", "Math", "Physics", "Chemistry"
				}
				);
		List<SinhVien> list = this.model.getListStudent();
		
		for(SinhVien sv : list) {
			model_table.addRow(new Object[] {
					model_table.getRowCount(),
					sv.getIdStudent(),
					sv.getNameStudent(),
					sv.getHomeTown(),
					sv.getBirthday(),
					sv.getSex(),
					sv.getSubjectScore_Math(),
					sv.getSubjectScore_Physics(),
					sv.getSubjectScore_Chemistry()
					});
		}
		table.setModel(model_table);
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(67);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setPreferredWidth(57);
		table.getColumnModel().getColumn(7).setPreferredWidth(57);
		table.getColumnModel().getColumn(8).setPreferredWidth(57);
	}
	
	public void SearchByHomeTown() {
		DefaultTableModel model_table = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"STT", "Id", "Name", "Home Town", "Birthday", "Sex", "Math", "Physics", "Chemistry"
				}
				);
		List<SinhVien> list = this.model.getListStudent();
		
		for(SinhVien sv : list) {
			if(sv.getHomeTown().equals(comboBox_Search.getSelectedItem()+"")) {
				model_table.addRow(new Object[] {
						model_table.getRowCount(),
						sv.getIdStudent(),
						sv.getNameStudent(),
						sv.getHomeTown(),
						sv.getBirthday(),
						sv.getSex(),
						sv.getSubjectScore_Math(),
						sv.getSubjectScore_Physics(),
						sv.getSubjectScore_Chemistry()
						});
			}
		}
		table.setModel(model_table);
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(67);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setPreferredWidth(57);
		table.getColumnModel().getColumn(7).setPreferredWidth(57);
		table.getColumnModel().getColumn(8).setPreferredWidth(57);
	}
}
