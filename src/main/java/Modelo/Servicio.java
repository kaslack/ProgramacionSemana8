package Modelo;

import Vista.IValidarInterface;
import javax.swing.JOptionPane;

public class Servicio implements IValidarInterface{
 
    private double lavadoExterior, lavadoInterior, aspirada, polichada, mejoresCeras, maquinaOzono;
    private double maquinaVapor, desengrasanteDebajo, grafitadoChasis, tapiceria, valorTotal;
       
    String tipoCarro, tipoServicio;
    
    public Servicio() {
        this.lavadoExterior = 10;
        this.lavadoInterior = 15;
        this.aspirada = 5;
        this.polichada = 30;
        this.mejoresCeras = 50;
        this.maquinaOzono = 40;
        this.maquinaVapor = 25;
        this.desengrasanteDebajo = 15;
        this.grafitadoChasis = 18;
        this.tapiceria = 45;
        this.valorTotal = 0;
        this.tipoCarro = "ninguno";
        this.tipoServicio = "ninguno";
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }       
        
    public double lavadoBasico(){
            
        double agregarValor = lavadoExterior+lavadoInterior+aspirada;
        
        return valorPorTamañoCarro(agregarValor);
                                
    }
    
    public double lavadoEspecial(){
                       
        lavadoBasico();
        
        double agregarValor = polichada+mejoresCeras;        
        
        return valorPorTamañoCarro(agregarValor);    
                
    }
    
    public double desinfeccionBasica(){
               
        double agregarValor = maquinaOzono;
        
        return valorPorTamañoCarro(agregarValor);    
                
    }
    
    public double desifeccionAvanzada(){
                
        desinfeccionBasica();
        
        double agregarValor = maquinaVapor;        
        
        valorPorTamañoCarro(agregarValor);    
                        
        return this.valorTotal;
        
    }
    
    public double combo1(){
        
        String lavado = JOptionPane.showInputDialog("¿Lavado basico o lavado especial?");
        
        if(lavado.equals("lavado basico")){
        
            lavadoBasico();            
            
        }
        else if(lavado.equals("lavado especial")){
            
            lavadoEspecial();            
            
        }
        
        double agregarValor = polichada+desengrasanteDebajo;
                
        valorPorTamañoCarro(agregarValor);
        
        return this.valorTotal;
        
    }
    
    public double combo2(){
        
        combo1();
        
        double agregarValor = grafitadoChasis;
        
        valorPorTamañoCarro(agregarValor);
        
        return this.valorTotal;
        
    }
    
    public double combo3(){
        
        combo2();
        
        double agregarValor = tapiceria;
        
        valorPorTamañoCarro(agregarValor);
        
        return this.valorTotal;
        
    }
    
    public double valorPorTamañoCarro(double agregarValor){
        
        double asignarValorPorTipoCarro;
        
        switch (tipoCarro){
            
            case "automóvil":
                asignarValorPorTipoCarro = (agregarValor)*0.10;
                this.valorTotal = this.valorTotal+asignarValorPorTipoCarro;
                break;
            case "camioneta":
                asignarValorPorTipoCarro = (agregarValor)*0.15;
                this.valorTotal = this.valorTotal+asignarValorPorTipoCarro;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite un carro disponible"); 
                
        }
        
        return this.valorTotal;
        
    }

    @Override
    public void vacios(String imprimir) {

        if(imprimir.equals("tipoServicio")){
            
            JOptionPane.showMessageDialog(null, "Campo vacio("+imprimir+")");
                        
        }
        
        if(imprimir.equals("tipoCarro")){
            
            JOptionPane.showMessageDialog(null, "Campo vacio("+imprimir+")");
                        
        }

    }
    
}