package Classes;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PersonTableModel extends AbstractTableModel {
    private List<Person> persons = new ArrayList<>();
    private final String[] columnNames = {"Name", "Age"};

    public void setPersons(List<Person> persons) {
        this.persons = persons;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return persons.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = persons.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return person.getName();
            case 1:
                return person.getAge();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
