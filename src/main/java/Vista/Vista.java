package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{

    private JPanel panelPrincipal;
    private JLabel tituloBienvenido, tituloRegistrarse, tituloConsultar, tituloTipoServicio, tituloTipoCarro;
    private JLabel oprimirAltR, oprimirAltC;
    private JLabel tituloProduccionServicio, tituloProduccionFuncionario, tituloPproduccionRangosFecha;
    public JTextField tipoServicio, tipoCarro, produccionServicio, produccionFuncionario, produccionRangosFecha;
    public JButton botonRegistrar, botonConsultar;
    
    Color rojoPastel = new Color(255, 66, 66);
        
    public void interfazPrincipal(){
              
        setBounds(0, 0, 800, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        setTitle("Lavado de autos la estrella");
        this.setLocationRelativeTo(null);
                
        panelPrincipal = new JPanel();        
        tituloBienvenido = new JLabel("Bienvenido al lavado de autos la estrella");
        tituloRegistrarse = new JLabel("Registrar");  
        tituloConsultar = new JLabel("Consultar");
        tituloTipoServicio = new JLabel("Tipo de servicio:");
        tituloTipoCarro = new JLabel("Tipo de carro:");
        tituloProduccionServicio = new JLabel("Producido por servicio:");
        tituloProduccionFuncionario = new JLabel("Producido por funcionario:");
        tituloPproduccionRangosFecha = new JLabel("Producido por fecha:");  
        oprimirAltR = new JLabel("<html> De click sobre el boton <br> o puede oprimir alt + a </html>");
        oprimirAltC = new JLabel("<html> De click sobre el boton <br> o puede oprimir alt + C </html>");
        tipoServicio = new JTextField();
        tipoCarro = new JTextField();   
        produccionServicio = new JTextField();
        produccionFuncionario = new JTextField();
        produccionRangosFecha = new JTextField();
       
        botonRegistrar = new JButton("Registrar Servicios");
        botonConsultar = new JButton("Consultar Servicios");        
                
        panelPrincipal.setBackground(rojoPastel);
        panelPrincipal.setLayout(null);
                
        tituloBienvenido.setBounds(125, 20, 500, 40);//posicion en x, y y luego el tamaño en x y en y
        tituloRegistrarse.setBounds(140, 70, 120, 30);
        tituloConsultar.setBounds(520, 70, 120, 30);
        tituloTipoServicio.setBounds(130, 100, 120, 25);
        tituloTipoCarro.setBounds(130, 150, 120, 25);        
        tituloProduccionServicio.setBounds(500, 100, 150, 25);
        tituloProduccionFuncionario.setBounds(500, 150, 150, 25);
        tituloPproduccionRangosFecha.setBounds(500, 200, 150, 25);
        tipoServicio.setBounds(130, 125, 120, 25);
        tipoCarro.setBounds(130, 175, 120, 25);
        produccionServicio.setBounds(500, 125, 120, 25);
        produccionFuncionario.setBounds(500, 175, 120, 25);
        produccionRangosFecha.setBounds(500, 225, 120, 25);        
        oprimirAltR.setBounds(130, 445, 200, 30);
        oprimirAltC.setBounds(520, 445, 200, 30);
        botonRegistrar.setBounds(110, 400, 170, 30);
        botonConsultar.setBounds(500, 400, 170, 30);
        
        tituloBienvenido.setForeground(Color.black);
        tituloBienvenido.setFont(new Font("arial", Font.BOLD, 25));
        tituloRegistrarse.setForeground(Color.black);
        tituloRegistrarse.setFont(new Font("arial", Font.BOLD, 15));        
        tituloConsultar.setForeground(Color.black);
        tituloConsultar.setFont(new Font("arial", Font.BOLD, 15));          
        tituloTipoServicio.setForeground(Color.black);
        tituloTipoServicio.setFont(new Font("arial", Font.BOLD, 12));        
        tituloTipoCarro.setForeground(Color.black);
        tituloTipoCarro.setFont(new Font("arial", Font.BOLD, 12));  
        tituloProduccionServicio.setForeground(Color.black);
        tituloProduccionServicio.setFont(new Font("arial", Font.BOLD, 12));  
        tituloProduccionFuncionario.setForeground(Color.black);
        tituloProduccionFuncionario.setFont(new Font("arial", Font.BOLD, 12));
        tituloPproduccionRangosFecha.setForeground(Color.black);
        tituloPproduccionRangosFecha.setFont(new Font("arial", Font.BOLD, 12));           
        
        botonRegistrar.setMnemonic('a');
        botonConsultar.setMnemonic('c');        
        
        add(panelPrincipal);
        panelPrincipal.add(tituloBienvenido);
        panelPrincipal.add(tituloRegistrarse);
        panelPrincipal.add(tituloConsultar);
        panelPrincipal.add(tituloTipoServicio);
        panelPrincipal.add(tituloTipoCarro);
        panelPrincipal.add(tituloProduccionServicio);
        panelPrincipal.add(tituloProduccionFuncionario);
        panelPrincipal.add(tituloPproduccionRangosFecha);               
        
        panelPrincipal.add(tipoServicio);
        panelPrincipal.add(tipoCarro);
        panelPrincipal.add(produccionServicio);
        panelPrincipal.add(produccionFuncionario);
        panelPrincipal.add(produccionRangosFecha);        
        
        panelPrincipal.add(oprimirAltR);
        panelPrincipal.add(oprimirAltC);
        
        panelPrincipal.add(botonRegistrar);
        panelPrincipal.add(botonConsultar);
        
    }
    
}
