/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 * Summary description for LAStudents.
 */
public class LAStudents implements StudentList
{
    ArrayList Students;
    
    public LAStudents()
    {
	Students = new ArrayList<StudentData>();
        Students.add(new StudentData("Wagner", "Richardo", "English", "LA", 80, 80, 240));
        Students.add(new StudentData("DerfleigendeHollaender", "Albert", "History", "LA", 45, 45, 100));
        Students.add(new StudentData("Walkure", "B", "PoliSci", "LA", 128, 124, 270));
        Students.add(new StudentData("Lohengrin", "Harry", "English", "LA", 30, 30, 80));
        Students.add(new StudentData("Gotterdammerung", "Brian", "English", "LA", 80, 80, 270));
        Students.add(new StudentData("Siegfried", "Susan", "History", "LA", 12, 12, 45));
        Students.add(new StudentData("Renizi", "George", "PoliSci", "LA", 86, 86, 330));
        Students.add(new StudentData("Rheingold", "Andrew", "PoliSci", "LA", 62, 60, 145));
        Students.add(new StudentData("Tannhauser", "James", "English", "LA", 78, 76, 120));
        Students.add(new StudentData("Johanneskepplerstrasse", "A", "English", "LA", 87, 87, 256));
    }
    
    public void addStudent(String l, String f, String m, String c, 
                            int cha, int che, int qp)
    { 
	Students.add(new StudentData(l, f, m, c, cha, che, qp));
    }

    public ArrayList getStudents() {
        return Students;	
    }

    @Override
    public Iterator createIterator() {
        Collections.sort(Students);
        return new LAStudentsIterator(Students);
    }
}
