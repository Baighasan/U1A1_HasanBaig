import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changeExchange extends JFrame {
    private JPanel changeExchangePanel;
    private JLabel lblHeader;
    private JPanel pnlCenterMain;
    private JLabel lblCurrencyInput;
    private JTextField txtCurrencyInput;
    private JLabel lblAmount;
    private JButton btnCalculate;

    public changeExchange (){
        setContentPane(changeExchangePanel);
        setTitle("U1A1 Hasan Baig");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double currency = Double.parseDouble(txtCurrencyInput.getText());
            }
        });
    }

    public static void main(String[] args) {
        new changeExchange();
    }
}
