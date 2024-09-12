package br.com.smartweb.ticketmachine;

public class TicketMachine {
	
		private int price;
		private int balance;
		private int total;
		
		


		public void printTicket () {
			
		System.out.println("#########");
		System.out.println("# The BlueJ line");
		System.out.println("#Ticket");
		System.out.println("#"+price + "cents.");
		System.out.println("#########");
		
		total = total + balance;
		balance = 0;

	}
		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}


		public int getTotal() {
			return total;
		}


		public void setTotal(int total) {
			this.total = total;
		}


		public TicketMachine(int price, int balance, int total) {
			super();
			this.price = price;
			this.balance = balance;
			this.total = total;
		}
		
		@Override
		public String toString() {
			return "TicketMachine [price=" + price + ", balance=" + balance + ", total=" + total + "]";
		}

}
