import javax.swing.JOptionPane;
 
public class main {

public static void main(String[]args) {

String N1, N2, N3;
double NT1, NT2, NT3, media;
 
  N1 = JOptionPane.showInputDialog("Escreva a primeira nota: ");
  NT1 = Double.parseDouble(N1);

  N2 = JOptionPane.showInputDialog("Escreva a segunda nota: ");
  NT2 = Double.parseDouble(N2);
 
  N3 = JOptionPane.showInputDialog("Esceva a terceira nota: ");
  NT3 = Double.parseDouble(N3);

  media = (NT1 + NT2 + NT3) / 3;
  if (media >= 6.0)
  {
    JOptionPane.showMessageDialog(null,"A média final do aluno é: "+ media,"Aprovado",JOptionPane.INFORMATION_MESSAGE);
  } if
 (media < 6.0 & media > 4.0){
   JOptionPane.showMessageDialog(null,"A media final do aluno é: "+ media, "Verificação suplementar", JOptionPane.WARNING_MESSAGE);
 }
  if (media<4.0)
  {
  JOptionPane.showMessageDialog(null,"A media final do aluno é: "+ media, "Reprovado ", JOptionPane.WARNING_MESSAGE); 
  }
 
}

}
