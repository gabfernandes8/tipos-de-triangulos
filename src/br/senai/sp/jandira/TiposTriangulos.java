package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class TiposTriangulos {

	public static void main(String[] args) {
		
		String strLadoA, strLadoB, strLadoC;
		int ladoA, ladoB, ladoC;
		
		JOptionPane.showMessageDialog(null, "É ou não é um triângulo?");
		strLadoA = JOptionPane.showInputDialog("Digite o valor do lado A.");
		strLadoB = JOptionPane.showInputDialog("Digite o valor do lado B.");
		strLadoC = JOptionPane.showInputDialog("Digite o valor do lado C.");
		
		ladoA = Integer.parseInt(strLadoA);
		ladoB = Integer.parseInt(strLadoB);
		ladoC = Integer.parseInt(strLadoC);
		
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			
			if (ladoA == ladoB && ladoB == ladoC) {
				JOptionPane.showMessageDialog(null, "Seu triângulo é EQUILÁTERO.");
				
			} else { 
				
				if (ladoA != ladoB && ladoB != ladoC) {
					JOptionPane.showMessageDialog(null, "Seu triângulo é ESCALENO.");
					
				} else {
					
					if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
						JOptionPane.showMessageDialog(null, "Seu triângulo é ISÓSCELES.");
					}
					
				}
				
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Isto não é um triângulo.");
		}
		
		
		
	}

}
