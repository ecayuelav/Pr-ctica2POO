package sessió1;

public class Codi {
	int identificador, tipus;
	public static final int perill=1;
	public static final int reglamentació=2;
	public static final int indicació=3;
	
	public Codi(int identificador, int tipus) {
		this.identificador=identificador;
		this.tipus=tipus;
	}
	
	public Codi(int identificador) {
		this.identificador=identificador;
		this.tipus=3;
	}
	
	
	public int getIdentificador() {return(identificador);}
	public void setIdentificador(int n) {
		if(n>9999||n<1000) {
			identificador=n;
		}
	}
	
	public void setTipus(int n) {
		if(n>=0&&n<=3) {
			tipus=n;
		}
	}
	
	public String getTipus() {
		String tipstr;
		switch(tipus) {
		case 1: tipstr="perill"; break;
		case 2: tipstr="reglamentació"; break;
		case 3: tipstr="reglamentació"; break;
		default: tipstr="";
		}
		return(tipstr);
	}
	
	public boolean equals(Codi c) {
		if(this.getTipus().equals(c.getTipus())&&this.getIdentificador()==c.getIdentificador()) {
			return(true);
		}
		else {
			return(false);
		}
	}

	
}
