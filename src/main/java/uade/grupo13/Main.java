package uade.grupo13;

import uade.grupo13.Conjunto.*;
import uade.grupo13.Nodo.Nodo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio de conjunto.
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

    }
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