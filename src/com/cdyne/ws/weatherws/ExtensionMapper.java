
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.cdyne.ws.weatherws;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "WeatherReturn".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.WeatherReturn.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "GetCityWeatherByLocationResponse2Type".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse2Type.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "ArrayOfWeatherDescription".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.ArrayOfWeatherDescription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "ForecastReturn".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.ForecastReturn.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "GetCityWeatherByLocationResponseType".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.GetCityWeatherByLocationResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "ArrayOfForecast".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.ArrayOfForecast.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "GetCityWeatherByLocation2Type".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.GetCityWeatherByLocation2Type.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "POP".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.POP.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "WeatherDescription".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.WeatherDescription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "GetCityWeatherByLocationType".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.GetCityWeatherByLocationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "Forecast".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.Forecast.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.cdyne.com/WeatherWS/".equals(namespaceURI) &&
                  "temp".equals(typeName)){
                   
                            return  com.cdyne.ws.weatherws.Temp.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    