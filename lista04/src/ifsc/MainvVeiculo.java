package ifsc;

import java.util.ArrayList;

public class MainvVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String nome = "";
//		Intager ano = 2000;
//		Intager numdrds = 4;

		ArrayList<Veiculo> veiculos = new ArrayList<>();

		Veiculo veiculo = new Veiculo();
		veiculo.setNome("paulo");
		veiculo.setAno(2021);
		veiculo.setCor("preto");
		veiculo.setFabricante("valdecir");
		veiculo.setNumdrods(4);
		
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNome("Lucas");
		veiculo2.setAno(2006);
		veiculo2.setCor("pardo");
		veiculo2.setFabricante("Juliano");
		veiculo2.setNumdrods(4);
		
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setNome("Camilli");
		veiculo3.setAno(2045);
		veiculo3.setCor("amarela");
		veiculo3.setFabricante("Osiel");
		veiculo3.setNumdrods(4);
		
		
		Veiculo veiculo4 = new Veiculo();
		veiculo4.setNome("Lezio");
		veiculo4.setAno(2022);
		veiculo4.setCor("preto");
		veiculo4.setFabricante("Arnaldo");
		veiculo4.setNumdrods(4);
		
		

		veiculos.add(veiculo);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		veiculos.add(veiculo4);

		for (Veiculo vei : veiculos) {
			
			
			System.out.println(vei.getNome());
			System.out.println(vei.getAno());
			System.out.println(vei.getCor());
			System.out.println(vei.getFabricante());
			System.out.println(vei.getNumdrods());
			System.out.println();
		}
	}

}
