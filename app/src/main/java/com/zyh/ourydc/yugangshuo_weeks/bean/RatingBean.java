package com.zyh.ourydc.yugangshuo_weeks.bean;

/**
 * Created by zheng on 2018/3/25.
 */

public class RatingBean {


    /**
     * base : EUR
     * date : 2018-03-23
     * rates : {"AUD":1.5978,"BGN":1.9558,"BRL":4.0726,"CAD":1.5868,"CHF":1.1703,"CNY":7.7975,"CZK":25.405,"DKK":7.4478,"GBP":0.87285,"HKD":9.6889,"HRK":7.4398,"HUF":312.9,"IDR":16993,"ILS":4.2984,"INR":80.255,"ISK":122.1,"JPY":129.74,"KRW":1330.3,"MXN":22.88,"MYR":4.8365,"NOK":9.5715,"NZD":1.7024,"PHP":64.64,"PLN":4.2262,"RON":4.663,"RUB":70.539,"SEK":10.194,"SGD":1.6216,"THB":38.495,"TRY":4.888,"USD":1.2346,"ZAR":14.52}
     */

    public String base;
    public String date;
    public RatesBean rates;

    public static class RatesBean {
        /**
         * AUD : 1.5978
         * BGN : 1.9558
         * BRL : 4.0726
         * CAD : 1.5868
         * CHF : 1.1703
         * CNY : 7.7975
         * CZK : 25.405
         * DKK : 7.4478
         * GBP : 0.87285
         * HKD : 9.6889
         * HRK : 7.4398
         * HUF : 312.9
         * IDR : 16993
         * ILS : 4.2984
         * INR : 80.255
         * ISK : 122.1
         * JPY : 129.74
         * KRW : 1330.3
         * MXN : 22.88
         * MYR : 4.8365
         * NOK : 9.5715
         * NZD : 1.7024
         * PHP : 64.64
         * PLN : 4.2262
         * RON : 4.663
         * RUB : 70.539
         * SEK : 10.194
         * SGD : 1.6216
         * THB : 38.495
         * TRY : 4.888
         * USD : 1.2346
         * ZAR : 14.52
         */

        public double AUD;
        public double BGN;
        public double BRL;
        public double CAD;
        public double CHF;
        public double CNY;
        public double CZK;
        public double DKK;
        public double GBP;
        public double HKD;
        public double HRK;
        public double HUF;
        public double IDR;
        public double ILS;
        public double INR;
        public double ISK;
        public double JPY;
        public double KRW;
        public double MXN;
        public double MYR;
        public double NOK;
        public double NZD;
        public double PHP;
        public double PLN;
        public double RON;
        public double RUB;
        public double SEK;
        public double SGD;
        public double THB;
        public double TRY;
        public double USD;
        public double ZAR;
        public double EUR;
    }
}
