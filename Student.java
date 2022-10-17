package Sample;

import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author Avik
 */
@WebServlet(urlPatterns = {"/Student"})

public class Student extends HttpServlet
{
    
    static ArrayList studList=new ArrayList();

    String Stud_No,Stud_Name,Stud_Marks,Stud_Grade;
    static int f;
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        ArrayList err=new ArrayList();
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        Stud_No = req.getParameter("sno");
        Stud_Name = req.getParameter("sname");
        Stud_Marks = req.getParameter("smarks");
        int sno = 0;
        float smarks = 0;
        if (Stud_No.equals(""))
        {
            err.add("<li>PROVIDE STUDENT NUMBER</li>");
            
            //pw.println("<li>PROVIDE STUDENT NUMBER</li>");
        } 
        else 
        {
            try
            {
                sno = Integer.parseInt(Stud_No);
            }
            catch (NumberFormatException nfe) 
            {
                err.add("<li>PROVIDE int DATA IN STUDENT NUMBER</li>\n");
                //pw.println("<li>PROVIDE int DATA IN STUDENT NUMBER</li>");
            }
        }
        if (Stud_Name.equals("")) 
        {
            err.add("<li>PROVIDE STUDENT NAME</li>\n");
            //pw.println("<li>PROVIDE STUDENT NAME</li>");
        }
        else
        {
            for(int i=0;i<Stud_Name.length();i++)
            {
                char c=Stud_Name.charAt(i);
                if(c!=' ')
                {
                    if(!(Character.isLetter(c)))
                    {
                        err.add("<li>STUDENT Name Cannot Contain Special Character</li>\n");
                        //pw.println("<li>STUDENT Name Cannot Contain Special Character</li>");
                        break;
                    }
                }
            }
        }
        if ((Stud_Marks == null) || (Stud_Marks.equals("")))
        {
            err.add("<li>PROVIDE STUDENT MARKS</li>\n");
            //pw.println("<li>PROVIDE STUDENT MARKS</li>\n</ul>\n</body>\n</html>");
        } 
        else 
        {
            try 
            {
                smarks = Float.parseFloat(Stud_Marks);
                
                if(smarks>90)
                {
                    Stud_Grade="Outstanding";
                }
                else if(smarks>80 && smarks<=90)
                {
                    Stud_Grade="Excellent";
                }
                else if(smarks>70 && smarks<=80)
                {
                    Stud_Grade="Average";
                }
                else if(smarks>60 && smarks<=70)
                {
                    Stud_Grade="Below Average";
                }
                else if(smarks>50 && smarks<=60)
                {
                    Stud_Grade="Acceptable";
                }                
                else if(smarks>40 && smarks<=50)
                {
                    Stud_Grade="Passed";
                }
                else if(smarks<40)
                {
                    Stud_Grade="Fail";
                }
            } 
            catch (NumberFormatException nfe) 
            {
                err.add("<li>PROVIDE either int or float DATA IN STUDENT MARKS</li>\n");
                //pw.println("<li>PROVIDE either int or float DATA IN STUDENT MARKS</li>\n</ul>\n</body>\n</html>");
            }
        }
        if(!err.isEmpty())
        {
            f=1;
            pw.println("<html>\n<head><title>Error Page</title></head>\n<body>\n<h1>List Of Errors</h1>\n\n");
            for(int i=0;i<err.size();i++)
            {
                pw.println(err.get(i));
            }
            pw.println("</ul>\n</body>\n</html>");
        } 
        else 
        {
            f=0;
        }
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        PrintWriter pw = res.getWriter();
        Student ob=new Student();
        ob.doGet(req, res);        
        if(f==0)
        {
            studList.add(ob.Stud_No);
            studList.add(ob.Stud_Name);
            studList.add(ob.Stud_Marks);
            studList.add(ob.Stud_Grade);
            pw.println("<html>\n<head><title>Student Details</title></head>\n<body>\n<h1>List of Students</h1>\n<table style=\"border-collapse: collapse;\">");
            pw.println("<tr>\n<th>Student No</th>\n<th>Student Name</th>\n<th>Student Marks</th>\n<th>Student Grade</th>\n</tr>\n");
            for(int i=0;i<studList.size();)
            {
                pw.println("<tr>\n<td style=\"border: 2px solid black;\">"+studList.get(i)+"</td>\n");
                pw.println("<td style=\"border: 2px solid black;\">"+studList.get(i+1)+"</td>\n");
                pw.println("<td style=\"border: 2px solid black;\">"+studList.get(i+2)+"</td>\n");
                pw.println("<td style=\"border: 2px solid black;\">"+studList.get(i+3)+"</td>\n</tr>\n");
                i=i+4;
            }
            pw.println("\n</table>\n</body>\n</html>");
        }
        pw.close();
    }
}

