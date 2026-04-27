/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaGUIJava;
    import javax.swing.*;
    import javax.swing.table.DefaultTableModel;
    import java.awt.*;
    import java.io.File; 
    import java.io.IOException; 
    import java.io.PrintWriter; 
    import java.util.Locale;
public class AplicacionNotasGUI extends JFrame {
    
    private static final Color COLOR_FONDO = new Color(245, 248, 252);
    private static final Color COLOR_TITULO = new Color(20, 70, 140);
    private static final Color COLOR_BOTON_AZUL = new Color(30, 100, 180) ;
    private static final Color COLOR_BOTON_VERDE = new Color(40, 140, 90) ;
    private static final Color COLOR_BOTON_ROJO = new Color(180, 60, 60);
    private static final Color COLOR_BOTON_GRIS = new Color(90, 100, 110) ;
   
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtNota1;
    private JTextField txtNota2;
    private JTextField txtNota3;
    
    private JComboBox<String> cmbPrograma;
    
    private JRadioButton rbDiurna;
    private JRadioButton rbNocturna;
    private ButtonGroup grupoJornada;
    
    private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;
    
    private JLabel lblEstado; 
    private JLabel lblResumen;
    
    
    
    //constructor con "inicializar componentes"
    public AplicacionNotasGUI() { 
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        setTitle("Registro de estudiantes"); 
        setSize(1100, 600); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
    //Metodo inicializar componenetes
    private void inicializarComponentes() {
        JPanel contenedor = new JPanel(new BorderLayout(10, 10));
        contenedor.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contenedor.setBackground(COLOR_FONDO);
        setContentPane(contenedor);
        JPanel panelTitulo = crearPanelTitulo();
        JPanel panelFormulario = crearPanelFormulario();
        JScrollPane panelTabla = crearPanelTabla();
        JPanel panelInferior = crearPanelInferior();
        
        contenedor.add(panelTitulo, BorderLayout.NORTH);
        contenedor.add(panelFormulario, BorderLayout.WEST);
        contenedor.add(panelTabla, BorderLayout.CENTER);
        contenedor.add(panelInferior, BorderLayout.SOUTH); 
    }
    
    //Titulo (arriba)
    private JPanel crearPanelTitulo() {
        JPanel panel = new JPanel();
        panel.setBackground(COLOR_FONDO);
        JLabel titulo = new JLabel("Sistema de registro de estudiantes");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(COLOR_TITULO);
        panel.add(titulo); return panel; 
    }
    
    //Crear Formulario
   private JPanel crearPanelFormulario() {
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBackground(COLOR_FONDO);
    panel.setBorder(BorderFactory.createTitledBorder("Datos del estudiante"));
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(6, 6, 6, 6);
    gbc.fill = GridBagConstraints.HORIZONTAL; txtCodigo = new JTextField(15);
        txtNombre = new JTextField(15);
        txtNota1 = new JTextField(15);
        txtNota2 = new JTextField(15);
        txtNota3 = new JTextField(15);
        
        cmbPrograma = new JComboBox<>(new String[] { "Ingenieria Electronica", "Ingenieria Mecatronica", "Ingenieria de Sistemas", "Tecnologia Electronica", "Otro" });
        
        rbDiurna = new JRadioButton("Diurna");
        rbNocturna = new JRadioButton("Nocturna");
        rbDiurna.setBackground(COLOR_FONDO);
        rbNocturna.setBackground(COLOR_FONDO);
        rbDiurna.setSelected(true);
        grupoJornada = new ButtonGroup();
        grupoJornada.add(rbDiurna);
        grupoJornada.add(rbNocturna);
    JPanel panelJornada = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
    panelJornada.setBackground(COLOR_FONDO);
    panelJornada.add(rbDiurna); 
    panelJornada.add(rbNocturna);
    JButton btnAgregar = new JButton("Agregar");
    JButton btnLimpiar = new JButton("Limpiar");
    JButton btnEliminar = new JButton("Eliminar");
    JButton btnGuardarCSV = new JButton("Guardar CSV");
    JButton btnSalir = new JButton("Salir");
    estilizarBoton(btnAgregar, COLOR_BOTON_VERDE);
    estilizarBoton(btnLimpiar, COLOR_BOTON_GRIS);
    estilizarBoton(btnEliminar, COLOR_BOTON_ROJO);
    estilizarBoton(btnGuardarCSV, COLOR_BOTON_AZUL);
    estilizarBoton(btnSalir, COLOR_BOTON_ROJO); 
    agregarFila(panel, gbc, 0, "Codigo:", txtCodigo);
    agregarFila(panel, gbc, 1, "Nombre:", txtNombre);
    agregarFila(panel, gbc, 2, "Programa:", cmbPrograma);
    agregarFila(panel, gbc, 3, "Jornada:", panelJornada);
    agregarFila(panel, gbc, 4, "Nota 1:", txtNota1); 
    agregarFila(panel, gbc, 5, "Nota 2:", txtNota2); 
    agregarFila(panel, gbc, 6, "Nota 3:", txtNota3); 
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1; 
        panel.add(btnAgregar, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(btnLimpiar, gbc); 
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(btnEliminar, gbc);
        gbc.gridx = 1; 
        gbc.gridy = 8;
        panel.add(btnGuardarCSV, gbc);
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2; 
        panel.add(btnSalir, gbc);
        
            btnAgregar.addActionListener(e-> agregarEstudiante()); 
            btnLimpiar.addActionListener(e-> limpiarFormulario());
            btnEliminar.addActionListener(e-> eliminarFilaSeleccionada());
            btnGuardarCSV.addActionListener(e-> guardarCSV());
            btnSalir.addActionListener(e-> salirAplicacion()); 
        return panel; }
   
   private void agregarFila( JPanel panel, GridBagConstraints gbc, int fila, String textoEtiqueta, JComponent componente ) {
   
   
    public static void main(String[] args) { SwingUtilities.invokeLater(()-> {
        new AplicacionNotasGUI().setVisible(true); 
     });
    }
}
