package mx.edu.uacm.primerproyectohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.edu.uacm.primerproyectohibernate.domain.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Código legado
    	//sessionFactory sf = new Configuration()
    	//Creamos un registro estandar del servicio atravez de un builder
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//crear nuestra entidad
    	Usuario usr = new Usuario();
    	usr.setIdUsuario(1);
    	usr.setNombreUsuario("usuariox");
    	
    	
    	//crear transaccion
    	session.getTransaction().begin();
    	//volver persistente el objeto usr
    	session.persist(usr);
    	
    	session.getTransaction().commit();
    	
    	session.close();
    	
    	sf.close();
    	
    }
}
