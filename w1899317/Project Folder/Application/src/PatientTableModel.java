import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

// creating a custom table model
public class PatientTableModel extends AbstractTableModel {
    private ArrayList<Patient> patients;
    private String[] columnNamesP = {"Name", "Surname","DOB","Mobile Number", "Patient Id"};

    public PatientTableModel(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public int getRowCount() {
        return patients.size();
    }

    @Override
    public int getColumnCount() {
        return columnNamesP.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient patient = patients.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> patient.getName();
            case 1 -> patient.getSurname();
            case 2 -> patient.getDATEOFBIRTH();
            case 3 -> patient.getTel();
            case 4 -> patient.getPatientId();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnNamesP[column];
    }
}


