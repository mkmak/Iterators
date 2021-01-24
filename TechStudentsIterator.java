/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class TechStudentsIterator implements Iterator 
{
    StudentData[] Students;
    int pos = 0;
    
    public TechStudentsIterator(StudentData[] l) {
        Students = l;
    }

    @Override
    public boolean hasNext() {
        return (pos < Students.length && Students[pos] != null);
    }

    @Override
    public StudentData Next() {
        return Students[pos++];
    }
    
}
