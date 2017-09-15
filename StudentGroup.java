import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation{

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students)throws IllegalArgumentException
 {
		// Add your implementation here
                System.out.println("Enter id:");
                Scanner in = new Scanner();
                int id=in.nextInt();
                System.out.println("Enter full name");
                String fname=in.nextLine();
                System.out.println("Enter Date:");
Date date;
String line = scanner.nextLine();
    try {
        date = format.parse(line);
    } catch (ParseException e) {
        System.out.println("Sorry, that's not valid. Please try again.");
    }
System.out.println("Enter average marks ");

double avgmrks=in.nextDouble();

                Student stu = new Student(id,fname,date,avgmrks);
                if(stu==null)
                throw new IllegalArgumentException();
                else{
                int ind=students.length();
                students[ind]=stu;     
}                                        
	}

	@Override
	public Student getStudent(int index)throws IllegalArgumentException {
		// Add your implementation here
                if(index<0||index>students.length()-1)
                throw new IllegalArgumentException();
                
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
                if(student==null)
                 throw new IllegalArgumentException();
                if(index<0||index>students.length()-1)
                throw new IllegalArgumentException();
                students[index]=student;

                
	}

	@Override
	public void addFirst(Student student)throws IllegalArgumentException {
		// Add your implementation here
                 if(student==null)
                 throw new IllegalArgumentException();
                 Student[] temp;
                 for(int i=0;i<students.length;i++)
                    temp[i]=students[i];
                  students[0]=student;
                 int i=0;
                 for(int j=1;j<=students.length;j++)
                   {
                      students[j]=temp[i];
                       i++;
                      }
	}

	@Override
	public void addLast(Student student)throws IllegalArgumentException  {
		// Add your implementation here
                 if(student==null)
                 throw new IllegalArgumentException();    
                 students[students.length]=student;
               
	}

	@Override
	public void add(Student student, int index)throws IllegalArgumentException{
		// Add your implementation here
                if(student==null)
                 throw new IllegalArgumentException();
                if(index<0||index>students.length()-1)
                throw new IllegalArgumentException();
                students[index]=student;

	}

	@Override
	public void remove(int index)throws IllegalArgumentException {
		// Add your implementation here
                  if(index<0||index>students.length()-1)
                throw new IllegalArgumentException();
                Student temp[];
int j=0;
                for(int i= 0;i<students.length;i++)
                {    if(i!=index)
                      temp[j]=student[i];
                      students[i]=null;
                 }
                for(int k=0;k<temp.length;k++)
                 students[k]=temp[k];

	}

	@Override
	public void remove(Student student)throws IllegalArgumentException {
		// Add your implementation here
           if(student==null)
                 throw new IllegalArgumentException("Student not exist");
                Student temp[];
              int j=0;
                for(int i= 0;i<students.length;i++)
                {    if(students[i].comparTo(student)!=0)
                      temp[j++]=student[i];
                      students[i]=null;
                 }
                for(int k=0;k<temp.length;k++)
                 students[k]=temp[k];
	}

	@Override
	public void removeFromIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
                  if(index<0||index>students.length-1)
                throw new IllegalArgumentException();
                for(int i=0;i<students.length;i++)
                 {
                   if(i>index)
                   students[i]=null;
}
	}

	@Override
	public void removeFromElement(Student student)throws IllegalArgumentException {
		// Add your implementation here
                  int removeIndex;
                  if(student==null)
                  throw new IllegalArgumentException();
                 for(int i=0;i<students.length;i++)
                  {
                      if(students[i].campareTo(student)==0)
                      { removeIndex=i+1;
                       break;    }
                      }
                 for(j=removeindex;j<students.length;j++)
                     students[j]=null;

	}

	@Override
	public void removeToIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
               if(index<0||index>students.length-1)
                throw new IllegalArgumentException();
                Student[] temp;
                int j=0;
               for(i=index+1;i<student.length;i++)
                {    temp[j]=students[i];
                       j++;
                 }
               for(int k=0;k<student.length;k++)
                students[k]=null;
               for(int x=0;x<temp.length;x++)
                 students[x]=temp[x];
	}

	@Override
	public void removeToElement(Student student)throws IllegalArgumentException {
		// Add your implementation here
                    if(student==null)
                  throw new IllegalArgumentException();
                  int removeindex;
                  Student[] temp;
                 for(int i=0;i<students.length;i++)
                  {
                      if(students[i].compareTo(student)==0)
                        removeindex=i+1;
                       }
                int j=0;
               for(i=index+1;i<student.length;i++)
                {    temp[j]=students[i];
                       j++;
                 }
               for(int k=0;k<student.length;k++)
                students[k]=null;
               for(int x=0;x<temp.length;x++)
                 students[x]=temp[x];


              
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
         int n = students.length();  
        Student temp = null;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(students[j-1].compareTo(students[j])){  
                                 //swap elements  
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                         }  
                          
                 }  
         }  
	}

	@Override
	public Student[] getByBirthDate(Date date)throws IllegalArgumentException {
		// Add your implementation here
                 if(date == null)
                 throw new IllegalArgumentException();
                 Student[] temp;
                 int j=0;
                 for(i=0;i<students.length;i++)
                 {
                    if((students[i].birthdate).compareTo(date)==0)
                     temp[j++]=students[i];
                  }

		return temp;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate)throws IllegalArgumentException {
		// Add your implementation here
                 if(firstdate == null || lastdate == null)
                 throw new IllegalArgumentException();
                   int j=0;
                    Student[] temp;
                  for(int i=0;i<students.length;i++)
                   {
                     if((students[i].firstdate).compareTo(date)>0 && (students[i].lastdate).compareTo(date)<0)
                     temp[j++]=students[i];
                       }
		return temp;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)throws IllegalArgumentException  {
		// Add your implementation here
                 if(date == null)
                 throw new IllegalArgumentException();
                  int j=0;
                    Student[] temp;
                 for(int i=0;i<students.length;i++)
                  {
                        if(students[i].birthdate.compareTo(date)>0||students[i].birthdate.getDate<=days)
                               temp[j++]=students[i];                      
 }

		return temp;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent)throws IllegalArgumentException {
		// Add your implementation here
                 if (indexOfStudent == 0)
                 throw new IllegalArgumentException();
                 int age=2017 - (students[indexOfStudent].birthdate.getYear());
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
                 Student[ ] temp;
                 int j=0;
                for(int i=0;i<students.length;i++)
                 {
                      if (age== (2017-students[i].birthdate.getYear()))
                         temp[j++]=students[i];
                       }
		return temp;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                 double maxmarks=0;
                  for(int i=0;i<students.length;i++)
                   {     
                          if(students[i].avgMark>maxmarks)
                           maxmarks=students[i].avgMark;
                       }
                   Student[ ] temp;
                 int j=0;
                 for(int k=0;k<students.length;k++)
                    {  
                          if(students[k].avgMark==maxmarks)
                               temp[j++]=students[k];
                            }
		return temp;
	}

	@Override
	public Student getNextStudent(Student student)throws IllegalArgumentException {
		// Add your implementation here
                 if (student == null)
                   throw new IllegalArgumentException();
                  
                       Student next;
                  for(int i=0;i<students.length;i++)
                   {
                      if(students[i].compareTo(student)==0)
                          next = students[i+1];        
                             }
		return next;
	}
}
