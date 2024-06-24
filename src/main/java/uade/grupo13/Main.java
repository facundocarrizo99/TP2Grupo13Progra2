package uade.grupo13;

import uade.grupo13.Conjunto.*;
import uade.grupo13.Diccionario.Diccionario;
import uade.grupo13.Lista.Lista;
import uade.grupo13.Nodo.Nodo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //          Ejercicios de conjunto          //
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();
        conjunto1.agregar(1);
        conjunto1.agregar(6);
        conjunto1.agregar(8);
        conjunto2.agregar(2);
        conjunto2.agregar(6);
        conjunto2.agregar(8);


        if(iguales(conjunto1,conjunto2)){
            System.out.println("Los conjuntos son iguales");
        }
        else{
            System.out.println("Los conjuntos son diferentes");
        }
        Conjunto conjuntoC =Union(conjunto1,conjunto2);
        Nodo aux= conjuntoC.getPrimero();
        while(aux!=null){
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
        System.out.println("");

        Conjunto conjuntoC2= Insercion(conjunto1,conjunto2);

        Nodo aux2= conjuntoC2.getPrimero();
        while(aux2!=null){
            System.out.println(aux2.getInfo());
            aux2 = aux2.getSig();
        }

        //          Ejercicios de Diccionarios          //

        /** Generamos un Diccionario para hacer las pruebas
         *  con claves del 1 al 20 y
         *  con valores del 10 al 200 respectivamente (De 10 en 10)
         */
        Diccionario diccPrueba = new Diccionario();
        for (int i = 1; i <= 20; i++) {
            diccPrueba.agregar(i,i * 10);
        }

        // creamos una lista con las claves pares para probar el metodo //
        Lista clavesPares = Diccionario.clavesPares(diccPrueba);
        System.out.println("/n Lista de las claves Pares: ");
        for (int i = 0; i < clavesPares.size(); i ++) {
            System.out.println("Clave: " + clavesPares.get(i));
        }

        // creamos una lista con los valores mayores a 50  //
        Lista listaPrueba = Diccionario.valoresMayoresA(50, diccPrueba);
        System.out.println("/n Lista de los valores mayores a 50: ");
        for (int i = 0; i < listaPrueba.size(); i ++) {
            System.out.println("Valor " + i + ": "  + clavesPares.get(i));
        }
    }

    //              Metodos de Conjuntos                //
    public static Boolean iguales(Conjunto conjunto1,Conjunto conjunto2){
        if(conjunto1.cardinal()!= conjunto2.cardinal()){
            return false;
        }
        Nodo aux = conjunto1.getPrimero();
        while(aux!=null){
            if(!conjunto2.pertenece(aux.getInfo())){
                return false;
            }
            aux = aux.getSig();
        }
        return true;
    }
    public static Conjunto Union(Conjunto conjunto1,Conjunto conjunto2){
        Conjunto conjuntoC= new Conjunto();
        Nodo aux= conjunto1.getPrimero();
        while(aux!=null){
            conjuntoC.agregar(aux.getInfo());
            aux =aux.getSig();

        }
        Nodo aux2 = conjunto2.getPrimero();
        while(aux2!=null){
            if(!(conjunto1.pertenece(aux2.getInfo()))){
                conjuntoC.agregar(aux2.getInfo());
            }
            aux2 =aux2.getSig();
        }
        return conjuntoC;

    }
    public static Conjunto Insercion(Conjunto conjuntoA,Conjunto conjuntoB){
        Conjunto conjuntoC= new Conjunto();
        Nodo aux = conjuntoA.getPrimero();
        while(aux!=null){
            if((conjuntoB.pertenece(aux.getInfo()))){
                conjuntoC.agregar(aux.getInfo());
            }
            aux = aux.getSig();
        }
        return conjuntoC;
    }



}