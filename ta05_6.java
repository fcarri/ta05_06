package project5;

import javax.swing.JOptionPane;

public class ta05_6 {
	public static void main(String args[]){
		
		final double IVA = 21;
		
		String nombre = JOptionPane.showInputDialog("Introdueix preu: ");		
		Double dNombre = Double.parseDouble(nombre);  
		Double preu;
		
		//Calcul preu final
		
		preu = dNombre + (IVA / 100);
		JOptionPane.showMessageDialog(null, "Preu amb IVA = "+preu);
		
	}
}
