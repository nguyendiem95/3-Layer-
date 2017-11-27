/**
 * 
 */
package java_buoi1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;

/**
 * @author User
 * @time:1:42:29 PM
 * @Date Nov 21, 2017
 * @Year:2017
 * @Description
 */
public class GetStudent {
    
    public static final String FIRST_NAME[] = {"Nguyen", "Cao", "Vu", "Tran", "Mai", "Khong", "Le"};
    public static final String MIDDLE_NAME[] = {"Thi", "Mai", "Van", "Thu", "Manh", "Kim", "Như"};
    public static final String LAST_NAME[] = {"Diem", "Trang", "Huong", "Thuy", "Truong", "Khoi", "Oanh"};
    private String fullNames[] = new String[10];
    private String idStudent[] = new String[10]; 
    private String birthdays[] = new String[10]; 
    private StudentMark[] studentMark = new StudentMark[50];
    private Student[] students = new Student[10];
    private int sizeOfStudentMark = -1;
    private float[] avgStudents = new float[10];
    
    /**
     * @Description: random Name Student from array 
     * @Author: User CMC SOFT
     * @Creat date: 1:43:19 PM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void createName() {
        int dem = 0;
        Random random = new Random();
        while (dem < 10) {
          String randomFirstName = FIRST_NAME[random.nextInt(7)];
          String randomMidName = MIDDLE_NAME[random.nextInt(7)];
          String randomLastName = LAST_NAME[random.nextInt(7)];
          String nameStudent = randomFirstName + " " + randomMidName + " " + randomLastName;
          boolean isCheck = true;
          if ( dem != 0 ) {
            for ( int i = 0; i < dem; i++ ) {
              if ( nameStudent.equals(fullNames[i]) )
                isCheck = false;
            }
          }
          if ( isCheck == true ) {
            fullNames[dem] = nameStudent;
            dem++;
          }
        }
    }
    
    /**
     * @Description: random number from about min, max
     * @Author: User CMC SOFT
     * @Creat date: 2:44:15 PM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     * @param args1: number min
     * @param args2: number max
     * @return number: value random for min -> max
     */
    public int rand( int min, int max ) {
      Random random = new Random();
      int range = max - min + 1;
      int randomNum = min + random.nextInt(range);
      return randomNum;
    }
    
    /**
     * @Description: create IdStudent use random id for (1000000 -> 9999999) 
     * @Author: User CMC SOFT
     * @Creat date: 2:47:21 PM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void createId() {
      int idStudents[] = new int[10]; 
      int dem = 0;
      while (dem < 10) {
        int randomId = rand(1000000, 9999999);
        boolean isCheck = true;
        if (dem != 0) {
          for (int i = 0; i < dem; i++) {
            if ( randomId == idStudents[i] )
              isCheck = false;
          }
        }
        if(isCheck == true) {
          idStudents[dem] = randomId;
          dem++;
        }
      }
      for (int i = 0; i < 10; i++) 
        idStudent[i] = "HV"+idStudents[i];
    }
    
    /**
     * @Description: create birthday Student use random with condition Each student has a different birth date
     * @Author: User CMC SOFT
     * @Creat date: 4:11:03 PM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void createBirthday() {
      SimpleDateFormat dfDateTime  = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
      int dem = 0;
      while (dem < 10) {
        int year = 1991;
        int month = rand(1, 11);
        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = rand(1, gc.getActualMaximum(gc.DAY_OF_MONTH));
        gc.set(year, month, day);
        String birthday = dfDateTime.format(gc.getTime());
        boolean isCheck = true;
        if ( dem != 0 ) {
          for ( int i = 0; i < dem; i++ ) {
            if ( birthday.equals(birthdays[i]) )
              isCheck = false;
          }
        }
        if ( isCheck == true ) {
          birthdays[dem] = birthday;
          dem++;
        }
      }
    }
    
    /**
     * @Description: swap 2 values in array
     * @Author: User CMC SOFT
     * @Creat date: 8:21:46 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void swap(int arr[], int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    /**
     * @Description: 
     * @Author: User CMC SOFT
     * @Creat date: 8:46:31 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     * @param args:
     */
    public void mix(int arr[], int count) {
      int a, b;
      Random rd = new Random();
      for (int i = 1; i <= count; i++) {
        a = rd.nextInt(10);
        b = rd.nextInt(10);
        while (b == a) {
          b = rd.nextInt(10);
        }
        swap(arr, a, b);
      }
    }
    
