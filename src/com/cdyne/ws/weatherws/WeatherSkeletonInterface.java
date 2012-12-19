
/**
 * WeatherSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.cdyne.ws.weatherws;
    /**
     *  WeatherSkeletonInterface java skeleton interface for the axisService
     */
    public interface WeatherSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * Allows you to get your City's Weather, which is updated hourly. U.S. Only
                                    * @param getCityWeatherByLocation
         */

        
                public com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse getCityWeatherByLocation
                (
                  com.cdyne.ws.weatherws.GetCityWeatherByLocation getCityWeatherByLocation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Gets Information for each WeatherID
                                    * @param getWeatherInformation
         */

        
                public com.cdyne.ws.weatherws.GetWeatherInformationResponse getWeatherInformation
                (
                  com.cdyne.ws.weatherws.GetWeatherInformation getWeatherInformation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Allows you to get your City's Weather, which is updated hourly. U.S. Only
                                    * @param getCityWeatherByLocation2
         */

        
                public com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response getCityWeatherByLocation2
                (
                  com.cdyne.ws.weatherws.GetCityWeatherByLocation2 getCityWeatherByLocation2
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
                                    * @param getCityForecastByZIP
         */

        
                public com.cdyne.ws.weatherws.GetCityForecastByZIPResponse getCityForecastByZIP
                (
                  com.cdyne.ws.weatherws.GetCityForecastByZIP getCityForecastByZIP
                 )
            ;
        
         }
    