package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

import Moldel.QLSVModel;
import Moldel.SinhVien;
import View.SinhVienView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SinhVienListener implements ActionListener{
	private SinhVienView view;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String commend = e.getActionCommand();
		if(commend.equals("Save")) {
			try {
				String idStudent = (view.textField_Id_Student.getText());
				String nameStudent = (view.textField__Name_Student.getText());
				String homeTown = (view.comboBox_Home_Town.getSelectedItem()+"");
				Date birthday = (Date.valueOf(view.textField_Birthday.getText()));
				String sex = this.view.buttonGroup.getSelection().getActionCommand()+"";
				Float math_Score = (Float.valueOf(view.textField_Math_Score.getText()));
				Float physics_Score = (Float.valueOf(view.textField_Physics_Score.getText()));
				Float chemistry_Score = (Float.valueOf(view.textField_Chemistry_Score.getText()));
				SinhVien sv = new SinhVien(idStudent, nameStudent, homeTown, birthday, sex, math_Score, physics_Score, chemistry_Score);
				if(this.view.model.CheckExist(sv.getIdStudent()) == null) {
					this.view.InsertDataInTable(sv);
				}
				this.view.model.Save(sv);
				this.view.emtyBox();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				JOptionPane.showMessageDialog(view, "Save failed");
			}
		}else if(commend.equals("Update")){
			try {
				String idStudent = (view.textField_Id_Student.getText());
				String nameStudent = (view.textField__Name_Student.getText());
				String homeTown = (view.comboBox_Home_Town.getSelectedItem()+"");
				Date birthday = (Date.valueOf(view.textField_Birthday.getText()));
				String sex = this.view.buttonGroup.getSelection().getActionCommand();
				Float math_Score = (Float.valueOf(view.textField_Math_Score.getText()));
				Float physics_Score = (Float.valueOf(view.textField_Physics_Score.getText()));
				Float chemistry_Score = (Float.valueOf(view.textField_Chemistry_Score.getText()));
				SinhVien sv = new SinhVien(idStudent, nameStudent, homeTown, birthday, sex, math_Score, physics_Score, chemistry_Score);
				this.view.model.Update(sv);
				this.view.UpdateDataInTable(sv);
				if(!this.view.textField_IdStudent_Search.getText().equals("")) {
					this.view.GetValueWhenSearchingIdStudent(idStudent);
				}
				this.view.emtyBox();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				JOptionPane.showMessageDialog(view, "Update failed");
			}
		}else if(commend.equals("Delete")){
			try {
				String idStudent = (view.textField_Id_Student.getText());
				String nameStudent = (view.textField__Name_Student.getText());
				String homeTown = (view.comboBox_Home_Town.getSelectedItem()+"");
				Date birthday = (Date.valueOf(view.textField_Birthday.getText()));
				String sex = this.view.buttonGroup.getSelection().getActionCommand();
				Float math_Score = (Float.valueOf(view.textField_Math_Score.getText()));
				Float physics_Score = (Float.valueOf(view.textField_Physics_Score.getText()));
				Float chemistry_Score = (Float.valueOf(view.textField_Chemistry_Score.getText()));
				SinhVien sv = new SinhVien(idStudent, nameStudent, homeTown, birthday, sex, math_Score, physics_Score, chemistry_Score);
				this.view.model.Delete(sv, this.view.table.getSelectedRow());
				this.view.RemoveDataInTable(sv);
				this.view.emtyBox();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				JOptionPane.showMessageDialog(view, "Delete failed");
			}
		}else if(commend.equals("Searching")){
			try {
				String temp = this.view.textField_IdStudent_Search.getText();
				if(!temp.equals("")) {
					this.view.GetValueWhenSearchingIdStudent(temp);
				}else if(!(this.view.comboBox_Search.getSelectedItem()+"").equals(null)) {
					this.view.SearchByHomeTown();
				}
				this.view.emtyBox();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				JOptionPane.showMessageDialog(view, "Searching failed");
			}
		}else if(commend.equals("All List")) {
			this.view.allList();
		}
		
	}

}
