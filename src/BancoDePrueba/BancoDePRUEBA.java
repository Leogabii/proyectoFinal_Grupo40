/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDePrueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.AccesoADatos.Coneccion;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Producto;

/**
 *
 * @author equipo
 */
public class BancoDePRUEBA {

    
     private static Connection con;
      private static List<Producto> productos_a_listar = new ArrayList<>();
      private static List<Mesero> meseros_a_listar = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    
        con=(Connection) Coneccion.getConexion();
//        System.out.println("el proximo pedido es: " + proximoNroPedido());


//        productos_a_listar=listadoDeProductos();
//        productos_a_listar.forEach(System.out::println);
        
//        meseros_a_listar=listadoDeMeseros();
//        meseros_a_listar.forEach(System.out::println);
        
        
        
        
       
        
    }
    
    
//    public static int proximoNroPedido() throws SQLException{
//       int actual=0;
//        try{
//        
//        String sql = "select id_pedido from pedido order by id_pedido desc";
//        PreparedStatement sentencia = con.prepareStatement(sql);
//        ResultSet resultado =  sentencia.executeQuery();
//        if(resultado.next()){
//            actual=resultado.getInt("id_pedido");
//        }
//        }catch(SQLException sqle){
//                    JOptionPane.showMessageDialog(null, sqle);
//        }
//         return actual+1;
//    }
  
    
    
    
    /*
Producto{idProducto=1, nombreProducto=Hamburguesa, tipoProducto=null, precio=899.0, stock=0, estado=true}
Producto{idProducto=2, nombreProducto=Pizza, tipoProducto=null, precio=3456.0, stock=0, estado=true}
Producto{idProducto=3, nombreProducto=Coca Cola, tipoProducto=null, precio=1345.0, stock=0, estado=true}
Producto{idProducto=4, nombreProducto=Cerveza, tipoProducto=null, precio=1001.99, stock=0, estado=true}
Producto{idProducto=5, nombreProducto=Coca Cola, tipoProducto=null, precio=1345.0, stock=0, estado=true}
Producto{idProducto=6, nombreProducto=Cerveza, tipoProducto=null, precio=1001.99, stock=0, estado=true}   
    
    */
    
   public static List<Producto> listadoDeProductos() throws SQLException{
       
       
       List<Producto> productos = new ArrayList<>();
       try{
          
           String sql ="select * from producto";
           PreparedStatement sentencia = con.prepareStatement(sql);
           ResultSet resultado =  sentencia.executeQuery();
           Producto producto;
           while (resultado.next()){
               producto = new Producto();
               producto.setIdProducto(resultado.getInt("idProducto"));
               producto.setNombreProducto(resultado.getString("nombre_producto"));
               producto.setPrecio(resultado.getDouble("precio"));
//               producto.setTipoProducto(resultado.getString("tipo_producto"));
               producto.setStock(resultado.getInt("stock"));
               producto.setEstado(resultado.getBoolean("estado"));
               productos.add(producto);
           }
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, sqle);
           
       }
       return productos;
         }
   
 
   
   /*
Mesero{idMesero=1, nombre=pedro, apellido=Mendez, dni=43444555, domicilio=las algas marinas, localidad=LongChamps, telefono=01143567788, provincia=Buenos Aires}
Mesero{idMesero=2, nombre=Martin, apellido=Pescador, dni=12345678, domicilio=Caribe 2345, localidad=Tigre, telefono=01176549569, provincia=Buenos Aires}
BUILD SUCCESSFUL (total time: 9 seconds)
   
   */
   
      public static List<Mesero> listadoDeMeseros() throws SQLException{
       List<Mesero> meseros = new ArrayList<>();
       try{
          
           String sql ="select * from mesero";
           PreparedStatement sentencia = con.prepareStatement(sql);
           ResultSet resultado =  sentencia.executeQuery();
           Mesero mesero;
           while (resultado.next()){
               mesero = new Mesero();
               mesero.setIdMesero(resultado.getInt("id_mesero"));
               mesero.setNombre(resultado.getString("nombre"));
               mesero.setApellido(resultado.getString("apellido"));
               mesero.setDni(resultado.getInt("dni"));
               mesero.setDomicilio(resultado.getString("direccion"));
               mesero.setLocalidad(resultado.getString("localidad"));
               mesero.setTelefono(resultado.getString("telefono"));
               mesero.setProvincia(resultado.getString("provincia"));
               meseros.add(mesero);
           }
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, sqle);
           
       }
       return meseros;
         }
   
      /*
            consulta sql para mozo de una mesa
            select pedido.id_mesero
            from pedido
            where pedido.id_mesa=2
            AND
            pedido.fecha_hora='2023-10-10 18:20:19';   
      
      
      
      */
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   /*
      
Textos completos
id_mesero	
nombre	
apellido	
dni	
direccion	
localidad	
telefono	
provincia	
	
Editar Editar
Copiar Copiar
Borrar Borrar
1
pedro
Mendez
43444555
las algas marinas
LongChamps
01143567788
Buenos Aires
	
Editar Editar
Copiar Copiar
Borrar Borrar
2
Martin
Pescador
12345678
Caribe 2345
Tigre
01176549569
Buenos Aires

      
      */
   
    
}
       
       /*
       
       
    
       
       
Textos completos
idProducto	
nombre_producto	
precio	
stock	
estado	
	
Editar Editar
Copiar Copiar
Borrar Borrar
1
Hamburguesa
899
0
1
	
Editar Editar
Copiar Copiar
Borrar Borrar
2
Pizza
3456
0
1
	
Editar Editar
Copiar Copiar
Borrar Borrar
3
Coca Cola
1345
0
1
	
Editar Editar
Copiar Copiar
Borrar Borrar
4
Cerveza
1001.99
0
1
	
Editar Editar
Copiar Copiar
Borrar Borrar
5
Coca Cola
1345
0
1
	
Editar Editar
Copiar Copiar
Borrar Borrar
6
Cerveza
1001.99
0
1

       */
 
