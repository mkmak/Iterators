
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
public class StudentData implements Comparable {
    private String LastName, FirstName;
    private String Major;
    private String College;
    private int CreditHoursAttempted;
    private int CreditHoursEarned;
    private int QualityPoints;

    public StudentData(String ln, String fn, String mj, String col, 
                        int cha, int che, int qp)
    {
	LastName = ln;
	FirstName = fn;
	Major = mj;
	College = col;
	CreditHoursAttempted = cha;
	CreditHoursEarned = che;
	QualityPoints = qp;
    }
    public String GetName()
    {
	return LastName + ", " + FirstName;
    }
    public String GetCollege()
    {
	return College;
    }
    public String GetMajor()
    {
	return Major;
    }
    public int GetCreditHoursAttempted()
    {
	return CreditHoursAttempted;
    }
    public int GetCreditHoursEarned()
    {
	return CreditHoursEarned;
    }
    public int GetQualityPoints()
    {
	return QualityPoints;
    }   

    @Override
    public int compareTo(Object o) {
        StudentData sd = (StudentData) o;
        return this.GetName().compareTo(sd.GetName());
    }
}
