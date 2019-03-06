class Coordinate{
      private double latitude;
      private double longitude;

      public void setLatitude(double latitude){
        this.latitude = latitude;
      }
      public void setLongitude(double longitude){
        this.longitude = longitude;
      }

      public double getLatitude(){
        return this.latitude;
      }
      public double getLongitude(){
        return this.longitude;
      }
      //
      //
      // public static void main(String a[]){
      //     Coordinate c = new Coordinate();
      //     c.setLatitude(172);
      //     c.setLongitude(180);
      //     System.out.println("Latitude is "+c.getLatitude()+" Longitude is "+c.getLongitude());
      // }
}
