package POO;

public class Motor {
	String fabricante;
	int velocidade;
	float voltagem;
	boolean motorLigado;
	void ligaMotor() {
		motorLigado = true;
	}
	void desligaMotor() {
		motorLigado = false;
	}
	public static void verificaVelocidadeMotor(Motor Mot) {
		System.out.println("A velocidade do motor é: " + Mot.velocidade);
	}
}
