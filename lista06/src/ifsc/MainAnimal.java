package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cachorro Maya = new Cachorro();
		
		Maya.late();
		
		Maya.setNome("Maya");
		Maya.setRaca("viralata");
		Maya.setComprimento(15.f);
		Maya.setNmdppat(4);
		Maya.setCor("preto");
		Maya.setEcossistema("jungle");
		
		System.out.println(Maya.getNome());
		System.out.println(Maya.getRaca());
		System.out.println(Maya.getComprimento());
		System.out.println(Maya.getNmdppat());
		System.out.println(Maya.getCor());
		System.out.println(Maya.getEcossistema());
		Maya.caminha();
		System.out.println("");
		
		
		Gato Puf = new Gato();
		
		Puf.mia();
		
		Puf.setNome("Puf");
		Puf.setRaca("duda");
		Puf.setComprimento(5.f);
		Puf.setNmdppat(5);
		Puf.setCor("Branco");
		Puf.setEcossistema("amazonia");
		
		System.out.println(Puf.getNome());
		System.out.println(Puf.getRaca());
		System.out.println(Puf.getComprimento());
		System.out.println(Puf.getNmdppat());
		System.out.println(Puf.getCor());
		System.out.println(Puf.getEcossistema());
		Puf.caminha();
		System.out.println("");
		
		
	}

}
