package Ejercicio5;

import java.util.Scanner;

public class Main_Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Cuenta_Bancaria C1 = new Cuenta_Bancaria();
        Cuenta_Servicio S1 = new Cuenta_Servicio();

        int opcion;
        String salir = "";
        do {
            System.out.println("----MENU DE OPCIONES----");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Ingresar fondos");
            System.out.println("3. Retirar fondos");
            System.out.println("4. Extracción rápida (20%)");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos de la cuenta");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    C1.crearCuenta();
                    continue;
                case 2:
                    if (C1.getDNI() == 0 && C1.getNumeroCuenta() == 0) {
                        System.out.println("Usted no ha creado una cuenta todavia");
                        continue;
                    } else {
                        System.out.println("Digite la suma a ingresar en su cuenta");
                        double ingresar = sc.nextDouble();
                        S1.ingresar(C1, ingresar);
                        System.out.println("Desea continuar? Si- No");
                        sc.nextLine();
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                        if (salir.equals("no")) {
                            opcion = 7;
                            break;
                        }
                        continue;
                    }
                case 3:
                    // Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
                    if (C1.getDNI() == 0 && C1.getNumeroCuenta() == 0) {
                        System.out.println("Usted no ha creado una cuenta todavia");
                        break;
                    } else {
                        System.out.println("Digite la suma a retirar de su cuenta");
                        double retiro = sc.nextDouble();
                        S1.retirar(C1, retiro);
                        System.out.println("Desea continuar? Si- No");
                        sc.nextLine();
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                        if (salir.equals("no")) {
                            opcion = 7;
                            break;
                        }
                        continue;
                    }
                case 4:
//                    // Llamamos al método de extracción rapida
                    if (C1.getDNI() == 0 && C1.getNumeroCuenta() == 0) {
                        System.out.println("Usted no ha creado una cuenta todavia");
                        break;
                    } else {
                        S1.extraccionRapida(C1);
                        System.out.println("Desea continuar? Si- No");
                        sc.nextLine();
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                        if (salir.equals("no")) {
                            opcion = 7;
                            break;
                        }
                        break;
                    }
                case 5:
//                    // Consultamos el saldo
                    if (C1.getDNI() == 0 && C1.getNumeroCuenta() == 0) {
                        System.out.println("Usted no ha creado una cuenta todavia");
                        break;
                    } else {
                        S1.consultarSaldo(C1);
                    }
                    System.out.println("Desea continuar? Si- No");
                    sc.nextLine();
                    salir = sc.nextLine();
                    salir = salir.toLowerCase();
                    if (salir.equals("no")) {
                        opcion = 7;
                        break;
                    }
                    break;

                case 6:
//                    // Llamamos al metido de ver datos
                    if (C1.getDNI() == 0 && C1.getNumeroCuenta() == 0) {
                        System.out.println("Usted no ha creado una cuenta todavia");
                        break;
                    } else {
                        S1.consultarDatos(C1);
                        System.out.println("Desea continuar? Si- No");
                        sc.nextLine();
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                        if (salir.equals("no")) {
                            opcion = 7;
                            break;
                        }
                        break;
                    }
                case 7:
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    continue;
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
// Mensaje en caso de que falle
            }

        } while (opcion != 7);

    }



}
