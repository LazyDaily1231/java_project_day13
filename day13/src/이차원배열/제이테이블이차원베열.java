package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블이차원베열 {

	public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(300,300);
	
	//Title
	 String [] title = {"컴퓨터", "영어" , "수학", "국어"};
	 
	 //내용
	 String[][] contents = {
			 {"100", "88", "99", "77"},
			 {"100", "88", "99", "77"},
			 {"60", "87", "79", "76"},
			 {"60", "87", "79", "76"},
			 {"60", "87", "79", "76"},
			 {"60", "87", "79", "76"},
			 {"60", "87", "79", "76"},
			 {"60", "87", "79", "76"},
			 {"90", "83", "89", "79"},
			 {"90", "83", "89", "79"},
			 {"90", "83", "89", "79"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
			 {"80", "86", "59", "80"},
	 };
	 
	JTable table = new JTable(contents, title);
	JScrollPane scroll = new JScrollPane(table);
	f.add(scroll);
	f.setVisible(true);
		
	}

}
