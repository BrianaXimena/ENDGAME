/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author 20012021
 */
public class EndGame {

    public static void main(String[] args) {
        Heroe blackPanter = new Heroe("BlackPanter grrr", "Ser el rey de wakanda","Garras de Vibranium");
        Villano galactus=new Villano("Galactus","Devorar mundos","Usa de chalan a Silver surfer");
        Avenger ironMan = new Avenger("Tony Stark","Genio, Filantropo, multimillonario, playbloy","Mark 42","Prime");
        Thanos thanos = new Thanos("Thanos","El titan loco","Ejercito chitaury", "Gemas del infimito");
        //aplicar polimorfismo
        
        Personaje[]personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:personajes){
        personaje.atacar();
        }
        //metodo especifico de avenger
        //De donde heredo, quien soy, y el metodo especifico
        ((Avenger)ironMan).reunirse();
        //ejemplo
        //quien soy y el metodo especifico
        thanos.chasquearDedos();
    }
}
