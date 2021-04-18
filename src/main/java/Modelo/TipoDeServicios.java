package Modelo;

import javax.swing.JOptionPane;

public class TipoDeServicios extends Servicio{
 
    public void escojerTipoDeServicio(){
       
        if(tipoServicio.equals("")){
            
        }
        else{
            
            switch (tipoServicio) {
            
                case "lavado basico":
                    lavadoBasico();
                    break;
                case "lavado especial":
                    lavadoEspecial();
                    break;
                case "desifección basica":
                    desinfeccionBasica();
                    break;
                case "desifeccion avanzada":
                    desifeccionAvanzada();
                    break;
                case "combo 1":
                    combo1();
                    break;
                case "combo 2":
                    combo2();                
                    break;
                case "combo 3":
                    combo3();                
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite un servicio disponible");
                
            }
            
        }
        
    }
    
}
