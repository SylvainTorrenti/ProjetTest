import java.util.Scanner;

public class Utils {
	public static final float PI = 3.14f;
	public static final String COULEUR_BLEU = "bleu";

	public static void afficherMessage(String texte) {
		System.out.println(texte);
	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}

	public static float surface(int rayon) {
		float surface1 = rayon * rayon * PI;
		return surface1;
	}
	public static float surface2(float a){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisirle rayon :");
		float rayon = sc.nextFloat();
		float surface = (float) ((float) Math.pow(rayon, 2)*Math.PI);
		sc.close();
		return surface;
	}
}