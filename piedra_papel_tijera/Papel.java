package piedra_papel_tijera;

public class Papel extends Elemento{

	@Override
	public int jugar(Tijera e) {
	
		return -1;
	}

	@Override
	public int jugar(Papel e) {

		return 0;
	}

	@Override
	public int jugar(Piedra e) {

		return 1;
	}

	@Override
	public int jugar(Elemento elemento2) {
		
		return elemento2.jugar(this);//this es piedra(que eso lo se) pero elemento 2 no se lo que es(asi que invierto los roles)
	}



	



}
