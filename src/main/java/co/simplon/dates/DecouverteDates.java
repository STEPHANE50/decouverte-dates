package co.simplon.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.RequestingUserName;

public class DecouverteDates {

	public DecouverteDates() {
		super();
	}

	public boolean estInferieurDateCourante(Date date) {
		Date aujourdhui = new Date();
		return (date.compareTo(aujourdhui) == -1);
	}

	public Date construireDate(String chaineFournie) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.parse(chaineFournie);
			
	}
	public Date augmenterDate(Date dateInitiale, int nombreJours, int nombreHeures, int nombreMinutes) {
		// TODO
		throw new RuntimeException("à implémenter");
	}

	public String formaterUneDate(Date date) {
		return null;
		
	}

	public String formaterUneHeure(Date time) {
		// TODO
		return "";
	}

	public String formaterDateEnFrancais(Date date) {
		// TODO
		return "";
	}
}
