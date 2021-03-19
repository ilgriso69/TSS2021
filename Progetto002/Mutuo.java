import java.math.BigDecimal;

public class Mutuo {
	
	private BigDecimal capitale, interesse;
	private int anni;
	
	Mutuo (String _cap, String _int, int _anni){
		capitale = new BigDecimal(_cap);
		interesse = new BigDecimal(_int);
		anni = _anni;
	}
	
	
	BigDecimal importoTotale() {
		
		BigDecimal interesse2 = interesse.divide(new BigDecimal("100"));
		BigDecimal anni2 = (new BigDecimal(anni));
		
		//ImportoTotale=capitale+capitale*interesse*anni
		
		return capitale.add(capitale.multiply(interesse2).multiply(anni2));
		
	}
	

}
