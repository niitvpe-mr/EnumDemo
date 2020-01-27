/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author NIIT CR
 */

enum COLORS {RED,GREEN,BLUE,ORANGE,PUPRLE,BLACK,WHITE};    
public class EnumDemo {

void showColor(COLORS color)
{
    switch(color){
        case RED:
                System.out.println("You chose red color");
                break;
        case BLACK:
                System.out.println("You chose black color");
                break;
        case BLUE:
                System.out.println("You chose blue color");
                break;
        case GREEN:
                System.out.println("You chose green color");
                break;
        case ORANGE:
                System.out.println("You chose orange color");
                break;
        case PUPRLE:
                System.out.println("You chose purple color");
                break;
        case WHITE:
                System.out.println("You chose white color");
                break;
    }

}
    void showColors()
    {
        for(COLORS color:COLORS.values())
        {
            System.out.println(color);
        }
    }
    public static void main(String[] args) {
        EnumDemo enumDemo=new EnumDemo();
       // enumDemo.showColor(COLORS.PUPRLE);
       enumDemo.showColors();
    }
    
}
