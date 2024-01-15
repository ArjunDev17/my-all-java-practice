package com.sorting.quic.sort;


class Account {
	private int bal;

	public Account(int bal) {
		this.bal = bal;
	}

	public int getBal() {
		return bal;
	}
//java.lang.IllegalMonitorStateException: if we not use synchronized
	public synchronized void withdraw(int amount) {
		if (amount > bal) {
			System.out.println("Less Bal :");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		bal -= amount;
		System.out.println("Withdraw Done ....");
		System.out.println("Current bal " + getBal());
	}

	public synchronized void deposite(int amount) {
		System.out.println("Going to deposite :");
		bal += amount;
		notify();
	}
}

public class InterThedComm {
	public static void main(String[] args) {
		Account a = new Account(5000);
		new Thread() {
			public void run() {
				a.withdraw(6000);
			}
		}.start();
		new Thread() {
			public void run() {
				a.deposite(3000);
				;
			}
		}.start();
	}

}
