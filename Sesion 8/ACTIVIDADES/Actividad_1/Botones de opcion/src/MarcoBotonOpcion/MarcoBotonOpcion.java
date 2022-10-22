package MarcoBotonOpcion;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame {

    private final JTextField campoTexto; // se utiliza para mostrar los cambios enel tipo de letra
    private final Font tipoLetraSimple; // tipo de letra para texto simple
    private final Font tipoLetraNegrita; // tipo de letra para texto en negrita
    private final Font tipoLetraCursiva; // tipo de letra para texto en cursiva
    private final Font tipoLetraNegritaCursiva; // tipo de letra para texto en negrita y cursiva 
// El constructor de MarcoBotonOpcion agrega los objetos JRadioButton a JFrame

    public MarcoBotonOpcion() {
        super("GRUPO 4: Torres - Avila");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Observe el cambio en el estilo del tipo de letra", 25);
        add(campoTexto); // agrega campoTexto a JFrame

        // crea los botones de opción
        JRadioButton simpleJRadioButton = new JRadioButton("Simple", true);
        JRadioButton negritaJRadioButton = new JRadioButton("Negrita", false);
        JRadioButton cursivaJRadioButton = new JRadioButton("Cursiva", false);
        JRadioButton negritaCursivaJRadioButton = new JRadioButton("Negrita / Cursiva", false);

        add(simpleJRadioButton); // agrega botón simple a JFrame
        add(negritaJRadioButton); // agrega botón negrita a JFrame
        add(cursivaJRadioButton); // agrega botón cursiva a JFrame
        add(negritaCursivaJRadioButton); // agrega botón negrita y cursiva

// crea una relación lógica entre los objetos JRadioButton 
        ButtonGroup grupoOpciones = new ButtonGroup(); // crea ButtonGroup 
        grupoOpciones.add(simpleJRadioButton); // agrega simple al grupo 
        grupoOpciones.add(negritaJRadioButton); // agrega negrita al grupo 
        grupoOpciones.add(cursivaJRadioButton); // agrega cursiva al grupo
        grupoOpciones.add(negritaCursivaJRadioButton); // agrega negrita y cursiva

// crea objetos tipo de letra
        tipoLetraSimple = new Font("Serif", Font.PLAIN, 14);
        tipoLetraNegrita = new Font("Serif", Font.BOLD, 14);
        tipoLetraCursiva = new Font("Serif", Font.ITALIC, 14);
        tipoLetraNegritaCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        campoTexto.setFont(tipoLetraSimple);

        // registra eventos para los objetos JRadioButton 
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }

// clase interna privada para manejar eventos de botones de opción
    private class ManejadorBotonOpcion implements ItemListener {

        private Font tipoLetra; // tipo de letra asociado con este componente de escucha

        public ManejadorBotonOpcion(Font f) {
            tipoLetra = f;
        }

// maneja los eventos de botones de opción
        @Override
        public void itemStateChanged(ItemEvent evento) {
            campoTexto.setFont(tipoLetra);
        }
    }
} // fin de la clase MarcoBotonOpcion

