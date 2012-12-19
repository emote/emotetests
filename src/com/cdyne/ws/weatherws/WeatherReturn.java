
/**
 * WeatherReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cdyne.ws.weatherws;
            

            /**
            *  WeatherReturn bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class WeatherReturn
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = WeatherReturn
                Namespace URI = http://ws.cdyne.com/WeatherWS/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Success
                        */

                        
                                    protected boolean localSuccess ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSuccess(){
                               return localSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Success
                               */
                               public void setSuccess(boolean param){
                            
                                            this.localSuccess=param;
                                    

                               }
                            

                        /**
                        * field for ResponseText
                        */

                        
                                    protected java.lang.String localResponseText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseTextTracker = false ;

                           public boolean isResponseTextSpecified(){
                               return localResponseTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResponseText(){
                               return localResponseText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseText
                               */
                               public void setResponseText(java.lang.String param){
                            localResponseTextTracker = param != null;
                                   
                                            this.localResponseText=param;
                                    

                               }
                            

                        /**
                        * field for State
                        */

                        
                                    protected java.lang.String localState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTracker = false ;

                           public boolean isStateSpecified(){
                               return localStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(java.lang.String param){
                            localStateTracker = param != null;
                                   
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for City
                        */

                        
                                    protected java.lang.String localCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityTracker = false ;

                           public boolean isCitySpecified(){
                               return localCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCity(){
                               return localCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param City
                               */
                               public void setCity(java.lang.String param){
                            localCityTracker = param != null;
                                   
                                            this.localCity=param;
                                    

                               }
                            

                        /**
                        * field for WeatherStationCity
                        */

                        
                                    protected java.lang.String localWeatherStationCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWeatherStationCityTracker = false ;

                           public boolean isWeatherStationCitySpecified(){
                               return localWeatherStationCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWeatherStationCity(){
                               return localWeatherStationCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WeatherStationCity
                               */
                               public void setWeatherStationCity(java.lang.String param){
                            localWeatherStationCityTracker = param != null;
                                   
                                            this.localWeatherStationCity=param;
                                    

                               }
                            

                        /**
                        * field for WeatherID
                        */

                        
                                    protected short localWeatherID ;
                                

                           /**
                           * Auto generated getter method
                           * @return short
                           */
                           public  short getWeatherID(){
                               return localWeatherID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WeatherID
                               */
                               public void setWeatherID(short param){
                            
                                            this.localWeatherID=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for Temperature
                        */

                        
                                    protected java.lang.String localTemperature ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTemperatureTracker = false ;

                           public boolean isTemperatureSpecified(){
                               return localTemperatureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTemperature(){
                               return localTemperature;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Temperature
                               */
                               public void setTemperature(java.lang.String param){
                            localTemperatureTracker = param != null;
                                   
                                            this.localTemperature=param;
                                    

                               }
                            

                        /**
                        * field for RelativeHumidity
                        */

                        
                                    protected java.lang.String localRelativeHumidity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelativeHumidityTracker = false ;

                           public boolean isRelativeHumiditySpecified(){
                               return localRelativeHumidityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRelativeHumidity(){
                               return localRelativeHumidity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RelativeHumidity
                               */
                               public void setRelativeHumidity(java.lang.String param){
                            localRelativeHumidityTracker = param != null;
                                   
                                            this.localRelativeHumidity=param;
                                    

                               }
                            

                        /**
                        * field for Wind
                        */

                        
                                    protected java.lang.String localWind ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWindTracker = false ;

                           public boolean isWindSpecified(){
                               return localWindTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWind(){
                               return localWind;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Wind
                               */
                               public void setWind(java.lang.String param){
                            localWindTracker = param != null;
                                   
                                            this.localWind=param;
                                    

                               }
                            

                        /**
                        * field for Pressure
                        */

                        
                                    protected java.lang.String localPressure ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPressureTracker = false ;

                           public boolean isPressureSpecified(){
                               return localPressureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPressure(){
                               return localPressure;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pressure
                               */
                               public void setPressure(java.lang.String param){
                            localPressureTracker = param != null;
                                   
                                            this.localPressure=param;
                                    

                               }
                            

                        /**
                        * field for Visibility
                        */

                        
                                    protected java.lang.String localVisibility ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVisibilityTracker = false ;

                           public boolean isVisibilitySpecified(){
                               return localVisibilityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVisibility(){
                               return localVisibility;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Visibility
                               */
                               public void setVisibility(java.lang.String param){
                            localVisibilityTracker = param != null;
                                   
                                            this.localVisibility=param;
                                    

                               }
                            

                        /**
                        * field for WindChill
                        */

                        
                                    protected java.lang.String localWindChill ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWindChillTracker = false ;

                           public boolean isWindChillSpecified(){
                               return localWindChillTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWindChill(){
                               return localWindChill;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WindChill
                               */
                               public void setWindChill(java.lang.String param){
                            localWindChillTracker = param != null;
                                   
                                            this.localWindChill=param;
                                    

                               }
                            

                        /**
                        * field for Remarks
                        */

                        
                                    protected java.lang.String localRemarks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemarksTracker = false ;

                           public boolean isRemarksSpecified(){
                               return localRemarksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRemarks(){
                               return localRemarks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Remarks
                               */
                               public void setRemarks(java.lang.String param){
                            localRemarksTracker = param != null;
                                   
                                            this.localRemarks=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ws.cdyne.com/WeatherWS/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":WeatherReturn",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "WeatherReturn",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Success", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Success cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localResponseTextTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "ResponseText", xmlWriter);
                             

                                          if (localResponseText==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ResponseText cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResponseText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "State", xmlWriter);
                             

                                          if (localState==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localState);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCityTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "City", xmlWriter);
                             

                                          if (localCity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("City cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWeatherStationCityTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "WeatherStationCity", xmlWriter);
                             

                                          if (localWeatherStationCity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WeatherStationCity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWeatherStationCity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "WeatherID", xmlWriter);
                             
                                               if (localWeatherID==java.lang.Short.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("WeatherID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWeatherID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDescriptionTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTemperatureTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Temperature", xmlWriter);
                             

                                          if (localTemperature==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Temperature cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTemperature);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRelativeHumidityTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "RelativeHumidity", xmlWriter);
                             

                                          if (localRelativeHumidity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RelativeHumidity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRelativeHumidity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWindTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Wind", xmlWriter);
                             

                                          if (localWind==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Wind cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWind);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPressureTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Pressure", xmlWriter);
                             

                                          if (localPressure==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Pressure cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPressure);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVisibilityTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Visibility", xmlWriter);
                             

                                          if (localVisibility==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Visibility cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localVisibility);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWindChillTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "WindChill", xmlWriter);
                             

                                          if (localWindChill==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WindChill cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWindChill);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemarksTracker){
                                    namespace = "http://ws.cdyne.com/WeatherWS/";
                                    writeStartElement(null, namespace, "Remarks", xmlWriter);
                             

                                          if (localRemarks==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Remarks cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRemarks);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://ws.cdyne.com/WeatherWS/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Success"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                             if (localResponseTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "ResponseText"));
                                 
                                        if (localResponseText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ResponseText cannot be null!!");
                                        }
                                    } if (localStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "State"));
                                 
                                        if (localState != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");
                                        }
                                    } if (localCityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "City"));
                                 
                                        if (localCity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("City cannot be null!!");
                                        }
                                    } if (localWeatherStationCityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "WeatherStationCity"));
                                 
                                        if (localWeatherStationCity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWeatherStationCity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WeatherStationCity cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "WeatherID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWeatherID));
                             if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        }
                                    } if (localTemperatureTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Temperature"));
                                 
                                        if (localTemperature != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemperature));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Temperature cannot be null!!");
                                        }
                                    } if (localRelativeHumidityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "RelativeHumidity"));
                                 
                                        if (localRelativeHumidity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelativeHumidity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RelativeHumidity cannot be null!!");
                                        }
                                    } if (localWindTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Wind"));
                                 
                                        if (localWind != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWind));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Wind cannot be null!!");
                                        }
                                    } if (localPressureTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Pressure"));
                                 
                                        if (localPressure != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPressure));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Pressure cannot be null!!");
                                        }
                                    } if (localVisibilityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Visibility"));
                                 
                                        if (localVisibility != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVisibility));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Visibility cannot be null!!");
                                        }
                                    } if (localWindChillTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "WindChill"));
                                 
                                        if (localWindChill != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWindChill));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WindChill cannot be null!!");
                                        }
                                    } if (localRemarksTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                                      "Remarks"));
                                 
                                        if (localRemarks != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemarks));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Remarks cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static WeatherReturn parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            WeatherReturn object =
                new WeatherReturn();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"WeatherReturn".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (WeatherReturn)com.cdyne.ws.weatherws.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Success").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Success" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","ResponseText").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ResponseText" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseText(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","State").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"State" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","City").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"City" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","WeatherStationCity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WeatherStationCity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWeatherStationCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","WeatherID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WeatherID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWeatherID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Description").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Description" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Temperature").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Temperature" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTemperature(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","RelativeHumidity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RelativeHumidity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRelativeHumidity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Wind").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Wind" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWind(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Pressure").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Pressure" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPressure(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Visibility").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Visibility" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVisibility(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","WindChill").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WindChill" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWindChill(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/","Remarks").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Remarks" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRemarks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    