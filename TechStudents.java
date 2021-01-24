
import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class TechStudents implements StudentList {
    static final int NumUTS = 1000;
    StudentData[] TechStudentData;//sized to NumUTS
    int pos = 0;

    public TechStudents()
    {
	TechStudentData = new StudentData[NumUTS];
        TechStudentData[pos++] = new StudentData("Smith", "William", "CompSci", "Tech", 90, 90, 340);
        TechStudentData[pos++] = new StudentData("Jones", "Michael", "CompEnr", "Tech", 45, 45, 100);
        TechStudentData[pos++] = new StudentData("Carter", "Mary", "SoftEng", "Tech", 128, 124, 270);
        TechStudentData[pos++] = new StudentData("Harris", "Harry", "CompSci", "Tech", 30, 30, 90);
        TechStudentData[pos++] = new StudentData("Wilson", "Brian", "CompSci", "Tech", 90, 90, 270);
        TechStudentData[pos++] = new StudentData("Adams", "Susan", "CompEng", "Tech", 12, 12, 45);
        TechStudentData[pos++] = new StudentData("Washington", "George", "SoftEng", "Tech", 96, 96, 360);
        TechStudentData[pos++] = new StudentData("Jackson", "Andrew", "SoftEng", "Tech", 62, 60, 145);
        TechStudentData[pos++] = new StudentData("Madison", "James", "CompSci", "Tech", 78, 76, 120);
        TechStudentData[pos++] = new StudentData("Madison", "Dolly", "CompSci", "Tech", 87, 87, 256);
    }
    public void addStudent(String l, String f, String m, String c, 
                            int cha, int che, int qp)
    {
	TechStudentData[pos++] = new StudentData(l, f, m, c, cha, che, qp);
    }

    public StudentData[] getStudents() {
	return TechStudentData;
    }

    @Override
    public Iterator createIterator() {
        Arrays.sort(TechStudentData, new SortByName());
        return new TechStudentsIterator(TechStudentData);
    }

}

class SortByName implements Comparator<StudentData> {
    public int compare(StudentData a, StudentData b) {
        if(a != null && b != null)
            return a.GetName().compareTo(b.GetName());
        else if(a == null)
            return 1;
        else 
            return -1;
    }
}   
