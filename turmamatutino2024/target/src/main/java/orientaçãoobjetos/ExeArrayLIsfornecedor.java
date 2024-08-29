
package orientaçãoobjetos;

import Fornecedor.fornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExeArrayLIsfornecedor {

    public static void mainn(String[] args) {

        ArrayList<fornecedor> f = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            fornecedor ff = new fornecedor();
            ff.setNomecompleto(JOptionPane.showInputDialog("informe o nome: "));
            ff.setCnpj(JOptionPane.showInputDialog("informe o cnpj"));

            f.add(ff);

        }
            JOptionPane.showMessageDialog(null, "nome: 1" + f.get(0).getNomecompleto() + "\nCnpj:" + f.get(0).getCnpj());

    }

}
