package view;

import controller.ThreadSapo;

public class Main {
	public static void main(String[] args) {
		ThreadSapo s1 = new ThreadSapo("Sapo1");
		ThreadSapo s2 = new ThreadSapo("Sapo2");
		ThreadSapo s3 = new ThreadSapo("Sapo3");
		ThreadSapo s4 = new ThreadSapo("Sapo4");
		ThreadSapo s5 = new ThreadSapo("Sapo5");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}
}
