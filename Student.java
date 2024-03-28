package School;

public class Student {
   private String myname;
   private int idnum;
   public Student(String name, int ID){
        this.myname = name;
        this.idnum = ID;
    }

    private void changeName(String newName){
       this.myname = newName;
    }
    @Override
    public String toString() {
       return "Name: " + myname + ", ID: " + idnum;
    }

}

