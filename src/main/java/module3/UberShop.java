package module3;

import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2f;
            } else {
                prices[i] *= 1.5f;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }
        int min = prices[0];
        int max = prices[0];
        for (int price : prices) {
            if (price > max) {
                max = price;
            }
            if (price < min) {
                min = price;
            }
        }
        if (min == max) {
            return new int[]{min};
        }
        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        int[] priceZero = new int[]{0};
        if (prices.length == 0) {
            return priceZero[0];
        }
        Arrays.sort(prices);
        int coutner = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == prices[0]) {
                coutner++;
            }
        }
        return coutner;
    }

    public int[] removePrice(int[] prices, int toRemove) {

        int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                counter++;
            }
        }
        int[] changePrices = new int[prices.length - counter];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                changePrices[j] = prices[i];
                j++;
            }
        }
        return changePrices;
    }

    public int[] leavePrice9(int[] prices) {
        int a = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 != 9) {
                a++;
            }
        }
        int[] priceEnding9 = new int[prices.length - a];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                priceEnding9[j] = prices[i];
                j++;
            }
        }
        return priceEnding9;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        String[] concatenteArrays = new String[showcaseStocks.length + warehouseStocks.length];
        int index = 0;
        for (String stock : showcaseStocks) {
            concatenteArrays[index] = stock;
            index++;
        }
        for (String stock : warehouseStocks) {
            concatenteArrays[index] = stock;
            index++;
        }
        return concatenteArrays;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int result = 0;
        for (int i = 0; i <prices.length ; i++) {
            if(minPrice <= prices[i] & prices[i] <=maxPrice){
                result += prices[i];

            }
        }return result;
    }



    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [200, 2250]
//        float[] prices = new float[] {100f, 1500f};
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));

//        //Should be [50, 1500]
//        int[] prices = new int[]{100, 1500, 300, 50};
//        int[] minMax = shop.findMinMaxPrices(prices);
//        System.out.println(Arrays.toString(minMax));

//        //Should be [50, 1500]
//        int[] prices = new int[]{100, 1500, 300, 50, 10, 10, 70};
//        System.out.println(shop.getMinPriceCount(prices)); //Should be 2

        //Should be [150, 200]
//        int[] prices = new int[]{150, 100,100,100,100,100,100, 200};
//        int toRemove = 100;
//        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

        //Should be [1599, 399]
//        int[] prices = new int[]{399, 1599, 399, 50, 10, 10, 70};
//        System.out.println(Arrays.toString(shop.leavePrice9(prices)));

//        //Final result should be ["gun", "firebow", "firegun"]
//        String[] showcaseStocks = new String[]{"Nuhivoqoo", "Ofruxies", "Gefos", "kam", "Nynonoj"};
//        String[] warehouseStocks = new String[]{"Zugyepe", "Quivnikew", "Vewe", "holuf", "Surizap"};
//        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 700, 50, 500};
        System.out.println(shop.getPricesSum(prices, 10, 50));
    }

}
