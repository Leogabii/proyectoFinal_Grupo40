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
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.time.LocalDate;
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
      private static  List<Integer> meseros_x_una_mesa = new ArrayList<>();
      private static ArrayList<Integer> listadepedido=new ArrayList();
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



//        String otraFecha="2023-10-11 09:02:25.00000";
//        String unaFecha = "2023-10-10 18:20:19" ;
//        meseros_x_una_mesa=meserosQAtendieronUnaMesaDada(2,otraFecha);
//        meseros_x_una_mesa.forEach(System.out::println);
//       // localtime de la base 2023-10-11 08:59:38.000000


            listadepedido.add(1);
            listadepedido.add(2);
            listadepedido.add(1);
            listadepedido.add(2);
                  
         registrarPedido(proximoNroPedido(),2,2,"2023-10-11 08:59:38.000000",20200.02,false, (ArrayList) listadepedido);
        
    }
    
    
    public static int proximoNroPedido() throws SQLException{
       int actual=0;
        try{
        
        String sql = "select id_pedido from pedido order by id_pedido desc";
        PreparedStatement sentencia = con.prepareStatement(sql);
        ResultSet resultado =  sentencia.executeQuery();
        if(resultado.next()){
            actual=resultado.getInt("id_pedido");
        }
        }catch(SQLException sqle){
                    JOptionPane.showMessageDialog(null, sqle);
        }
         return actual+1;
    }
  
    
    
    
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
   
     
      
      
      
      
     
      //      consulta sql para mozo de una mesa
      // '2023-10-10 18:20:19'  
            public static List<Integer> meserosQAtendieronUnaMesaDada(int mesa, String fecha) throws SQLException{
                  List<Integer> meseros = new ArrayList();
                  try{
            String sql= "select pedido.id_mesero from pedido where pedido.id_mesa=? AND pedido.fecha_hora=?";   
               
      
        PreparedStatement sentencia = con.prepareStatement(sql);
        sentencia.setInt(1, mesa);
        sentencia.setString(2, fecha);
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            meseros.add(resultado.getInt("id_mesero"));
        }
                  }catch(SQLException sqe){
                      JOptionPane.showMessageDialog(null, sqe);
                  }
        return meseros;
    }
            
            
            /*
            INSERT INTO `pedido`(`id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
            */
            
            
        public static void registrarPedido(int pedido,int mesa, int mesero, String fecha, double monto, boolean cobrada, ArrayList<Integer> productos) throws SQLException {
            int numeroPedidoGenerado=0;
            try {
            String sql1="INSERT INTO pedido (`id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada`) VALUES (?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            
            sentencia.setInt(1, mesa);
            sentencia.setInt(2, mesero);
            sentencia.setString(3,fecha);
            sentencia.setDouble(4, monto);
            sentencia.setBoolean(5, cobrada);
            int fila = sentencia.executeUpdate();
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "no se ha generado ningun Pedido registrado");
                return;
            }
            ResultSet rs = sentencia.getGeneratedKeys();
            if (rs.next()) {
               numeroPedidoGenerado=(rs.getInt(1));
                           if (pedido==numeroPedidoGenerado){
                JOptionPane.showMessageDialog(null, "Su pedido a sigo generado bajo el numero: " +  numeroPedidoGenerado);
            }else{
                               JOptionPane.showMessageDialog(null, "no se ha generado el pedido corecto controlar y eliminar");
                           }
            }
            /**
             * segunda parte
             * 
             * una vez generado el pedido ese numero se lo asigno a la tabla pedidoproducto que relaciona
             * pedidos con producto
             */
            
            /*
            INSERT INTO `pedidoproducto`(`id_pedido_producto`, `id_pedido`, `id_producto`, `cantidad`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
            */
            int cantidad=4;
            for (int i=0;i<productos.size();i++){
            String sql2="INSERT INTO `pedidoproducto`(`id_pedido`, `id_producto`, `cantidad`) VALUES (?,?,?)";
            PreparedStatement otraSentencia = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            otraSentencia.setInt(1, numeroPedidoGenerado);
            otraSentencia.setInt(2, productos.get(i));
            otraSentencia.setInt(3, cantidad);
            otraSentencia.executeUpdate();
            }
            
         
             /**
             * tercera parte
             * 
             * tercer tramo actualizo mesa como ocupada y/o atendida
             * 
             */
             // UPDATE `mesa` SET `estado_mesa`= ? WHERE id_mesa=?
             
            String sql3="UPDATE `mesa` SET `estado_mesa`= ? WHERE id_mesa=?";
            PreparedStatement Sentencia2 = con.prepareStatement(sql3, Statement.RETURN_GENERATED_KEYS);
            Sentencia2.setBoolean(1, true);
            Sentencia2.setInt(2, mesa);
            Sentencia2.executeUpdate();
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al queres registra el pedido salga y vuelva a entrar al programa... si el problema persiste contacte al Administrador" + ex.getMessage());
        }

        }     
            
        /*
        
        para modificar un pedido solo se actualiza en la tabla
        pedido: el importe
        UPDATE `pedido` SET `importe`= ? WHERE id_pedido=?;
        en la tabla pedidoproducto la cantidad y el codigo del producto
        UPDATE pedidoproducto SET `id_producto`= 2,`cantidad`=100 WHERE (pedidoproducto.id_pedido=1 and pedidoproducto.id_pedido_producto=6);
        
        
        
        
        */
        
        
        
        /**
         * 
         * 
         * para consultar pedidos por fecha determinada
         * select * from pedido where pedido.fecha_hora='2023-10-11 08:59:38';
         * 
         */
        
        
        
        
        /*
        consulta a la base si quiero lo que contiene un pedido
        SELECT id_pedido,id_producto,producto.nombre_producto,producto.precio
        from pedidoproducto
        join producto
        ON (pedidoproducto.id_producto=producto.idProducto)
        where id_pedido=12;
        */
        
        /**
         * probando join
         * 
         * SELECT id_pedido,pedidoproducto.cantidad,id_producto,producto.nombre_producto,producto.precio,producto.precio*pedidoproducto.cantidad as importe from pedidoproducto join producto ON (pedidoproducto.id_producto=producto.idProducto) where id_pedido=12;

* id_pedido	
cantidad	
id_producto	
nombre_producto	
precio	
importe	
12
4
1
Hamburguesa
899
3596
12
4
2
Pizza
3456
13824
12
4
1
Hamburguesa
899
3596
12
4
2
Pizza
3456
13824

         */
        
        
        
        /**
         * 
         * SELECT pedidoproducto.id_pedido,pedidoproducto.cantidad,id_producto,producto.nombre_producto,producto.precio,pedido.importe from pedidoproducto join producto ON (pedidoproducto.id_producto=producto.idProducto) join pedido on(pedidoproducto.id_pedido=pedido.id_pedido) where pedidoproducto.id_pedido=12;
         * 
id_pedido	
cantidad	
id_producto	
nombre_producto	
precio	
importe	
12
4
1
Hamburguesa
899
20200.02
12
4
2
Pizza
3456
20200.02
12
4
1
Hamburguesa
899
20200.02
12
4
2
Pizza
3456
20200.02

         * 
         */
            
 }// end class
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
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
 
