package Encapsulacion;

public class Cuenta {
	 private String titular;
	    private double saldo;

	    public Cuenta(String titular, double saldo) {
	        this.titular = titular;
	        this.saldo = saldo;
	    }

	    public void depositar(double monto) {
	        if (monto > 0) {
	            saldo += monto;
	            System.out.println("Se depositaron Q" + monto);
	        } else {
	            System.out.println("El monto a depositar debe ser mayor que 0.");
	        }
	    }

	    public void retirar(double monto) {
	        if (monto > 0) {
	            if (saldo >= monto) {
	                saldo -= monto;
	                System.out.println("Se retiraron Q" + monto);
	            } else {
	                System.out.println("No se puede retirar esa cantidad. Saldo insuficiente.");
	            }
	        } else {
	            System.out.println("El monto a retirar debe ser mayor que 0.");
	        }
	    }

	    public void mostrarSaldo() {
	        System.out.println("Titular: " + titular);
	        System.out.println("Saldo final: Q" + saldo);
	    }

}
