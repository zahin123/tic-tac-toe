/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeactivity.example.tttgame.phase1;

/**
 *
 * @author nudratsaber
 */
public class ComputerPlayer {
 
    private String name;
    private String mark;
    
    public ComputerPlayer(String name, String mark) {
        this.setName(name);
        this.setMark(mark);
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
//        System.out.println("name");
        this.name = name;
    }
    
    String getMark() {
        return mark;
    }
    
    void setMark(String mark) {
        this.mark = mark;
    }
    
    public int randomNumber(int range) {
        return (int) (Math.random() * range);
    }
}