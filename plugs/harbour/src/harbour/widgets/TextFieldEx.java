package harbour.widgets;

import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;

public class TextFieldEx extends JPanel {

    private static final long serialVersionUID = 1L;
    
    private ButtonGroup buttons = new ButtonGroup();
    private JTextField sizeTextField = null;
    private JLabel sizeLabel = null;
    private JRadioButton sizeRadioButton = null;
    private JTextField chTextField = null;
    private JLabel chLabel = null;
    private JRadioButton chRadioButton = null;
    private JTextField tieTextField = null;
    private JLabel tieLabel = null;
    private JRadioButton tieRadioButton = null;
    private JTextField cargoTextField = null;
    private JLabel cargoLabel = null;
    private JRadioButton cargoRadioButton = null;

    private JTextField oilTextField = null;

    private JLabel oilLabel = null;

    private JRadioButton oilRadioButton = null;

    /**
     * This is the default constructor
     */
    public TextFieldEx() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        oilLabel = new JLabel();
        oilLabel.setBounds(new Rectangle(75, 94, 80, 15));
        oilLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        oilLabel.setText("Oelterminal");
        cargoLabel = new JLabel();
        cargoLabel.setBounds(new Rectangle(75, 71, 90, 15));
        cargoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        cargoLabel.setText("Frachtanleger");
        tieLabel = new JLabel();
        tieLabel.setBounds(new Rectangle(75, 48, 75, 15));
        tieLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        tieLabel.setText("Ankerplatz");
        chLabel = new JLabel();
        chLabel.setBounds(new Rectangle(75, 25, 60, 15));
        chLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        chLabel.setText("Channel");
        sizeLabel = new JLabel();
        sizeLabel.setBounds(new Rectangle(75, 2, 95, 15));
        sizeLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        sizeLabel.setText("Schiffsgroesse");
        this.setSize(190, 112);
        this.setLayout(null);
        this.add(getSizeTextField(), null);
        this.add(sizeLabel, null);
        this.add(getSizeRadioButton(), null);
        this.add(getChTextField(), null);
        this.add(chLabel, null);
        this.add(getChRadioButton(), null);
        this.add(getTieTextField(), null);
        this.add(tieLabel, null);
        this.add(getTieRadioButton(), null);
        this.add(getCargoTextField(), null);
        this.add(cargoLabel, null);
        this.add(getCargoRadioButton(), null);
        this.add(getOilTextField(), null);
        this.add(oilLabel, null);
        this.add(getOilRadioButton(), null);
        
        buttons.add(sizeRadioButton);
        buttons.add(chRadioButton);
        buttons.add(tieRadioButton);
        buttons.add(cargoRadioButton);
        buttons.add(oilRadioButton);
    }

    /**
     * This method initializes sizeTextField	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getSizeTextField() {
        if (sizeTextField == null) {
            sizeTextField = new JTextField();
            sizeTextField.setBounds(new Rectangle(0, 0, 75, 20));
        }
        return sizeTextField;
    }

    /**
     * This method initializes sizeRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getSizeRadioButton() {
        if (sizeRadioButton == null) {
            sizeRadioButton = new JRadioButton();
            sizeRadioButton.setBounds(new Rectangle(170, 0, 20, 20));
        }
        return sizeRadioButton;
    }

    /**
     * This method initializes chTextField	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getChTextField() {
        if (chTextField == null) {
            chTextField = new JTextField();
            chTextField.setBounds(new Rectangle(0, 23, 75, 20));
        }
        return chTextField;
    }

    /**
     * This method initializes chRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getChRadioButton() {
        if (chRadioButton == null) {
            chRadioButton = new JRadioButton();
            chRadioButton.setBounds(new Rectangle(170, 23, 20, 20));
        }
        return chRadioButton;
    }

    /**
     * This method initializes tieTextField	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getTieTextField() {
        if (tieTextField == null) {
            tieTextField = new JTextField();
            tieTextField.setBounds(new Rectangle(0, 46, 75, 20));
        }
        return tieTextField;
    }

    /**
     * This method initializes tieRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getTieRadioButton() {
        if (tieRadioButton == null) {
            tieRadioButton = new JRadioButton();
            tieRadioButton.setBounds(new Rectangle(170, 46, 20, 20));
        }
        return tieRadioButton;
    }

    /**
     * This method initializes cargoTextField	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getCargoTextField() {
        if (cargoTextField == null) {
            cargoTextField = new JTextField();
            cargoTextField.setBounds(new Rectangle(0, 69, 75, 20));
        }
        return cargoTextField;
    }

    /**
     * This method initializes cargoRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getCargoRadioButton() {
        if (cargoRadioButton == null) {
            cargoRadioButton = new JRadioButton();
            cargoRadioButton.setBounds(new Rectangle(170, 69, 20, 20));
        }
        return cargoRadioButton;
    }

    /**
     * This method initializes oilTextField	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getOilTextField() {
        if (oilTextField == null) {
            oilTextField = new JTextField();
            oilTextField.setBounds(new Rectangle(0, 92, 75, 20));
        }
        return oilTextField;
    }

    /**
     * This method initializes oilRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getOilRadioButton() {
        if (oilRadioButton == null) {
            oilRadioButton = new JRadioButton();
            oilRadioButton.setBounds(new Rectangle(170, 92, 20, 20));
        }
        return oilRadioButton;
    }

}
