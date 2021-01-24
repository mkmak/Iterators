
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class LAStudentsIterator implements Iterator 
{
    ArrayList<StudentData> Students;
    int pos = 0;
    
    LAStudentsIterator(ArrayList s) {
        Students = s;
    }

    @Override
    public boolean hasNext() {
        return (pos < Students.size());
    }

    @Override
    public StudentData Next() {
        return Students.get(pos++);
    }
    
}
