package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.entities.Propriedade;
import models.entities.avenida;
import models.entities.companhia;

public class program {

	public static List<Propriedade> propriedades = new ArrayList<>();
	
	public static void main(String[] args) {
		//Calibrando propriedades-----------------------------
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("D:\\\\temp\\banco.csv")))){
			String Line = br.readLine();
			
			while (Line.startsWith("*")) {
				String[] x = Line.replace("*", "").split(",");
				propriedades.add(new companhia(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2])));
				Line = br.readLine();
			}
			
			while (Line != null) {
				
				String[] x = Line.split(",");
				
				int[] alugueis = new int[] 
						{Integer.parseInt(x[2]),
						Integer.parseInt(x[3]),
						Integer.parseInt(x[4]),
						Integer.parseInt(x[5]),
						Integer.parseInt(x[6])};
				
				propriedades.add(new avenida(x[0], Integer.parseInt(x[1]), x[9], alugueis, Integer.parseInt(x[7]), Integer.parseInt(x[8])));
				Line = br.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for (Propriedade x : propriedades) {
			System.out.println(x);
		}
		
		

	}

}
