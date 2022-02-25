package proyecto;

import javax.swing.JOptionPane;


public class Datos {

  

    static Lista lista = new Lista();
    static ListaT l = new ListaT();

    int num;
    //se llama la clase pilas 
    static Pilas A1 = new Pilas();
    static Pilas A2 = new Pilas();
    static Pilas A3 = new Pilas();
    static Pilas A4 = new Pilas();
    static Pilas A5 = new Pilas();
    static Pilas A6 = new Pilas();
    static Pilas A7 = new Pilas();
    static Pilas A8 = new Pilas();
    static Pilas N1 = new Pilas();
    static Pilas N2 = new Pilas();
    static Pilas N3 = new Pilas();
    static Pilas N4 = new Pilas();
    static Pilas N5 = new Pilas();
    static Pilas N6 = new Pilas();
    static Pilas N7 = new Pilas();
    static Pilas N8 = new Pilas();
    static Pilas V1 = new Pilas();
    static Pilas V2 = new Pilas();
    static Pilas V3 = new Pilas();
    static Pilas V4 = new Pilas();
    static Pilas V5 = new Pilas();
    static Pilas V6 = new Pilas();
    static Pilas V7 = new Pilas();
    static Pilas V8 = new Pilas();
    static Pilas B1 = new Pilas();
    static Pilas B2 = new Pilas();
    static Pilas B3 = new Pilas();
    static Pilas B4 = new Pilas();
    static Pilas B5 = new Pilas();
    static Pilas B6 = new Pilas();
    static Pilas B7 = new Pilas();
    static Pilas B8 = new Pilas();
     public Datos() {
        piles();
    }

    static public void piles() {//se crean los contenedores de las cuatro islas
        A1.apilar(1);
        A1.apilar(2);
        A1.apilar(3);
        A2.apilar(1);
        A2.apilar(2);
        A2.apilar(3);
        A3.apilar(1);
        A3.apilar(2);
        A3.apilar(3);
        A4.apilar(1);
        A4.apilar(2);
        A4.apilar(3);
        A5.apilar(1);
        A5.apilar(2);
        A5.apilar(3);
        A6.apilar(1);
        A6.apilar(2);
        A6.apilar(3);
        A7.apilar(1);
        A7.apilar(2);
        A7.apilar(3);
        A8.apilar(1);
        A8.apilar(2);
        A8.apilar(3);
        N1.apilar(1);
        N1.apilar(2);
        N1.apilar(3);
        N2.apilar(1);
        N2.apilar(2);
        N2.apilar(3);
        N3.apilar(1);
        N3.apilar(2);
        N3.apilar(3);
        N4.apilar(1);
        N4.apilar(2);
        N4.apilar(3);
        N5.apilar(1);
        N5.apilar(2);
        N5.apilar(3);
        N6.apilar(1);
        N6.apilar(2);
        N6.apilar(3);
        N7.apilar(1);
        N7.apilar(2);
        N7.apilar(3);
        N8.apilar(1);
        N8.apilar(2);
        N8.apilar(3);
        V1.apilar(3);
        V2.apilar(1);
        V2.apilar(2);
        V2.apilar(3);
        V3.apilar(1);
        V3.apilar(2);
        V3.apilar(3);
        V4.apilar(1);
        V4.apilar(2);
        V4.apilar(3);
        V5.apilar(1);
        V5.apilar(2);
        V5.apilar(3);
        V6.apilar(1);
        V6.apilar(2);
        V6.apilar(3);
        V7.apilar(1);
        V7.apilar(2);
        V7.apilar(3);
        V8.apilar(1);
        V8.apilar(2);
        V8.apilar(3);
        B1.apilar(3);
        B2.apilar(1);
        B2.apilar(2);
        B2.apilar(3);
        B3.apilar(1);
        B3.apilar(2);
        B3.apilar(3);
        B4.apilar(1);
        B4.apilar(2);
        B4.apilar(3);
        B5.apilar(1);
        B5.apilar(2);
        B5.apilar(3);
        B6.apilar(1);
        B6.apilar(2);
        B6.apilar(3);
        B7.apilar(1);
        B7.apilar(2);
        B7.apilar(3);
        B8.apilar(1);
        B8.apilar(2);
        B8.apilar(3);
    }

