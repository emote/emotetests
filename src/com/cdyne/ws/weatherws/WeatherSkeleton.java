
/**
 * WeatherSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.cdyne.ws.weatherws;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *  WeatherSkeleton java skeleton for the axisService
 */
public class WeatherSkeleton implements WeatherSkeletonInterface{


    /**
     * Auto generated method signature
     * Allows you to get your City's Weather, which is updated hourly. U.S. Only
     * @param getCityWeatherByLocation0
     * @return getCityWeatherByLocationResponse1
     */

    public com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse getCityWeatherByLocation
    (
        com.cdyne.ws.weatherws.GetCityWeatherByLocation getCityWeatherByLocation0
    )
    {
        String state = getCityWeatherByLocation0.getParameters().getState();
        String city = getCityWeatherByLocation0.getParameters().getCity();

        GetCityWeatherByLocationResponse resp = new GetCityWeatherByLocationResponse();
        GetCityWeatherByLocationResponseType weather = new GetCityWeatherByLocationResponseType();
        WeatherReturn result = new WeatherReturn();
        weather.setGetCityWeatherByLocationResult(result);

        resp.setWeather(weather);
        if ("CA".equals(state) && "Oakland".equals(city))
        {
            result.setCity("Oakland");
            result.setDescription("Cloudy");
            result.setPressure("Heavy");
            result.setRelativeHumidity("Muggy");
            result.setState("CA");
            result.setSuccess(true);
            result.setTemperature("62");
            result.setWeatherStationCity("Oakland");
            resp.setReliability(75);
        }
        else
        {
            resp.setReliability(0);
            result.setRemarks("Unknown location");
            result.setSuccess(false);
        }

        return resp;
    }


    /**
     * Auto generated method signature
     * Gets Information for each WeatherID
     * @param getWeatherInformation2
     * @return getWeatherInformationResponse3
     */

    public com.cdyne.ws.weatherws.GetWeatherInformationResponse getWeatherInformation
    (
        com.cdyne.ws.weatherws.GetWeatherInformation getWeatherInformation2
    )
    {
        //TODO : fill this with the necessary business logic
        throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getWeatherInformation");
    }


    /**
     * Auto generated method signature
     * Allows you to get your City's Weather, which is updated hourly. U.S. Only
     * @param getCityWeatherByLocation24
     * @return getCityWeatherByLocation2Response5
     */

    public com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response getCityWeatherByLocation2
    (
        com.cdyne.ws.weatherws.GetCityWeatherByLocation2 getCityWeatherByLocation24
    )
    {
        String state = getCityWeatherByLocation24.getParameters().getState();
        String city = getCityWeatherByLocation24.getParameters().getCity();

        GetCityWeatherByLocation2Response resp = new GetCityWeatherByLocation2Response();
        GetCityWeatherByLocationResponse2Type weather = new GetCityWeatherByLocationResponse2Type();
        WeatherReturn result = new WeatherReturn();
        weather.setGetCityWeatherByLocationResult(result);

        resp.setParameters(weather);
        if ("CA".equals(state) && "Oakland".equals(city))
        {
            result.setCity("Oakland");
            result.setDescription("Cloudy");
            result.setPressure("Heavy");
            result.setRelativeHumidity("Muggy");
            result.setState("CA");
            result.setSuccess(true);
            result.setTemperature("62");
            result.setWeatherStationCity("Oakland");
        }
        else
        {
            result.setRemarks("Unknown location");
            result.setSuccess(false);
        }

        return resp;
    }


    /**
     * Auto generated method signature
     * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
     * @param getCityForecastByZIP6
     * @return getCityForecastByZIPResponse7
     */

    public com.cdyne.ws.weatherws.GetCityForecastByZIPResponse getCityForecastByZIP
    (
        com.cdyne.ws.weatherws.GetCityForecastByZIP getCityForecastByZIP6
    )
    {
        String zip = getCityForecastByZIP6.getZIP();
        GetCityForecastByZIPResponse resp = new GetCityForecastByZIPResponse();
        ForecastReturn ret;
        if ("94612".equals(zip))
        {
            Forecast[] forecasts = new Forecast[]
                {
                    makeForecast(
                        new GregorianCalendar(2012, 11, 14),
                        (short)0, "cloudy", makeTemp("60", "70"), makePOP("10", "5")),
                    makeForecast(
                        new GregorianCalendar(2012, 11, 15),
                        (short)1, "partly cloudy", makeTemp("65", "75"), makePOP("5", "0")),
                    makeForecast(
                        new GregorianCalendar(2012, 11, 16),
                        (short)1, "sunny", makeTemp("55", "80"), makePOP("0", "0")),

                };
            ret = makeForecastReturn(true, "AMA Data", "CA", "Oakland", "Emeryville", forecasts);
        }
        else
        {
            ret = makeForecastReturn(false, "Unknown ZIP", null, null, null, new Forecast[0]);
        }

        resp.setGetCityForecastByZIPResult(ret);
        return resp;
}

    private static Temp makeTemp(String low, String high)
    {
        Temp temp = new Temp();
        temp.setDaytimeHigh(high);
        temp.setMorningLow(low);

        return temp;
    }

    private static POP makePOP(String night, String day)
    {
        POP pop = new POP();
        pop.setDaytime(day);
        pop.setNighttime(night);

        return pop;
    }

    private static Forecast makeForecast(Calendar date, short id, String desc, Temp temp, POP pop)
    {
        Forecast forecast = new Forecast();
        forecast.setDate(date);
        forecast.setWeatherID(id);
        forecast.setDesciption(desc);
        forecast.setTemperatures(temp);
        forecast.setProbabilityOfPrecipiation(pop);

        return forecast;
    }

    private static ForecastReturn makeForecastReturn(boolean success, String text, String state, String city, String station,
                                                     Forecast[] forecasts)
    {
        ForecastReturn fr = new ForecastReturn();
        fr.setSuccess(success);
        fr.setResponseText(text);
        fr.setState(state);
        fr.setCity(city);
        fr.setWeatherStationCity(station);
        ArrayOfForecast array = new ArrayOfForecast();
        array.setForecast(forecasts);
        fr.setForecastResult(array);

        return fr;
    }
}
    