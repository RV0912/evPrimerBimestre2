package evPrimerBimestre2;

public class Ejercicio_21_RV {
	public static void main(String[] args) throws InterruptedException {
		int bate = 100;

		while (bate > 0) {
			bate--;
			Thread.sleep(20);
			System.out.println("tenes " + bate + "% de batería. tu celu aguanta");
		
			}
			if (bate == 0) {
				Thread.sleep(1000);
				System.out.println("Batería Agotada. tu celu no aguantó");

			}
		}

	}


