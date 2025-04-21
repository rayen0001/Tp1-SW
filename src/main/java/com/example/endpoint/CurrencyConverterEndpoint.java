package com.example.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.example.currency.ConvertCurrencyRequest;
import com.example.currency.ConvertCurrencyResponse;

@Endpoint
public class CurrencyConverterEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/currency";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConvertCurrencyRequest")
    @ResponsePayload
    public ConvertCurrencyResponse convertCurrency(@RequestPayload ConvertCurrencyRequest request) {
        ConvertCurrencyResponse response = new ConvertCurrencyResponse();
        double conversionRate = 0.9; // Example conversion rate
        double convertedAmount = request.getAmount() * conversionRate;
        response.setConvertedAmount(convertedAmount);
        return response;
    }
}