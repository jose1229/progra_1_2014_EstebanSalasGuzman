/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta1 
{
    private int N;
    private double A;
    private char C;

    public clsPregunta1() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ 2 nÃºmeros\n\n"
            + "El primero serÃ¡ tipo entero\n"
            + "El segundo serÃ¡ tipo decimal\n\n"
            + "AdemÃ¡s se le solicitarÃ¡ un caracter del teclado\n\n"
            + "Luego se le desplegarÃ¡ un menÃº");
        this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
        this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro nÃºmero: "));
        this.C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
    }
    
    private void cambiar(int i)
    {
        switch(i)
        {
            case 1:
            {
                this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
                this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro nÃºmero: "));
            }
            case 2:
            {
                this.C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
            }
        }
    }
    private double suma()
    {
        return (this.N+this.A);
    }
    private double resta()
    {
        if ((this.N-this.A)<0) 
        {
            return ((this.N-this.A)*-1);
        } else 
        {
            return (this.N-this.A);
        }
        
    }
    private int valorDec()
    {
        return (int)this.C;
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1- Ver suma\n"
                + "2- Ver diferencia (en la recta numÃ©rica)\n"
                + "3- Ver valor dec. del caracter\n"
                + "4- Cambiar nÃºmeros\n"
                + "5- Cambiar caracter\n"
                + "6- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "La suma de "+this.N+" y "+this.A+" es: "+suma());
                Menu();
                break;
            }
            case 2:
            {
                JOptionPane.showMessageDialog(null, "La diferencia entre "+N+" y "+A+" es: "+resta());
                Menu();
                break;
            }
            case 3:
            {
                JOptionPane.showMessageDialog(null,"El valor decimal de "+C+" es: "+valorDec());
                Menu();
                break;
            }
            case 4:
            {
                cambiar(1);
                Menu();
                break;
            }
            case 5:
            {
                cambiar(2);
                Menu();
                break;
            }
        }
    }
}
