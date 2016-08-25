package com.example.naman.stayuncleprototype;

/**
 * Created by Naman on 22-08-2016.
 */

public class Hotel_Details_POJO
{

    public static class HotelDetails
    {
        String hotelName;
       // String state;
        String address;
      //  String locality;
        int imageId;

        int rent;



        Boolean wifi;
        Boolean food;
        Boolean parking;
        Boolean swimming;
        Boolean ac;

        public HotelDetails(int imageId, String hotelName, String address,
                            Boolean wifi, Boolean food, Boolean parking,Boolean swimming, int rent)
        {
            this.hotelName = hotelName;
        //    this.state = state;
            this.address = address;
         //   this.locality = locality;
            this.imageId = imageId;
            this.wifi = wifi;
            this.food = food;
            this.parking = parking;
            this.swimming = swimming;
            this.rent=rent;
          //  this.ac = ac;
        }



        public String getHotelName() {
            return hotelName;
        }

      /*  public String getState() {
            return state;
        }
*/
        public String getAddress() {
            return address;
        }

     /*   public String getLocality() {
            return locality;
        }*/

        public int getImageId() {
            return imageId;
        }

        public Boolean getWifi() {
            return wifi;
        }

        public Boolean getFood() {
            return food;
        }

        public Boolean getParking() {
            return parking;
        }

        public Boolean getSwimming() {
            return swimming;
        }

        public Boolean getAc() {
            return ac;
        }

        public int getRent(){return rent;}
    }
}
