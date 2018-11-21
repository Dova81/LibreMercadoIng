package ingreso.com.libreMercado.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tarjeta {

    @Id
    private int numeroDeTarjeta;

    private int codigoDeSeguridad;
    private Date fechaDeVencimiento;


    public Tarjeta (){}

    public Tarjeta (int numeroTarjeta, int codigo, Date fecha){
        setNumeroDeTarjeta(numeroTarjeta);
        setCodigoDeSeguridad(codigo);
        setFechaDeVencimiento(fecha);
    }


    public void setNumeroDeTarjeta(int numero){
        numeroDeTarjeta= numero;
    }

    public void setCodigoDeSeguridad(int codigo){
        codigoDeSeguridad= codigo;
    }

    public void setFechaDeVencimiento(Date fecha){
        fechaDeVencimiento= fecha;
    }


}