    public void verCont() {

        int op = Integer.parseInt(JOptionPane.showInputDialog("cual isla quiere ver" + "\n 1.Isla bananos  " + "\n 2.Isla frutas citricas" + "\n 3.Isla vegetales" + "\n 4.Isla Plantas"));
        switch (op) {
            case 1:
                System.out.println("posicion 1 bananos ");
                  
                A1.listar();
                lista.listar();
                System.out.println("posicion 2 bananos ");

                A2.listar();
                System.out.println("posicion 3 ba");

                A3.listar();
                System.out.println("posicion 4");

                A4.listar();
                System.out.println("posicion 5");

                A5.listar();
                System.out.println("posicion 6");

                A6.listar();
                System.out.println("posicion 7");

                A7.listar();
                System.out.println("posicion 8");

                A8.listar();
                break;
            case 2:
                System.out.println("posicion 1 frutas");
                N1.listar();
                System.out.println("posicion 2");
                N2.listar();
                System.out.println("posicion 3");
                N3.listar();
                System.out.println("posicion 4");
                N4.listar();
                System.out.println("posicion 5");
                N5.listar();
                System.out.println("posicion 6");
                N6.listar();
                System.out.println("posicion 7");
                N7.listar();
                System.out.println("posicion 8");
                N8.listar();
                break;
            case 3:

                System.out.println("posicion 1 vegetales");
                V1.listar();
                System.out.println("posicion 2");
                V2.listar();
                System.out.println("posicion 3");
                V3.listar();
                System.out.println("posicion 4");
                V4.listar();
                System.out.println("posicion 5");
                V5.listar();
                System.out.println("posicion 6");
                V6.listar();
                System.out.println("posicion 7");
                V7.listar();
                System.out.println("posicion 8");
                V8.listar();
                break;
            case 4:
                System.out.println("posicion 1 plantas");
                B1.listar();
                System.out.println("posicion 2 ");
                B2.listar();
                System.out.println("posicion 3 ");
                B3.listar();
                System.out.println("posicion 4");
                B4.listar();
                System.out.println("posicion 5");
                B5.listar();
                System.out.println("posicion 6");
                B6.listar();
                System.out.println("posicion 7");
                B7.listar();
                System.out.println("posicion 8");
                B8.listar();
break;
        }
    }

