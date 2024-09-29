package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    // Constructor con fecha de caducidad
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    // Implementación del método abstracto getSpecificData()
    @Override
    public String getSpecificData() {
        // Formateador para la fecha de caducidad
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(expirationDate);

        // Composición del String con la información requerida
        StringBuilder builder = new StringBuilder();
        builder.append("Location: ").append(getLocation()).append("\n");
        builder.append("Expiration Date: ").append(formattedDate);

        return builder.toString();
    }

    // Método para imprimir los datos específicos
    public Object printSpecificData() {
        System.out.println(getSpecificData());
        return null;
    }
    public String getFormattedDate(Date expirationDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(expirationDate);
    }

    // Getters y Setters para la fecha de caducidad (opcional)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


}


