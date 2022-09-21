import java.util.Date;
package Lab9;

public class CustomerDriver {

	public static void main(String[] args) {
			Visit visit = new Visit("Jackey Jose", new Date());
			visit.setProductExpense(1999);
			visit.setServiceExpense(90865);
			System.out.println(visit);
			System.out.println("Total expense: " + visit.getTotalExpense());
			}
	}


