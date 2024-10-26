package repeticao_while_2;

import java.sql.Time;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

public class principal {

	public static void main(String[] args) {
		// exibir os numeros de 1 a 10
		// descrescente --> contagem regressiva

		try {
			int i = 10;
			while (i >= 1) {
				System.out.println(i);
				i--;
				TimeUnit.SECONDS.sleep(1);
			}

		} catch (Exception e) {
			System.out.println("Errrroooooooooo");
		}

	}

}
