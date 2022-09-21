import java.util.Date;
package Lab9;

public class Visit {
		private Customer customer;
		private Date date;
		private double serviceExpense;
		private double productExpense;
		
		public Visit(String name, Date date) {
		this.customer = new Customer(name);
		this.date = date;
		}
		
		public String getName() {
		return customer.getName();
		}
		
		public double getServiceExpense() {
		return serviceExpense;
		}
		
		public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
		}
		
		public double getProductExpense() {
		return productExpense;
		}
		
		public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
		}
		
		public double getTotalExpense() {
		return serviceExpense + productExpense;
		}

		@Override
		public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
		+ ", productExpense=" + productExpense + "]";
		}

		}


