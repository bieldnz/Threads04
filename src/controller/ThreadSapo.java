package controller;

public class ThreadSapo extends Thread{
	
	String nome;
	
	public ThreadSapo(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run() {
		int salto = 0;
		
		while(salto <= 10000) {
			salto = salto + (int)(Math.random()*1000);
		}
		
		int tid = (int)threadId();
		
		
		if(tid == 29) {
			long sl = 2000;
			try {
				sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("1º "+nome);
		}else if(tid == 30) {
			long sl = 2000;
			try {
				sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("2º "+nome);
		}else if(tid == 31) {
			long sl = 4000;
			try {
				sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("3º "+nome);
		}else if(tid == 32) {
			long sl = 6000;
			try {
				sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("4º "+nome);
		}else if(tid == 33) {
			long sl = 8000;
			try {
				sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("5º "+nome);
		}
		
	}
	
}
