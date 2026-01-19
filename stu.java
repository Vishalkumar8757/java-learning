class stu{
  private String enroll;
  private int sid;
  private char section;
  private int p;
  private int c;
  private int m;
  private int h;
  private int e;
  private String course;
  private String branch;
  private String name;

    public String getName(){
    return name;
    } 

    public void setName(String n){
    name = n;
    }

    public String getBranch(){
    return branch;
    } 

    public void setBranch(String b){
    branch = b;
    }

    public String getCourse(){
    return course;
    } 

    public void setCourse(String c){
    course = c;
    }

    public String getEnroll(){
    return enroll;
    } 

    public void setEnroll(String e){
    enroll = e;
    }
    
    public char getSection(){
    return section;
    } 

    public void setSection(char s){
    section = s;
    }

    public int getSid(){
    return sid;
    } 

    public void setSid(int s){
    sid = s;
    }

    public int getP(){
    return p;
    } 

    public void setP(int p1){
    p = p1;
    }

    public int getC(){
    return c;
    } 

    public void setC(int c1){
    c = c1;
    }

    public int getM(){
    return m;
    } 

    public void setM(int m1){
    m = m1;
    }
    
    public int getH(){
    return h;
    } 

    public void setH(int h1){
    h = h1;
    }

    public int getE(){
    return e;
    } 

    public void setE(int e1){
    e = e1;
    }

        public static void main(String args[]){
            stu s = new stu();
            s.setName("vishal");
            System.out.println("name :"+s.getName());

            s.setBranch("cse");
            System.out.println("name :"+s.getBranch());

            s.setCourse("btech");
            System.out.println("name :"+s.getCourse());

            s.setEnroll("0312cs221117");
            System.out.println("name :"+s.getEnroll());

            s.setSection('A');
            System.out.println("name :"+s.getSection());

            s.setSid(101);
            System.out.println("name :"+s.getSid());

            s.setP(98);
            System.out.println("name :"+s.getP());

            s.setC(89);
            System.out.println("name :"+s.getC());

            s.setM(86);
            System.out.println("name :"+s.getM());

            s.setH(100);
            System.out.println("name :"+s.getH());

            s.setE(99);
            System.out.println("name :"+s.getE());

            

            
            
        }






    




}