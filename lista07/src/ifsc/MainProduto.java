package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Desktop> desktops = new ArrayList<>();

		Desktop PC = new Desktop();
		PC.setCodBarra(8645962l);
		PC.setFabricante("-positivo-");
		PC.setGamer(true);
		
		
		ArrayList<String> pecas = new ArrayList<>();		
		pecas.add("gabinet");
		pecas.add("monitor");
		pecas.add("mouse");
		PC.setPecas(pecas);	
		
		desktops.add(PC);
		
		
		Desktop PC2 = new Desktop();
		PC2.setCodBarra(965874l);
		PC2.setFabricante("-Tesla-");
		PC2.setGamer(true);
		
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Monitor");
		pecas2.add("Mouse sem fio");
		pecas2.add("led");
		PC2.setPecas(pecas2);
		
		desktops.add(PC2);
		

		Desktop PC3 = new Desktop();
		PC3.setCodBarra(32547896l);
		PC3.setFabricante("-Sansung-");
		PC3.setGamer(true);
		
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Placa de video");
		pecas3.add("Fonte");
		pecas3.add("Fone sem fio");
		PC3.setPecas(pecas3);
						
		desktops.add(PC3);
		
		
		System.out.println("");
		
		
		ArrayList<Smartphone> celulares = new ArrayList<>();
		
		Smartphone cel = new Smartphone();		
		cel.setCodBarra(78541269l);
		cel.setMarca("Sansung");
		cel.setDimensoesTela("15x10");
		cel.setFabricante("Duda");
		celulares.add(cel);
		
		Smartphone cel2 = new Smartphone();
		cel2.setCodBarra(951254l);
		cel2.setMarca("IPhone");
		cel2.setDimensoesTela("13x8");
		cel2.setFabricante("Lezio");
		celulares.add(cel2);
		
		Smartphone cel3 = new Smartphone();
		cel3.setCodBarra(123456789l);
		cel3.setMarca("Motorola");
		cel3.setDimensoesTela("15x10");
		cel3.setFabricante("Will");
		celulares.add(cel3);
		
		System.out.println("Desktop: "+"\n");
		for (Desktop desktop : desktops) {
			System.out.println(desktop.getCodBarra());
			System.out.println(desktop.getFabricante());
			
			for(String peca : desktop.getPecas()) {
				System.out.println(peca);
			}
			System.out.println("");
		}
		
		System.out.println("Smartphone: "+"\n");
		for (Smartphone smartphone : celulares) {
			System.out.println(smartphone.getCodBarra());
			System.out.println(smartphone.getMarca());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println("");
		}
	}	 
}
