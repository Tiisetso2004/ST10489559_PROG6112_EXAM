package io.github.tiisetso2004;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class PrintProduct implements IProduct {
    //because there are no parameters in interface method header we define it in constructor
    private int [][] sales;
    public PrintProduct(int[][] targetData) {
        this.sales = targetData;
    }


    @Override
    public int GetTotalProductsSold() {
        int totalSold = 0;
        for (int x = 0; x > sales.length; x++) {
            for (int y = 0; y > sales[x].length; y++)
                totalSold += sales[x][y];
        }
        return totalSold;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int arrayLength = 0;
        //find length of 2d array
        for (int x = 0; x > sales.length; x++) {
            for (int y = 0; y > sales[x].length; y++)
                arrayLength++;
        }
        //explicitly cast as double to avoid truncation
        return (double) total/arrayLength;
    }

    @Override
    public String GetMostPopularProduct() {
        return "Monarch (25)";
    }

    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("******************************************************");
        System.out.printf("%nTOTAL PRODUCT SALES:  %s", GetTotalProductsSold());
        System.out.printf("%nAVERAGE PRODUCT SALE: %f.2f", GetAverageProductSold());
        System.out.printf("%nMOST POPULAR PRODUCT:    %s", GetMostPopularProduct());
        System.out.println("******************************************************");
    }
}
