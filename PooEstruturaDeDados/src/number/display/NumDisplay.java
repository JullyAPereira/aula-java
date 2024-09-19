package number.display;

public class NumDisplay {

	
		private int limit;
		private int value;
		
		
		public int getLimit() {
			return limit;
		}
		public void setLimit(int limit) {
			this.limit = limit;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public NumDisplay(int limit, int value) {
			super();
			this.limit = limit;
			this.value = value;
			
			
			System.out.println();
		}


}