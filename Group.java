import Exceptions.MyException;

import java.util.Arrays;

public class Group {
    private int length = 10;
    private Student []group = new Student[length];

    public Group(int length, Student[] group) {
        this.length = length;
        this.group = group;
    }

    public Group() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public void addStudent(Student student) throws MyException, IllegalArgumentException{
        if(student==null){
            throw new IllegalArgumentException("Student doesn`t exist.");
        }
        for(int i = 0; i < group.length; i++){
            if(group[i]==null){
                group[i] = student;
                return;
            }
        }
        throw new MyException("You can`t add 11 student.");
    }

    public boolean removeStudent(int number){
        for(int i = 0; i < group.length; i++){
            if(group[i].getNumberOfRecordBook()==(number) && group[i]!= null){
                group[i]=null;
                return true;
            }
        }
        return false;
    }

    public Student search(String surname){
        for(int i = 0; i < group.length; i++){
            if(group[i]!=null && group[i].getSurname().equals(surname)){
                return group[i];
            }
        }
        return null;
    }

    public void sortAlphabet(){
        for(int i = group.length - 1; i >= 1 ; i--){
            for(int j = 0; j < i; j++){
                if( compareTwoSurnames(group[j], group[j+1])> 0){
                    Student temp = group[j];
                    group[j] = group[j+1];
                    group[j+1] = temp;
                }
            }
        }
    }

    public int compareTwoSurnames(Student st1, Student st2){
        if(st1 == null && st2 != null){
            return 1;
        }
        if((st1 == null && st2 == null) || (st1 != null && st2 == null)){
            return 0;
        }
        return st1.getSurname().compareTo(st2.getSurname());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: \n");
        sortAlphabet();
        for(Student st: group){
            if(st==null){
                break;
            }
            sb.append(st);
            sb.append("\n");
        }
        return sb.toString();
    }
}
