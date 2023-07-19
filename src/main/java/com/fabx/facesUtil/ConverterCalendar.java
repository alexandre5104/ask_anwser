package com.fabx.facesUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "converterCalendar")
public class ConverterCalendar implements Converter<Calendar>{

	@Override
	public Calendar getAsObject(FacesContext context, UIComponent component, String value) {

		Calendar calendar = Calendar.getInstance();
		
		if (value == null) {
			return null;
		}
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = s.parse(value);
			calendar.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return calendar;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Calendar value) {

		if (value == null) {
			return null;
		}
		
		Calendar calendar = (Calendar) value;
		
		SimpleDateFormat s = new SimpleDateFormat("E, dd MMM yyyy");

		String dataPergunta = s.format(calendar.getTime());
		return dataPergunta;
	}

}
