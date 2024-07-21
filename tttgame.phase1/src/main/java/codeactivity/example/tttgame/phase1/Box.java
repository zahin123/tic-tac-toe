/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeactivity.example.tttgame.phase1;

/**
 *
 * @author nudratsaber
 */
class Box {
 
    private int row;
    private int col;
    private final static String DASH = "-";
    private String placeHolder = Box.DASH;
    
    Box(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    String getPlaceHolder() {
        return placeHolder;
    }
    
    boolean setPlaceHolder(String placeHolder) {
        if(isAvailable()) {
            this.placeHolder = placeHolder;
            return true;
        }
        return false;
    }
    
    boolean isAvailable() {
        return this.placeHolder.equals(Box.DASH);
    }
 
    void print() {
        //System.out.println("row:" + row + " col:" + col + " placeholder:" + placeHolder);
        System.out.print(placeHolder + " ");
    }
}