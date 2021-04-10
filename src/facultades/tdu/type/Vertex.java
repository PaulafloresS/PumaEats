/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultades.tdu.type;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class Vertex {
    
    public enum Color{ BLACK, GREY, WHITE }

    private String name;
    
    private List<Vertex> neighbor; // Se apila en una cola junto a su peso
    
    private List<Integer> weight; // va de la mano con el orden en el que se
                                  // agregaron vecinos
    private Color color;
    
    private Integer distance;
    
    private Vertex predecesor;
    
    public Vertex( String name ){
        this.neighbor = new ArrayList<>();
        this.weight = new ArrayList<>();
        this.name = name;
        this.color = Color.BLACK;
        this.distance = null;   //Allevar distancia al predecesor
        this.predecesor = null; //Vertice que le precede
    }
    
    
    /**
     *
     * @brief Función que añade una arista entre dos vertices, en caso de que el
     * vértice ya esté dentro de los vecinos, no se agregará
     * @param v Referencia a el vertice que se agregará
     * @param w Peso de la relación del vértice
     * @return true si se añadió el vecino, false en caso de que ya estuviera
     */
    public boolean addNeighbor( Vertex v, Integer w ){
        if( findNeighbor( v.getName() ) == false ) {
            this.neighbor.add(v);
            this.weight.add(w);
            return true;
        }
        return false;
    }
    
    
    /**
     *
     * @author antonio
     * @brief Funnción para convertir a cadena un objeto Vertex
     * @return Cadena representativa de un vértice
     */
    @Override
    public String toString(){
        return
                "\nNombre: " + this.name +
                "\nVecinos: " + neighborToString() +
                "\nPesos: " + weightToString() +
                "\nColor: " + this.colorToString() +
                "\nDistancia: " + this.distanceToString() +
                "\nPredecesor: " + this.predecesorToString() ;
    }
    
    /**
     *
     * @author antonio
     * @brief Encuentra a un vértice vecino por su nombre
     * @param name Cadena con el nombre por el que se buscará
     * @return true si se encontró, false en caso contrario
     */
    public boolean findNeighbor( String name ){
        for( int i = 0; i < neighbor.size(); i++ ){
            if( name.compareTo( neighbor.get(0).getName() ) == 0 )
                return true;
        }
        return false;
    }
    
    /**
     *
     * @author antonio
     * @brief Función para convertir la lista de vecinos a una cadena
     * @return Una cadena con los nombres de los vecinos
     */
    private String neighborToString(){
        String s = "";
        for( int i = 0; i < neighbor.size(); i++ ){
            s = s + neighbor.get( i ).getName() + "->" ;
        }
        return s;
    }
    
    /**
     *
     * @author antonio
     * @brief Función para convertir la lista de pesos a una cadena
     * @return Una cadena con los pesos de los vecinos
     */
    private String weightToString(){
        String s = "";
        for( int i = 0; i < neighbor.size(); i++ ){
            s = s + weight.get( i ).toString() + "->" ;
        }
        return s;
    }
    
    /**
     *
     * @author antonio
     * @brief Función para convertir el atributo color a String
     * @return Una cadena con el color en curso, nill si no tiene
     */
    private String colorToString(){
        switch( this.color ){
            case BLACK: return "Black";
            case GREY:  return "Grey";
            case WHITE: return "White";
            default:    return "nill";
        }
    }
    
    /**
     *
     * @author antonio
     * @brief Devuelve una cadena de la distancia
     * @return Cadena si hay valor, nill si aun no tiene valor
     */
    private String distanceToString(){
        if( this.distance != null ) return this.distance.toString();
        else return "nill";
    }
    
    /**
     *
     * @author antonio
     * @brief Devuelve una cadena representativa del vértice predecesor
     * @return Cadena si hay valro, nill si aun no tiene valor
     */
    private String predecesorToString(){
        if( this.predecesor != null ) return this.predecesor.getName();
        else return "nill";
    }
    
    /**
     *
     * @author antonio
     * @brief Getter del atributo nombre
     * @return nombre del vértice
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @author antonio
     * @brief setter del atributo nombre
     * @param name nombre con el que se modificará
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @author antonio
     * @brief Getter del atributo neighbor
     * @return Lista de vecinos
     */
    public List<Vertex> getNeighbor() {
        return neighbor;
    }

    /**
     *
     * @author antonio
     * @brief Getter del atributo weight
     * @return Lista de los pesos
     */
    public List<Integer> getWeight() {
        return weight;
    }
    
    /**
     *
     * @author antonio
     * @brief Setter del atributo weight
     * @param weight peso con el que se modificará
     */
    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }
    
    /**
     *
     * @author antonio
     * @brief Setter del atributo Neighbor
     * @param neighbor lista con la que se modificará
     */
    public void setNeighbor(List<Vertex> neighbor) {
        this.neighbor = neighbor;
    }

    /**
     *
     * @author antonio
     * @brief Getter enumeracion Color
     * @return tipo de color
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @author antonio
     * @brief Setter de la enumeracion Color
     * @param color color con el que se modificará
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @author antonio
     * @brief Getter del atributo distance
     * @return distancia entre los dos vértices
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     *
     * @author antonio
     * @brief Setter del atributo distance
     * @param distance distancia con la que se modificará
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     *
     * @author antonio
     * @brief Getter del atributo predecesor
     * @return El vertice predecesor
     */
    public Vertex getPredecesor() {
        return predecesor;
    }

    /**
     *
     * @author antonio
     * @brief Setter del atributo predecesor
     * @param predecesor predecesor con el que se modificará
     */
    public void setPredecesor(Vertex predecesor) {
        this.predecesor = predecesor;
    }
}

