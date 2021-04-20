package Controlador;

import Vista.Vista;
import Modelo.TipoDeServicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
    
public class Controlador implements ActionListener{

    private TipoDeServicios modelo;
    private Vista vista;

    public Controlador(TipoDeServicios modelo, Vista vista){
        
        this.modelo = modelo;
        this.vista = vista;
        
    }

    public void iniciarVista(){

        vista.interfazPrincipal();
        vista.botonConsultar.addActionListener(this);
        vista.botonRegistrar.addActionListener(this);        
        vista.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
                
        if(vista.botonRegistrar == e.getSource()){
            
            modelo.vacios(vista.tipoServicio.getText()+"tipoTipoDeServicios");
            modelo.vacios(vista.tipoCarro.getText()+"tipoCarro");
            
            modelo.setTipoServicio(vista.tipoServicio.getText());
            modelo.setTipoCarro(vista.tipoCarro.getText());
            
            modelo.escojerTipoDeServicio();     
            
            JOptionPane.showMessageDialog(null, "Registrado con exito");
                                                           
        }

        if(vista.botonConsultar == e.getSource()){

            vista.produccionServicio.setText(modelo.getValorTotal()+"");
            vista.produccionFuncionario.setText(modelo.getValorTotal()+"");
            vista.produccionRangosFecha.setText(modelo.getValorTotal()+"");            

            modelo.setValorTotal(0.0);
            
            JOptionPane.showMessageDialog(null, "Consultado con exito");            
            
        }

    }
    
    public static void main(String[] args){
        
        TipoDeServicios modelo = new TipoDeServicios();
        Vista vista = new Vista();
                
        Controlador controlador = new Controlador(modelo, vista);          
        controlador.iniciarVista();

        
    }    
    
}
