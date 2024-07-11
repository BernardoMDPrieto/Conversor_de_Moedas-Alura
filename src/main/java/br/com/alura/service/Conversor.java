package br.com.alura.service;

import java.util.Map;

public class Conversor {

    ApiService apiService = new ApiService();

    public double converter(String baseCode, String targetCode, double valor) {
        double exchangeRateate = apiService.getExchangeRate(baseCode, targetCode);

        return valor * exchangeRateate;
    }

    public Map<String, Double> getAvailableCurrencies(String baseCode) {
        return apiService.getAvailableCurrencies(baseCode);
    }
}
