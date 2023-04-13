package Controller;

import br.com.mary.pilhaint.Pilha;

public class FatController {
	int v;
	int f=1;
	public FatController(int v) {
		this.v=v;
		System.out.println(v);
		Pilha p = new Pilha();
		boolean vazia =p.isEmpty();
		System.out.println(vazia);
		if(v==0 || v==1) {
			System.out.println(" o fatorial  e 1");
		}else {
			for (int i=1; i <= v; i++) {
				f = f * i;
				p.push(f);
				
				
		}
			try {
				int j =p.exibir();
				System.out.println(" fatorial de "+ v + " é " + j);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
		int j =p.size();
		for(int i=0; i< j;i++) {
			try {
				p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			}
	}
}
