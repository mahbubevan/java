class Start{
  public static void main(String []args){
      Coordinate c1 = new Coordinate();
      Coordinate c2 = new Coordinate();

      c1.setLatitude(125.89);
      c1.setLongitude(983.09);
      c2.setLatitude(237.23);
      c2.setLongitude(342.90);

      Airport a1 = new Airport();
      Airport a2 = new Airport();

      a1.setId(1);
      a1.setName("Hazrat Shahjalal International Airport");
      a1.setLocation(c1);
      a2.setId(2);
      a2.setName("Kolkata International Airport");
      a2.setLocation(c2);

      Employee e1 = new Employee();

      e1.setId(1);
      e1.setName("Evan");
      e1.setDesignation("Pilot");

      Schedule s1 = new Schedule();
      Schedule s2 = new Schedule();

      s1.setHour(2);
      s1.setMinute(30);
      s2.setHour(8);
      s2.setMinute(45);

      Flight f = new Flight();

      f.setId(1);
      f.setName("Bravo 707");
      f.setCapacity(700);
      f.setPilot(e1);
      f.setFrom(a1);
      f.setTo(a2);
      f.setDeparture(s1);
      f.setArrival(s2);

      System.out.println(f.getId()+" "+f.getName()+" "+f.getCapacity()+" "+f.getPilot().getName());
  }
}
