package util;

import java.util.Date;

public class WeatherReading {
    //    private instance variables:
    //    public instance methods:
private Date recordedAt;
    //    getters and
    //    setters

    private double latitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private double longitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private double tempInCelsius;

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public void setTempInCelsius(double tempInKelvin) {
        this.tempInCelsius = kelvinToCelsius(tempInKelvin);
    }


    //    public static method:

//    kelvinToCelsius -
//    takes in
//    a
//    double and
//    returns a
//    double,
//    converting temp
//    from Kelvin
//    to Celsius


public static double kelvinToCelsius(double celsius) {
    return celsius - 273;
}





//    for
//    the setter for tempInCelsius,
//    pass the
//    input into
//    the kelvinToCelsius
//    method and
//    assign the
//    output to this.tempInCelsius

//    add a
//    constructor that
//    sets all
//    fields

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = kelvinToCelsius(tempInKelvin);
    }
//    when setting
//    the tempInCelsius
//    pass the
//    input into
//    the kelvinToCelsius
//    method and
//    assign the
//    output to this.tempInCelsius

//    Add the
//    following main
//    method to
//    test it
//    out:

    public static void main(String[] args) {

        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());

    }
}