/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 25/3/2020
 */
package phutsay.preyanuch.lab10;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonFormV13 extends PersonFormV12 {
    private static final long serialVersionUID = 1L;

    protected StringBuffer messageError = new StringBuffer();

    protected double MIN_HEIGHT = 100.00;
    protected double MAX_HEIGHT = 250.00;
    protected double MIN_WEIGHT = 40.00;
    protected double MAX_WEIGHT = 150.00;
    protected double MIN_DAY = 1.00;
    protected double MAX_DAY = 31.00;
    protected double MIN_MONTH = 1.00;
    protected double MAX_MONTH = 12.00;
    protected double MIN_YEAR = 1900.00;
    protected double MAX_YEAR = 2010.00;

    protected String day, month, year;

    // create constructor
    public PersonFormV13(String windowName) {
        super(windowName);
    }

    // method for check numeric
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    
  
    public void checkNameException(){
        try {
            if ((textfieldName.getText().equals(null) || textfieldName.getText().isEmpty() || textfieldName.getText().isBlank())) {
                throw new Exception();
            }else{

            }
        } catch (Exception e) {

            messageError.append("Please enter name.\n");

        }

    }

    public void checkDecimalException(String text, String s, double min, double max){
        try {
            if (isNumeric(text) && !text.isBlank()) {

                try {
                    double textParse = Double.parseDouble(text);
                    if (textParse < min || textParse > max) {
                        throw new Exception();
                    } else {
                    }
                } catch (Exception e) {
                    messageError.append("Valid values for " + s + " are" + " [" + String.format("%.2f", min) + ", "
                            + String.format("%.2f", max) + "]\n");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {

            messageError.append("Please enter only numeric input for " + s + ".\n");
        }
        

    }

    
    public void checkDateException(String dobText){
        try {
            if ((birthTextField.getText().equals(null) || birthTextField.getText().isEmpty()
                    || birthTextField.getText().isBlank())) {
                throw new Exception();
            }else{

                String[] dobSplit = birthTextField.getText().split("-");
                day = dobSplit[0];
                month = dobSplit[1];
                year = dobSplit[2];

                checkDecimalException(day, "day", MIN_DAY, MAX_DAY);
                checkDecimalException(month, "month", MIN_MONTH, MAX_MONTH);
                checkDecimalException(year, "year", MIN_YEAR, MAX_YEAR);
            }
        
        } catch (Exception e) {
            messageError.append("Please enter date");
        }
    }
    // if okButton is clicked
    @Override
    public void handleOkButton() {
        info = getInfo();
        nameT = textfieldName.getText();
        weightT = weightTextField.getText();
        heightT = heightTextField.getText();
        dobT = birthTextField.getText();
        formatter  = DateTimeFormatter.ofPattern("d-MM-yyyy");

        getInfo();
        messageError.delete(0, messageError.length());// delete at index 0 to last+1

        checkNameException();

        checkDecimalException(heightTextField.getText(), "height", MIN_HEIGHT, MAX_HEIGHT);

        checkDecimalException(weightTextField.getText(), "weight", MIN_WEIGHT, MAX_WEIGHT);

        checkDateException(birthTextField.getText());

        if(messageError.length() != 0){
            JOptionPane.showMessageDialog(this, messageError, "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // if doesn't have error message
            Person person = new Person(nameT, Double.parseDouble(weightT), 
                                    Double.parseDouble(heightT), LocalDate.parse(dobT, formatter));
            JOptionPane.showMessageDialog(this, info + "\n\nAdding this person into the list:" + person,"Person Information", JOptionPane.INFORMATION_MESSAGE);
            personArray.add(person.toString());  // add String of person to arrayList
            personMap.put(person.getName(), person);  // put name and object to map
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    public static void createAndShowGUI() {
        PersonFormV13 pFormV13 = new PersonFormV13("Person Form V13"); 
        pFormV13.addMenus(); 
        pFormV13.addComponents(); 
        pFormV13.addListeners(); 
        pFormV13.setFrameFeatures(); 
    }
    //for running program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}