/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Obra {

    public Obra() {
    }
    
    
    public ArrayList<Integer> clases(ArrayList<Integer> listaCategorias){
        ArrayList<Integer> listaNoRepetidos = new ArrayList<>();
        for (Integer categoria: listaCategorias){
            if(!listaNoRepetidos.contains(categoria)){
                listaNoRepetidos.add(categoria);
            }
        }
        return listaNoRepetidos;
    }
    
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList <Integer> obrasFaltan, ArrayList<Integer> categorias, int categoria){
        ArrayList <Integer> lista = new ArrayList<>();
        for (int numero: obrasFaltan){
            if (categorias.get(numero) == categoria){
                lista.add(numero);
            }
        }
        return lista;
    }
    public ArrayList<Integer> noTengo(ArrayList<Integer> obrasMuseoA, ArrayList<Integer> obrasMuseoB){
        ArrayList <Integer> noTieneB = new ArrayList<>();
        for (int i = 0; i < obrasMuseoA.size(); i++){
            int numero = obrasMuseoA.get(i);
            if (!obrasMuseoB.contains(numero)){
                noTieneB.add(numero);
            }
        }
        return noTieneB;
    }
    public Integer puedoCambiar(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        Integer contador = 0;
        
        if(lista1.size() >= lista2.size()){
            for(Integer elemento: lista2){
                if (!(lista2.contains(elemento) && lista1.contains(elemento))){
                    contador++;
                }
            }
        }else if (lista1.size() < lista2.size()){
            for (Integer elemento: lista1){
                if (!(lista2.contains(elemento) && lista1.contains(elemento))){
                    contador++;
                }
            }
        }
        return contador;
    }
}
