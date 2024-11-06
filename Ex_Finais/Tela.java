import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.TextArea;

public class Tela {
    private ArrayList<funcionario> lista;

    public Tela(){
        lista = new ArrayList<>();

        JFrame tela = new JFrame("Tela de Cadastro"); // criar a tela
        tela.setLocationRelativeTo(null); //centralizar a tela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar ao sair
        
        JPanel containerEsq, containerDir;
        containerEsq = new JPanel();
        containerEsq.setLayout(new BoxLayout(containerEsq, BoxLayout.Y_AXIS));//como vai ta organizado o container da esquerda
        
        containerEsq.add(new JLabel("funcionario"));
        
        JPanel ctrNome= new JPanel(new FlowLayout());
        ctrNome.add(new JLabel("Nome"));
        TextField TFN =new TextField(50);
        ctrNome.add(TFN);
        containerEsq.add(ctrNome);

        JPanel ctrSalario= new JPanel(new FlowLayout());
        ctrSalario.add(new JLabel("Salario"));
        TextField TFS = new TextField(50);
        ctrSalario.add(TFS);
        containerEsq.add(ctrSalario);

        JPanel ctrTipo= new JPanel(new FlowLayout());
        ctrTipo.add(new JLabel("Salario"));
        JRadioButton jrbTipoA = new JRadioButton("A");
        JRadioButton jrbTipoB = new JRadioButton("B");
        ButtonGroup bgTipo = new ButtonGroup();
        bgTipo.add(jrbTipoA);
        bgTipo.add(jrbTipoB);
        ctrTipo.add(jrbTipoA);
        ctrTipo.add(jrbTipoB);
        containerEsq.add(ctrTipo);

        
        JButton Cadastra = new JButton("cadastrar");
        containerEsq.add(Cadastra);


        tela.getContentPane().setLayout(new FlowLayout());
        tela.getContentPane().add(containerEsq);
        TextArea TA= new TextArea();
        tela.getContentPane().add(TA);

        containerDir = new JPanel();



        //DEFINIÇOES DAS AÇOES NA TELA
        try{
        Cadastra.addActionListener(
            e ->{
                String nome = TFN.getText();
                String Salario = TFS.getText();
                String Tipo = (jrbTipoA.isSelected()? "tipo A" : "tipo B"); // if
                
                funcionario f;
                if(jrbTipoA.isSelected()){f = new funcA(nome, Double.parseDouble(Salario));} 
                    else {f = new funcB(nome, Double.parseDouble(Salario));}
                lista.add(f);
                
            }
        );
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "VALOR DE SALARIO COM FORMATO ERRADO.", "aviso", JOptionPane.WARNING_MESSAGE);
            

        }
        finally{
            StringBuilder sb= new StringBuilder();
                for(funcionario aux: lista){
                    sb.append(aux);
                }
                TA.setText(sb.toString());
        }

        tela.pack();
        tela.setVisible(true);//mostrar a tela
    }
}
