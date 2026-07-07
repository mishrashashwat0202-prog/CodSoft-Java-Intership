import java.util.*; 
class Student 
{ 
    String name; 
    int rollno; 
    String course; 
    String contact; 
    String email; 
    String parents; 
    int age; 
    Student(String n,int r,String c,String con,String e,String p,int a) 
    { 
        name=n; 
        rollno=r; 
        course=c; 
        contact=con; 
        email=e; 
        parents=p; 
        age=a; 
    }
    @Override
    public String toString()
    {
        return "Student Name:- "+name+
                "\nStudent Roll Number:- "+rollno+
                "\nStudent Course:- "+course+
                "\nStudent Contact Number:- "+contact+
                "\nStudent Email:- "+email+
                "\nStudent Parents Name:- "+parents+
                "\nStudent Age:- "+age;
    }
}
public class StudentMS
{
    static Scanner in=new Scanner(System.in);
    static ArrayList<Student> s=new ArrayList<>();
    public static void main(String args[])
    {
        System.out.println("\tSTUDENT MANAGEMENT SYSTEM");
        while(true)
        {
            int choice;
            System.out.println("1.ADD STUDENT");
            System.out.println("2.EDIT STUDENT LIST");
            System.out.println("3.SEARCH STUDENT");
            System.out.println("4.REMOVE STUDENT");
            System.out.println("5.DISPLAY STUDENT LIST");
            System.out.println("6.EXIT");
            System.out.println();
            System.out.println("Enter your choice:- ");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    {
                        addstudent();
                        break;
                    }
                case 2:
                    {
                        editstudent();
                        break;
                    }
                case 3:
                    {
                        searchstudent();
                        break;
                    } 
                case 4:
                    {
                        removestudent();
                        break;
                    }
                case 5:
                    {
                        displaystudent();
                        break;
                    }
                case 6:
                    {
                        System.exit(0);
                    }
                default:
                    {
                        System.out.println("INVALID CHOICE");
                        break;
                    }
            }
        }
    }
    public static void addstudent()
    {
        int i;
        String name="";
        System.out.println("Enter Student Roll Number");
        int rollno=in.nextInt();
        for(i=0;i<s.size();i++)
        {
            if(rollno==s.get(i).rollno)
            {
                int add;
                System.out.println("THIS ROLL NUMBER IS ALREDY EXITS!!");
                System.out.println("DO YOU WANT TO ADD ??");
                System.out.println("1.YES");
                System.out.println("2.NO");
                add=in.nextInt();
                if(add==1)
                {
                    addstudent();
                    return;
                }
                else if(add==2)
                {
                    return;
                }
                else
                {
                    System.out.println("INVALID CHOICE! AFTER CLICKING WRONG CHOICE SO WE ENDED THIS!");
                    System.exit(0);
                }
                break;
            }
        }
        if(i==s.size())
            {
                System.out.println("Enter Student Name");
                in.nextLine();
                name=in.nextLine();
            }
        System.out.println("Enter Student Course");
        String course=in.nextLine();
        System.out.println("Enter Student Contact Number");
        String contact=in.nextLine();
        System.out.println("Enter Student Email");
        String email=in.nextLine();
        System.out.println("Enter Student Parents Name");
        String parents=in.nextLine();
        System.out.println("Enter Student Age");
        int age=in.nextInt();
        Student s1=new Student(name,rollno,course,contact,email,parents,age);
        s.add(s1);
        System.out.println("STUDENT ADDED SUCCESSFULLY!!");
        System.out.println();
    }
    public static void editstudent()
    {
        System.out.println("Enter Roll Number of Student to Edit");
        int rollno=in.nextInt();
        in.nextLine();
        int i;
        for(i=0;i<s.size();i++)
        {
            if(s.get(i).rollno==rollno)
            {
                System.out.println("Enter Student Name");
                 s.get(i).name=in.nextLine();
                System.out.println("Enter Student Course");
                s.get(i).course=in.nextLine();
                System.out.println("Enter Student Contact Number");
                s.get(i).contact=in.nextLine();
                System.out.println("Enter Student Email");
                s.get(i).email=in.nextLine();
                System.out.println("Enter Student Parents Name");
                s.get(i).parents=in.nextLine();
                System.out.println("Enter Student Age");
                s.get(i).age=in.nextInt();
                System.out.println("UPADTE SUCCESSFULLY!!");
                System.out.println();
                break;
            }
        }
        if(i==s.size())
        {
            System.out.println("Student Not Found");
            int c;
            System.out.println("NOW YOU HAVE TWO OPTIONS:- ");
            System.out.println("1.Try again:-");
            System.out.println("2.Main menu");
            c=in.nextInt();
            if(c==1)
            {
                editstudent();
            }
            else if(c==2)
            {
                return;
            }
            else
            {
                System.out.println("INVALID CHOICE! NOW CAN'T SEARCH STUDENT!");
            }
        }
    }
    public static void searchstudent()
    {
        System.out.println("Enter Student Roll Number to be Searched:- ");
        int rollno=in.nextInt();
        int i;
        for(i=0;i<s.size();i++)
        {
            if(s.get(i).rollno==rollno)
            {
                System.out.println("Student Name:- "+s.get(i).name); 
                System.out.println("Student Roll Number:- "+s.get(i).rollno); 
                System.out.println("Student Course:- "+s.get(i).course); 
                System.out.println("Student Contact Number:- "+s.get(i).contact); 
                System.out.println("Student Email:- "+s.get(i).email); 
                System.out.println("Student Parents Name:- "+s.get(i).parents); 
                System.out.println("Student Age:- "+s.get(i).age);
                System.out.println();
                break;
            }
        }
        if(i==s.size())
        {
            System.out.println("Student Not Found!!");
            int c;
            System.out.println("NOW YOU HAVE TWO OPTIONS:- ");
            System.out.println("1.Try again!!");
            System.out.println("2.Main Menu!!");
            c=in.nextInt();
            if(c==1)
            {
                searchstudent();
            }
            else if(c==2)
            {
                return;
            }
            else
            {
                System.out.println("INVALID CHOICE! NOW CAN'T SEARCH STUDENT!");
            }
        }
    }
    public static void removestudent()
    {
        System.out.println("Enter Student Roll Number to be Removed:- ");
        int rollno=in.nextInt();
        int i;
        for(i=0;i<s.size();i++)
        {
            if(s.get(i).rollno==rollno)
            {
                System.out.println("ARE YOU SURE TO REMOVE STUDENT DATA??");
                int x;
                System.out.println("1.YES");
                System.out.println("2.NO");
                x=in.nextInt();
                if(x==1)
                {
                    s.remove(i);
                    System.out.println("STUDENT DATA REMOVED SUCCESSFULLY!!");
                }
                else if(x==2)
                {
                    return;
                }
                else
                {
                    System.out.println("INVALID CHOICE! NOW CAN'T REMOVE STUDENT!");
                }
                return;
            }
            }
            if(i==s.size())
            {
                System.out.println("Student Not Found!!");
                int c;
                System.out.println("There is Two Option for you:- ");
                System.out.println("1.Try Again!!");
                System.out.println("2.Main Menu!!");
                c=in.nextInt();
                if(c==1)
                {
                    removestudent();
                }
                else if(c==2)
                {
                    return;
                }
                else
                {
                    System.out.println("INVALID CHOICE!");
                }
        }
    }
    public static void  displaystudent()
    {
        int i;
        for(i=0;i<s.size();i++)
        {
            System.out.println("\n----------------------------\n");
            System.out.println(s.get(i));
            System.out.println("\n----------------------------\n");
        }
        if(i==0)
        {
            System.out.println("STUDENT LIST IS EMPTY!!");
            System.out.println();
        }
    }
}