package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Gui extends JFrame {
    private PersonTableModel tableModel; // Use PersonTableModel
    private JButton addButton;
    private JButton removeButton;
    private JButton listButton;
    private PersoncCollection personCollection;

    public Gui() {
        personCollection = new PersoncCollection();

        setTitle("Person Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        addButton = new JButton("Add Person");
        removeButton = new JButton("Remove Person");
        listButton = new JButton("List Persons");

        add(addButton);
        add(removeButton);
        add(listButton);

        tableModel = new PersonTableModel(); // Instantiate PersonTableModel
        JTable table = new JTable(tableModel);
        add(new JScrollPane(table));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a person
                String name = JOptionPane.showInputDialog("Enter name:");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
                String id = JOptionPane.showInputDialog("Enter ID:");
                personCollection.addPerson(id, new Person(name, age));
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove a person
                String id = JOptionPane.showInputDialog("Enter ID to remove:");
                personCollection.removePerson(id);
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // List all persons
                List<Person> persons = new ArrayList<>();
                PersoncCollection.PersonCollectionIterator iterator = personCollection.iterator();
                while (iterator.hasNext()) {
                    persons.add(iterator.next());
                }
                tableModel.setPersons(persons); // No cast needed
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
}
