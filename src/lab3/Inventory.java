/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Skybeorn
 */
public class Inventory {

    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];

    public void addPart(String pNum, String pDesc, double price, int emptySlot){
        partNums [emptySlot] = pNum;
        partDescs [emptySlot] = pDesc;
        partPrices [emptySlot] = price;
        
    }
}
