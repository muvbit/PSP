package CINE_v21_Compra1EntradaThreads_JUANJO_ALBEROLA;

public class Client extends Thread {
private Cine cine;
public Client(Cine cine, String nombre) {
	this.cine=cine;
	super.setName(nombre);
}

@Override
public void run() {
	try {
	cine.compraEntradaPelicula();
	}catch(InterruptedException e) {
		System.out.println("["+Thread.currentThread().getName()+"] - ERROR: Fil interromput ");
	}
}

}
