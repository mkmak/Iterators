/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class main 
{
    public static void main(String[] args) 
    {
        StudentList las = new LAStudents();
        StudentList techs = new TechStudents();
        Iterator lai = las.createIterator();
        Iterator techi = techs.createIterator();
        
        System.out.println("Last Name, First Name: GPA:");
        StudentData lasd = lai.Next();
        StudentData techsd = techi.Next();
        while(lai.hasNext() || techi.hasNext()) {
            if(!lai.hasNext()) {
                System.out.println(techsd.GetName() + ": " + Integer.toString(techsd.GetQualityPoints() / techsd.GetCreditHoursAttempted()));
                techsd = techi.Next();
            }
            else if(!techi.hasNext()) {
                System.out.println(lasd.GetName() + ": " + Integer.toString(lasd.GetQualityPoints() / lasd.GetCreditHoursAttempted()));
                lasd = lai.Next();
            }
            else {
                if(lasd.GetName().compareTo(techsd.GetName()) <= 0) {
                    System.out.println(lasd.GetName() + ": " + Integer.toString(lasd.GetQualityPoints() / lasd.GetCreditHoursAttempted()));
                    lasd = lai.Next();
                }
                else {
                    System.out.println(techsd.GetName() + ": " + Integer.toString(techsd.GetQualityPoints() / techsd.GetCreditHoursAttempted()));
                    techsd = techi.Next();
                }
            }
        }
    }
}
