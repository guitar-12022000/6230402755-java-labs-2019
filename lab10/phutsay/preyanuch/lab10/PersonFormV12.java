/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 8/3/2020
 */
package phutsay.preyanuch.lab10;

import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class PersonFormV12 extends PersonFormV11 implements Comparable<Person>{
    private static final long serialVersionUID = 1L;

    protected Person person;//
    protected ArrayList<String> personArray = new ArrayList<String>();//
    protected Map<String, Object> personMap = new HashMap<String, Object>();//

    protected JMenu data;
    protected JMenuItem displayData, sortData, searchData, removeData;

    protected String info, nameT, weightT, heightT, dobT;
    protected DateTimeFormatter formatter;

    public PersonFormV12(String windowName) {
        super(windowName);
    }

    @Override
    public void handleOkButton() {
        info = getInfo();
        nameT = textfieldName.getText();
        weightT = weightTextField.getText();
        heightT = heightTextField.getText();
        dobT = birthTextField.getText();
        formatter  = DateTimeFormatter.ofPattern("d-MM-yyyy");

        Person person = new Person(nameT, Double.parseDouble(weightT), 
                                    Double.parseDouble(heightT), 
                                    LocalDate.parse(dobT, formatter));
        JOptionPane.showMessageDialog(null, info + "\n\nAdding this person into the list:" 
        + person, "Person Information", JOptionPane.INFORMATION_MESSAGE);

        personArray.add(person.toString());//add  person in string to personArray
        personMap.put(person.getName(), person);// put key(name) and value(information) to map
    }

    // if Display menu is clicked-------
    protected void handleDisplayData(){
        JOptionPane.showMessageDialog(this, personArrayToString() ,"Person List"
        , JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
    }

    // if Sort menu is clicked---------
    protected void handleSortData(){
        // sort command
        Collections.sort(personArray);//sorting personArray like a,b,c,...,z
        JOptionPane.showMessageDialog(this, personArrayToString(),"Person List", 
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));//convert to string and show
    }

    // if Search menu is clicked
    protected void handleSearchData(){//----------
        String personSearch = JOptionPane.showInputDialog(this, "Please enter a person name to search");//input name(key)

        if(personMap.containsKey(personSearch)){//if this map have this key(personSearch)
            JOptionPane.showMessageDialog(this, personMap.get(personSearch) + " is found.", "Message", 
            JOptionPane.INFORMATION_MESSAGE,new ImageIcon(icon));//show information(value)
        }else if( personSearch.isBlank()){
            // if key is blank.
        }
        else{
            // if not found
            JOptionPane.showMessageDialog(this, personSearch + " is not found", "Message", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
        }
        
    }
    // if Remove menu is clicked
    protected void handleRemoveData(){//-----------
        //input name that's user want to remove
        String personRemove = JOptionPane.showInputDialog(this, "Please enter a person name to remove");
        
        if(personMap.containsKey(personRemove)){
            JOptionPane.showMessageDialog(this, personMap.get(personRemove) + " is removed.", "Message", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));//show dialog.
           
            personArray.removeAll(personArray);  // remove all data in personArray

            personMap.remove(personRemove, personMap.get(personRemove));//delete key and value in personMap

            for(Object value : personMap.values()){///***** */
                personArray.add(String.valueOf(value));///**** */
            }
            
        }else if(personRemove.isBlank()){
            // if key is blank.
        }
        else{
            // if not found(never input or deleted)
            JOptionPane.showMessageDialog(this, personRemove + " is not found", "Message", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
        }

    }


    // method for convert personArray to string to show dialog if display or sort is clicked
    public String personArrayToString(){
        String personArrayString = "[";
        for (int i = 0; i < personArray.size(); i++){
            if (personArray.size() == 1 && i == personArray.size() -1 ) {//size =1,index =0
                personArrayString += personArray.get(i);//add each value
            } else if (personArray.size() != 1 && i == personArray.size() -1 ) {//size !=1,index = size-1
                personArrayString += personArray.get(i) +  "\n";//add each value
            } else if (personArray.size() > 1 && i != personArray.size()-1) {//size >1,index != size-1
                personArrayString += personArray.get(i) + "\n , ";//add each value
            }
            
        }
        personArrayString += "]";//close sentense
        return personArrayString;//return result
    }

    @Override
    public void addMenus() {
        super.addMenus();

        data = new JMenu("Data");

        displayData = new JMenuItem("Display");
        sortData = new JMenuItem("Sort");
        searchData = new JMenuItem("Search");
        removeData = new JMenuItem("Remove");

        // add menu item to tab Data
        data.add(displayData);
        data.add(sortData);
        data.add(searchData);
        data.add(removeData);

        // add tab Data to menu item
        bar.add(data);
    }

    @Override
    public void addListeners() {
        super.addListeners();
        // add listener
        displayData.addActionListener(this);
        sortData.addActionListener(this);
        searchData.addActionListener(this);
        removeData.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();
        if (source == displayData) {
            handleDisplayData();
        } else if (source == sortData) {
            handleSortData();
        } else if (source == searchData) {
            handleSearchData();
        } else if (source == removeData) {
            handleRemoveData();
        }
    }
    
    public static void createAndShowGUI() {
        PersonFormV12 pFormV12 = new PersonFormV12("Person Form V12"); 
        pFormV12.addMenus();
        pFormV12.addComponents();   
        pFormV12.addListeners();     
        pFormV12.setFrameFeatures();   
    }

    //for running program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

