
/**
 * WeatherMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.cdyne.ws.weatherws;

        /**
        *  WeatherMessageReceiverInOut message receiver
        */

        public class WeatherMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        WeatherSkeletonInterface skel = (WeatherSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getCityWeatherByLocation".equals(methodName)){
                
                com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse getCityWeatherByLocationResponse9 = null;
	                        com.cdyne.ws.weatherws.GetCityWeatherByLocation wrappedParam =
                                                             (com.cdyne.ws.weatherws.GetCityWeatherByLocation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.cdyne.ws.weatherws.GetCityWeatherByLocation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCityWeatherByLocationResponse9 =
                                                   
                                                   
                                                         skel.getCityWeatherByLocation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCityWeatherByLocationResponse9, false, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                    "getCityWeatherByLocation"));
                                    } else 

            if("getWeatherInformation".equals(methodName)){
                
                com.cdyne.ws.weatherws.GetWeatherInformationResponse getWeatherInformationResponse11 = null;
	                        com.cdyne.ws.weatherws.GetWeatherInformation wrappedParam =
                                                             (com.cdyne.ws.weatherws.GetWeatherInformation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.cdyne.ws.weatherws.GetWeatherInformation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getWeatherInformationResponse11 =
                                                   
                                                   
                                                         skel.getWeatherInformation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getWeatherInformationResponse11, false, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                    "getWeatherInformation"));
                                    } else 

            if("getCityWeatherByLocation2".equals(methodName)){
                
                com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response getCityWeatherByLocation2Response13 = null;
	                        com.cdyne.ws.weatherws.GetCityWeatherByLocation2 wrappedParam =
                                                             (com.cdyne.ws.weatherws.GetCityWeatherByLocation2)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.cdyne.ws.weatherws.GetCityWeatherByLocation2.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCityWeatherByLocation2Response13 =
                                                   
                                                   
                                                         skel.getCityWeatherByLocation2(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCityWeatherByLocation2Response13, false, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                    "getCityWeatherByLocation2"));
                                    } else 

            if("getCityForecastByZIP".equals(methodName)){
                
                com.cdyne.ws.weatherws.GetCityForecastByZIPResponse getCityForecastByZIPResponse15 = null;
	                        com.cdyne.ws.weatherws.GetCityForecastByZIP wrappedParam =
                                                             (com.cdyne.ws.weatherws.GetCityForecastByZIP)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.cdyne.ws.weatherws.GetCityForecastByZIP.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCityForecastByZIPResponse15 =
                                                   
                                                   
                                                         skel.getCityForecastByZIP(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCityForecastByZIPResponse15, false, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/",
                                                    "getCityForecastByZIP"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityWeatherByLocation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetWeatherInformation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetWeatherInformation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetWeatherInformationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetWeatherInformationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityWeatherByLocation2 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocation2.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityForecastByZIP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityForecastByZIP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.cdyne.ws.weatherws.GetCityForecastByZIPResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.cdyne.ws.weatherws.GetCityForecastByZIPResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse wrapGetCityWeatherByLocation(){
                                com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse wrappedElement = new com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.cdyne.ws.weatherws.GetWeatherInformationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.cdyne.ws.weatherws.GetWeatherInformationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.cdyne.ws.weatherws.GetWeatherInformationResponse wrapGetWeatherInformation(){
                                com.cdyne.ws.weatherws.GetWeatherInformationResponse wrappedElement = new com.cdyne.ws.weatherws.GetWeatherInformationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response wrapGetCityWeatherByLocation2(){
                                com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response wrappedElement = new com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.cdyne.ws.weatherws.GetCityForecastByZIPResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.cdyne.ws.weatherws.GetCityForecastByZIPResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.cdyne.ws.weatherws.GetCityForecastByZIPResponse wrapGetCityForecastByZIP(){
                                com.cdyne.ws.weatherws.GetCityForecastByZIPResponse wrappedElement = new com.cdyne.ws.weatherws.GetCityForecastByZIPResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.cdyne.ws.weatherws.GetCityWeatherByLocation.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityWeatherByLocation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityWeatherByLocationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetWeatherInformation.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetWeatherInformation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetWeatherInformationResponse.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetWeatherInformationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetCityWeatherByLocation2.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityWeatherByLocation2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityWeatherByLocation2Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetCityForecastByZIP.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityForecastByZIP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.cdyne.ws.weatherws.GetCityForecastByZIPResponse.class.equals(type)){
                
                           return com.cdyne.ws.weatherws.GetCityForecastByZIPResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    