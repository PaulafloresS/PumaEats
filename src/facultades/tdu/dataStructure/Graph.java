/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultades.tdu.dataStructure;

import facultades.tdu.type.Vertex;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class Graph {
    
    List<Vertex> vertexList;

    /**
    * @brief Constructor del objeto Graph
    */
    public Graph(  ){
        this.vertexList = new ArrayList<>();
    }
    
    /**
     * 
     * @param a Nombre del vértice origen 
     * @param b Nombre del vértice destino
     * @param route Cadena donde se devolverá la mejor ruta
     * @return 
     */
    public boolean findBestRoute( String a, String b, List<Vertex> route ){
        resetVertex();
        Vertex vertexA = findVertex(a);
        Vertex vertexB = findVertex(b);
        
        if( vertexA == null || vertexB == null )
            return false;
        
        vertexA.setDistance(0);
        dijkstra(vertexA);
        pullBack(vertexB, route);
        return true;
    }
    
    /**
     * 
     * @param a Referencia al vértice origen
     * @param route Cadena donde se guardará la mejor ruta
     * @return 
     */
    private void dijkstra( Vertex a ){
        a.setColor(Vertex.Color.WHITE);
        //Condicional para la primera iteración
        if( a.getPredecesor() == null ){
            for( int i = 0; i < a.getNeighbor().size(); i++ ){
                Vertex tmp = a.getNeighbor().get(i);
                tmp.setColor(Vertex.Color.GREY);
                tmp.setDistance( a.getWeight().get(i) );
                tmp.setPredecesor(a);
            }
        }
        
        //condicional para el resto de las iteracioens
        if( a.getPredecesor() != null ){
            for( int i = 0; i < a.getNeighbor().size(); i++ ){
                Vertex tmp = a.getNeighbor().get(i);
                //comparar con vecinos white para verificar sea la ruta oprima
                if( tmp.getColor() == Vertex.Color.WHITE ){
                    if( a.getDistance() > ( tmp.getDistance() + a.getWeight().get(i) ) ){
                        a.setPredecesor(tmp);
                        a.setDistance( tmp.getDistance() + a.getWeight().get(i) );
                    }
                }
                //comprar con los vecinos black para añadirlos
                if( tmp.getColor() == Vertex.Color.BLACK ){
                    tmp.setColor(Vertex.Color.GREY);
                    tmp.setPredecesor(a);
                    tmp.setDistance( a.getDistance() + a.getWeight().get(i) );
                }
            }
        }
        
        //Preparar a siguiente nodo elegible
        if( a.getNeighbor().isEmpty() != true ){
            Vertex next = null;
            //Si aun hay nodos sin descubrir
            if( isAllWhite() == false ){
                for( int i = 0; i < a.getNeighbor().size(); i++ ){
                    if( a.getNeighbor().get(i).getColor() == Vertex.Color.GREY )
                        next = a.getNeighbor().get(i);                   
                }
                
                //si el vértice queda bloqueado se busca al vecino con vecinos grices
                if( next == null ){
                    
                    for( int i = 0; i < a.getNeighbor().size(); i++ )
                        if( haveVertexGrayNeighbors( a.getNeighbor().get(i) ) == true )
                            a = a.getNeighbor().get(i);
                        
                    for( int i = 0; i < a.getNeighbor().size(); i++ )
                        if( a.getNeighbor().get(i).getColor() == Vertex.Color.GREY )
                            next = a.getNeighbor().get(i);                       
                }
                
                //si no se tienen vecinos grises se busca en lista a un nodo blanco que tenga vecinos grises
                if( next == null ){
                    for( int i = 0; i < vertexList.size(); i++ )
                        if( vertexList.get(i).getColor() == Vertex.Color.WHITE && haveVertexGrayNeighbors( vertexList.get(i) ) )
                            a = vertexList.get(i);
                    
                    for( int i = 0; i < a.getNeighbor().size(); i++ )
                        if( a.getNeighbor().get(i).getColor() == Vertex.Color.GREY )
                            next = a.getNeighbor().get(i);
                }
                
                //Elejir al nodo gris de menor peso
                for( int i = 0; i < a.getNeighbor().size(); i++ ){                
                    if( next.getDistance() > a.getNeighbor().get(i).getDistance() && a.getNeighbor().get(i).getColor() == Vertex.Color.GREY ){
                        next = a.getNeighbor().get(i);
                    }
                }
                dijkstra( next ); // se ejecuta recursividad
            }
            else{
                return;
            }
        }
    }
    
    /**
     * 
     * @return Verdadero si todos los vértices son blancos o falso si aun no
     */
    public boolean isAllWhite(){
        for( int i = 0; i < this.vertexList.size(); i++ ){
            Vertex v = this.vertexList.get(i);
            if( v.getColor() != Vertex.Color.WHITE )
                return false;
        }
        return true;
    }
    
    /**
     * 
     * @param v Referencia del vértice en el que se buscarán vértices grices
     * @return true si encontro vecinos grices, false en caso contrario
     */
    public boolean haveVertexGrayNeighbors( Vertex v ){
        for( int i = 0 ; i < v.getNeighbor().size(); i++  ){
            if( v.getNeighbor().get(i).getColor() == Vertex.Color.GREY )
                return true;
        }
        return false;
    }
    
    /**
     * @brief Resetea los valores de Color, distancia, y predecesor
     */
    private void resetVertex(){
        for( int i = 0; i < vertexList.size(); i++ ){
            vertexList.get(i).setColor(Vertex.Color.BLACK);
            vertexList.get(i).setDistance(null);
            vertexList.get(i).setPredecesor(null);
        }
    }
    
    /**
     * 
     * @param b Referencia al último vértice al que se quiere llegar
     * @param route Lista donde se guardará los vertices de mejor ruta
     */
    private void  pullBack( Vertex b, List<Vertex>route ){
        List<Vertex> tmpList = new ArrayList<>();
        tmpList.add(b);
        Vertex tmp = b.getPredecesor();
        while( tmp.getPredecesor() != null ){
            tmpList.add(tmp);
            tmp = tmp.getPredecesor();
        }
        tmpList.add(tmp);
        //reordenar la lista tempara de atras hacia adelante
        for( int i = tmpList.size() - 1; i > -1 ; i-- )
            route.add( tmpList.get(i) );
    }
    /**
    * @brief Añade un vértice al gráfo
    * @param name Nombre que se le prondrá al vértice
    */
    public void addVertex( String name ){
        Vertex v = new Vertex( name );
        this.vertexList.add( v );
    }
    
    /**
     * 
     * @param name Nombre por el que se buscará al vértice
     * @return Referencia al vertice si se encuentra, null si no se encontró
     */
    public Vertex findVertex( String name ){
        Vertex v = null;
        for( int i = 0; i < vertexList.size(); i++ ){
            if( name.compareTo( vertexList.get(i).getName() ) == 0 )
                v = vertexList.get(i);
        }
        return v;
    }
    
    /**
     * 
     * @param a Nombre del primer vértice
     * @param b Nombre del segundo vértice
     * @param w Peso entre los dos vértices
     * @return true si se creo con éxito, false si no se creó debido a falla o ya existía
     */
    public boolean addEdge( String a, String b, Integer w){
        Vertex vertexA = findVertex(a);
        Vertex vertexB = findVertex(b);
        
        if( vertexA != null && vertexB != null ){
            vertexA.addNeighbor(vertexB, w);
            vertexB.addNeighbor(vertexA, w);
            return true;
        }
        
        return false;
    }
    
    /**
     * 
     * @return Cadena representativa deel grafo y sus vértices
     */
    @Override
    public String toString(){
        String s = "";
        for( int i = 0; i < this.vertexList.size(); i++ ){
           s = s + "\n" + vertexList.get(i).toString(); 
        }
        return s;        
    }
}
