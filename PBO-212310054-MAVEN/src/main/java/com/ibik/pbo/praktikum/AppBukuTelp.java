package com.ibik.pbo.praktikum;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {
	 public static void main(String[] args) {
	        ArrayList<String> fieldName = new ArrayList<String>();
	        fieldName.add("Nama Lengkap");
	        fieldName.add("Alamat");
	        fieldName.add("No. Telp");

	        ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();

	        for (int h = 0; h < fieldName.size(); h++) {
	            contact.add(new ArrayList<String>());
	            for (int e = 0; e < fieldName.size(); e++) {
	                String value = JOptionPane.showInputDialog(null, "Masukkan " + fieldName.get(e) + ":",
	                        "Data ke - " + (h + 1), JOptionPane.QUESTION_MESSAGE);
	                contact.get(h).add(e, value);
	            }
	        }

	        String output = "";

	        for (int h = 0; h < fieldName.size(); h++) {
	            output += "Data ke - " + (h + 1) + "\n";
	            for (int e = 0; e < fieldName.size(); e++) {
	                output += fieldName.get(e) + ": " + contact.get(e).get(h) + "\n";
	            }
	            output += "\n";
	        }

	        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);

	        System.out.println(contact);
	    }
	

}
