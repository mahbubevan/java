class Employee{
  private int id;
  private String name;
  private String designation;

  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setDesignation(String designation){
    this.designation = designation;
  }

  public int getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  public String getDesignation(){
    return this.designation;
  }
}
