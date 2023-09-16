import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changeExchange extends JFrame {
    private JPanel currencyExchangePanel;
    private JLabel lblHeader;
    private JPanel pnlCenterMain;
    private JLabel lblCurrencyInput;
    private JTextField txtCurrencyInput;
    private JLabel lblAmount;
    private JButton btnCalculate;
    private JLabel lblAmountInput;
    private JLabel lblAmountInputDisplay;
    private JPanel amountPanel;
    private JLabel lblQuarters;
    private JLabel lblNickels;
    private JLabel lblNickelsOutput;
    private JLabel lblQuartersOutput;
    private JLabel lblLoonies;
    private JLabel lblLooniesOutput;
    private JLabel lblDimes;
    private JLabel lblDimesOutput;
    private JLabel lblPennies;
    private JLabel lblPenniesOutput;
    private JLabel lblToonies;
    private JLabel lblTooniesOutput;

    public changeExchange (){
        setContentPane(currencyExchangePanel);
        setTitle("U1A1 Hasan Baig");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double currency = Double.parseDouble(txtCurrencyInput.getText());
                lblAmountInputDisplay.setText(Double.toString(currency));

                // Gets the total amount of cents in the amount entered
                int cents = (int) (currency * 100);

                // Finds max number of toonies that can be used
                int toonies = cents / 200;
                cents %= 200;
                lblTooniesOutput.setText(Integer.toString(toonies));

                // Finds max number of loonies that can be used
                int loonies = cents / 100;
                cents %= 100;
                lblLooniesOutput.setText(Integer.toString(loonies));

                // Finds max number of quarters that can be used
                int quarters = cents / 25;
                cents %= 25;
                lblQuartersOutput.setText(Integer.toString(quarters));

                // Finds max number of dimes that can be used
                int dimes = cents / 10;
                cents %= 10;
                lblDimesOutput.setText(Integer.toString(dimes));

                // Finds max number of nickels that can be used
                int nickels = cents / 5;
                cents %= 5;
                lblNickelsOutput.setText(Integer.toString(nickels));

                // Finds max number of pennies that can be used
                int pennies = cents;
                lblPenniesOutput.setText(Integer.toString(cents));
            }
        });
    }

    public static void main(String[] args) {
        new changeExchange();
    }
}
