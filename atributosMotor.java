package POO;

public class atributosMotor extends Motor{
	public static void main(String args[]) {
		Motor x = new Motor();
		Motor y = new Motor();
		Motor z = new Motor();
		x.velocidade = 100;
		y.velocidade = 200;
		z.velocidade = 300;
		
		System.out.println("Velocidade antes de acelerar\n");
		verificaVelocidadeMotor(x);
		verificaVelocidadeMotor(y);
		verificaVelocidadeMotor(z);
		aumentaVelocidade(x);
		aumentaVelocidade(z);
		diminuiVelocidade(y);
		System.out.println("\nVelocidade após acelerar\n");
		verificaVelocidadeMotor(x);
		verificaVelocidadeMotor(y);
		verificaVelocidadeMotor(z);
		
		
	}
	
	public static void aumentaVelocidade(Motor mot){
		if (mot.velocidade <= 5000) {
			mot.velocidade+=10;
		}
	}
	
	public static void diminuiVelocidade(Motor mot) {
		if (mot.velocidade > 0) {
			mot.velocidade--;
		}
	}
}


