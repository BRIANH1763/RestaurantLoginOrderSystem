/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author b-hou
 */
public class SuperClass_Parent {

    public double ChickenBurger;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double ChickenLegend;
    public double Filet_O_Fish;

    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;

    public double Meals;
    public double Drinks;
    public double TotalofMD;

    public double AllTotalofMD;

    public double GetAmount() {
        Meals = Filet_O_Fish + ChickenBurger + ChickenBurgerM + ChickenLegend + BaconCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;

    }
    private JFrame frame;

    public void iExitSystem() {
        frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Restaurant Management Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    //=========================
    public double pChickenBurger = 2.50;
    public double pChickenBurgerM = 4.00;
    public double pBaconCheeseBurger = 2.80;
    public double pChickenLegend = 2.50;
    public double pFilet_O_Fish = 2.70;

    public double pMilkShake = 2.00;
    public double pVanillaCone = 2.30;
    public double pClasVanilla = 2.09;
    public double pVanMilkShake = 1.80;
    public double pChocMilkShake = 2.00;

    //=========================
    public double mcTax = 0.90;

    public Double cFindTax(double cAmount) {
        double findTax = cAmount - (cAmount * mcTax);
        return findTax;
    }
}
