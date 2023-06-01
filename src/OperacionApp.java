
public class OperacionApp {
	private int [] array;

	public OperacionApp(int[] array) {
		
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	public void contarEdades(int [] array) {
		int c=0,c1=0,c2=0;
		for(int i=0; i<array.length;i++) {
			if(array[i] >=65) {
				c ++;
			}else if(array[i]<18) {
				c1++;
			}else if(array[i]>=18) {
				c2++;
			}
		}
		System.out.println("Menores de edad " + c1 + " mayores de edad: " + c2 + " mayores de 65: " + c);
	}
}