    public void Menu() {
        int Bienv = Integer.parseInt(JOptionPane.showInputDialog("------------MENU------------" + "'\n1. continuar  " + "\n 2.salir  "));
        while (Bienv != 2) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("------------MENU------------" + "'\n 1.ver las islas  " + "\n 2.agregar un contenedor  " + "\n 3.Taller" + "\n 4. Catalogo" + "\n 5. salir "));
            if (menu != 5) {
                switch (menu) {
                    case 1:
                    
                        verCont();
                        break;
                    case 2:
                      
                        agregCont();
                        break;
                    case 3:
                        Taller();
                        break;
                    case 4:
                        Catalogo();
                }
            }
        }
    }

    public void agregCont() {
      
        int op2 = Integer.parseInt(JOptionPane.showInputDialog("cual isla quiere ver" + "\n 1.Isla bananos  " + "\n 2.Isla frutas citricas" + "\n 3.Isla vegetales" + "\n 4.Isla Plantas"));
        switch (op2) {
            case 1:
                int cont = Integer.parseInt(JOptionPane.showInputDialog("cual posicion  quiere agregar "));
                int num = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de contenedor "));
                String Tip = JOptionPane.showInputDialog("Tipo de descricion ");
                String des = JOptionPane.showInputDialog("Tipo de descripcion ");
                String impo = JOptionPane.showInputDialog("de donde viene el contenedor  ");
                String fe = JOptionPane.showInputDialog("digite fecha  ");
                String aqi = JOptionPane.showInputDialog("digite  en que isla va estar el contenedor  ");
                if (cont == 1) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 1");
                    A1.apilar(num);
                    A1.listar();

                    lista.listar();
                }
                if (cont == 2) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 2");
                    A2.apilar(num);
                    A2.listar();

                }
                if (cont == 3) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));

                    A3.apilar(num);
                    A3.listar();
                }
                if (cont == 4) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 4");
                    A4.apilar(num);
                    A4.listar();
                }
                if (cont == 5) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 5");
                    A5.apilar(num);
                    A5.listar();
                }
                if (cont == 6) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 6");
                    A6.apilar(num);
                    A6.listar();
                }
                if (cont == 7) {

                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 7");
                    A7.apilar(num);
                    A7.listar();
                }
                if (cont == 8) {
                    lista.insertar(new Contenedor(num, Tip, des, impo, fe, aqi));
                    System.out.println("posicion 8");
                    A8.apilar(num);
                    A8.listar();
                }
                break;
            case 2:
                int c = Integer.parseInt(JOptionPane.showInputDialog("cual posicion  quiere agregar "));
                int nu = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de contenedor "));
                String Ti = JOptionPane.showInputDialog("Tipo de descricion ");
                String de = JOptionPane.showInputDialog("Tipo de descripcion ");
                String imp = JOptionPane.showInputDialog("de donde viene el contenedor  ");
                String f = JOptionPane.showInputDialog("digite fecha  ");
                String aq = JOptionPane.showInputDialog("digite  en que isla va estar el contenedor  ");
                if (c == 1) {

                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 1");
                    N1.apilar(nu);
                    N1.listar();

                    lista.listar();
                }
                if (c == 2) {

                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 2");
                    N2.apilar(nu);
                    N2.listar();

                }
                if (c == 3) {

                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 3");
                    N3.apilar(nu);
                    N3.listar();
                }
                if (c == 4) {
                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 4");
                    N4.apilar(nu);
                    N4.listar();
                }
                if (c == 5) {
                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 5");
                    N5.apilar(nu);
                    N5.listar();
                }
                if (c == 6) {

                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 6");
                    N6.apilar(nu);
                    N6.listar();
                }
                if (c == 7) {

                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 7");
                    N7.apilar(nu);
                    N7.listar();
                }
                if (c == 8) {
                    lista.insertar(new Contenedor(nu, Ti, de, imp, f, aq));
                    System.out.println("posicion 8");
                    N8.apilar(nu);
                    N8.listar();

                }

                break;

            case 3:
                int conte = Integer.parseInt(JOptionPane.showInputDialog("cual posicion  quiere agregar "));
                int n = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de contenedor "));
                String T = JOptionPane.showInputDialog("Tipo de descricion ");
                String d = JOptionPane.showInputDialog("Tipo de descripcion ");
                String im = JOptionPane.showInputDialog("de donde viene el contenedor  ");
                String fec = JOptionPane.showInputDialog("digite fecha  ");
                String aqu = JOptionPane.showInputDialog("digite  en que isla va estar el contenedor  ");
                if (conte == 1) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 1");
                    V1.apilar(n);
                    V1.listar();

                    lista.listar();
                }
                if (conte == 2) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 2");
                    V2.apilar(n);
                    V2.listar();

                }
                if (conte == 3) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 3");
                    V3.apilar(n);
                    V3.listar();
                }
                if (conte == 4) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 4");
                    V4.apilar(n);
                    V4.listar();
                }
                if (conte == 5) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 5");
                    V5.apilar(n);
                    V5.listar();
                }
                if (conte == 6) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 6");
                    V6.apilar(n);
                    V6.listar();
                }
                if (conte == 7) {

                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 7");
                    V7.apilar(n);
                    V7.listar();
                }
                if (conte == 8) {
                    lista.insertar(new Contenedor(n, T, d, im, fec, aqu));
                    System.out.println("posicion 8");
                    V8.apilar(n);
                    V8.listar();

                }
                break;
            case 4:
                int con = Integer.parseInt(JOptionPane.showInputDialog("cual posicion  quiere agregar "));
                int nm = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de contenedor "));
                String Te = JOptionPane.showInputDialog("Tipo de descricion ");
                String dp = JOptionPane.showInputDialog("Tipo de descripcion ");
                String imt = JOptionPane.showInputDialog("de donde viene el contenedor  ");
                String feca = JOptionPane.showInputDialog("digite fecha  ");
                String aquo = JOptionPane.showInputDialog("digite  en que isla va estar el contenedor  ");
                if (con == 1) {

                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 1");
                    B1.apilar(nm);
                    B1.listar();

                    lista.listar();
                }
                if (con == 2) {

                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 2");
                    B2.apilar(nm);
                    B2.listar();

                }
                if (con == 3) {

                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 3");
                    B3.apilar(nm);
                    B3.listar();
                }
                if (con == 4) {

                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 4");
                    B4.apilar(nm);
                    B4.listar();
                }
                if (con == 5) {
                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 5");
                    B5.apilar(nm);
                    B5.listar();
                }
                if (con == 6) {
                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 6");
                    B6.apilar(nm);
                    B6.listar();
                }
                if (con == 7) {

                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 7");
                    B7.apilar(nm);
                    B7.listar();
                }
                if (con == 8) {
                    lista.insertar(new Contenedor(nm, Te, dp, imt, feca, aquo));
                    System.out.println("posicion 8");
                    B8.apilar(nm);
                    B8.listar();
                    break;

                }

        }
    }

    public void Taller() {
            int o = Integer.parseInt(JOptionPane.showInputDialog("1. agregar al taller  "+"\n 2.ver el taller"));
        switch(o){
            case 1:
        int k = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de contenedor "));
        String j = JOptionPane.showInputDialog("Tipo de problema  ");
        String m = JOptionPane.showInputDialog("Tipo de descripcion ");

        l.insertar(new Taller(k, j, m));
        l.listar();
        break;
            case 2:
                l.listar();
    }
    }
    public void Catalogo() {
        lista.listar();

    }
}
