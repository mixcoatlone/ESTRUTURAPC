package CursoJava2020;

public class Aula90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vector = new String[] { "Bruno", "Michel", "Almeida" };
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		System.out.println();
		for (String exemplo : vector) {
			System.out.println(exemplo);
		}
	}

}