    /**
     * @Description: create point use random point and create point for Student
     * @Author: User CMC SOFT
     * @Creat date: 8:22:21 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void creatPoint(String subject) {
      int pointOfSubject[] = new int[10];
      int sizeOfPointSubject = -1;

      int point = rand(8, 10);
      pointOfSubject[++sizeOfPointSubject] = point;

      for (int i = 1; i <= 3; i++) {
        point = rand(5, 7);
        pointOfSubject[++sizeOfPointSubject] = point;

      }
      for (int i = 4; i <= 6; i++) {
        point = rand(3, 4);
        pointOfSubject[++sizeOfPointSubject] = point;
      }
      for (int i = 7; i <= 8; i++) {
        point = rand(1, 2);
        pointOfSubject[++sizeOfPointSubject] = point;
      }

      pointOfSubject[++sizeOfPointSubject] = 0;

      mix(pointOfSubject, 3);
      for (int i = 0; i < 10; i++) {
        studentMark[++sizeOfStudentMark] = new StudentMark(sizeOfStudentMark, students[i], subject, pointOfSubject[i]);
      }
    }
    
    
    /**
     * @Description: create Student from create idStudent, fullName, birthday
     * @Author: User CMC SOFT
     * @Creat date: 8:24:14 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     * @param args:
     */
    public void creatStudent() {
      for (int i = 0; i < 10; i++) {
        students[i] = new Student(idStudent[i], fullNames[i], birthdays[i]);
      }
    }
    
    /**
     * @Description:
     * @Author: User CMC SOFT
     * @Creat date: 7:50:17 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     * @param args:
     */
    private void sort(float avg[], int arrRa[], int arrRd[], int arrCp[], int arrCut[], int arrFml[]) {
      for (int i = 1; i < avg.length; i++) {
        int index = i;
        while (index > 0 && avg[index - 1] < avg[index]) {
          //Swap 2 number
          float temp = avg[index];
          avg[index] = avg[index - 1];
          avg[index - 1] = temp;
          swap(arrRd, index, index-1);
          swap(arrCp, index, index-1);
          swap(arrCut, index, index-1);
          swap(arrRa, index, index-1);
          swap(arrFml, index, index-1);
          index--;
        }
       }
    }

    /**
     * @Description: show information for Students
     * @Author: User CMC SOFT
     * @Creat date: 8:25:35 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     */
    public void showStudents() {
      System.out.printf("%-25s%-20s%-20s%-15s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Full Name", "ID", "Date", "RA", "SD", "CP",
          "CUT", "FMT", "AVG","RANK");
      int arrRa[] = new int[10];
      int arrSd[] = new int[10];
      int arrCp[] = new int[10];
      int arrCut[] = new int[10];
      int arrFmt[] = new int[10];
      for (int i = 0; i < 10; i++) {
        arrRa[i] =studentMark[i].getPoint();
        arrSd[i] =studentMark[i + 10].getPoint();
        arrCp[i] =studentMark[i + 20].getPoint();
        arrCut[i] =studentMark[i + 30].getPoint();
        arrFmt[i] =studentMark[i + 40].getPoint();
      }
      
      for (int i = 0; i < 10; i++) {
        avgStudents[i] = (studentMark[i].getPoint() + 
                          studentMark[i + 10].getPoint() + 
                          studentMark[i + 20].getPoint() + 
                          studentMark[i + 30].getPoint() + 
                          studentMark[i + 40].getPoint())/(float)5;
      }
      sort(avgStudents, arrRa, arrSd, arrCp, arrCut, arrFmt);
      for (int i = 0; i < 10; i++) {
        System.out.printf("%-25s%-20s%-20s%-15s%-10s%-10s%-10s%-10s%-10s%-10s%n",
            studentMark[i].getSudentId().getName().toString(), 
            studentMark[i].getSudentId().getStudentId(),
            studentMark[i].getSudentId().getBirthday(), 
            arrRa[i], arrSd[i], arrCp[i], arrCut[i], arrFmt[i], avgStudents[i], i+1);
      }
    }
    
    /**
     * @Description: run programming and print Students and point of Student and avg point
     * @Author: User CMC SOFT
     * @Creat date: 8:26:23 AM
     * @Modifier:
     * @Modifined date:
     * @Exception: 
     * @param args:
     */
    public static void main(String []arg) {
      GetStudent gt = new GetStudent();
      gt.createName();
      gt.createId();
      gt.createBirthday();
      gt.creatStudent();
      gt.creatPoint("RA");
      gt.creatPoint("SD");
      gt.creatPoint("CP");
      gt.creatPoint("CUT");
      gt.creatPoint("FMT");
      gt.showStudents();
    }
   
}
